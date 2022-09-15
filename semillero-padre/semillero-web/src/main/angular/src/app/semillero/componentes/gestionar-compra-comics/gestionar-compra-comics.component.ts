import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { ActivatedRoute, Router } from "@angular/router";
import { CompraDTO } from "../../dto/compra.dto";
import { GestionarCompraComicsService } from "../../servicios/gestionar-compra-comics.service";

@Component({
  selector: "app-gestionar-compra-comics",
  templateUrl: "./gestionar-compra-comics.component.html",
  styleUrls: ["./gestionar-compra-comics.component.css"],
})
export class GestionarCompraComicsComponent implements OnInit {
  public idComic: number;
  public mensajeEjecucion: string = "";
  public isInCorrect : boolean = false;
  private gestionarCompraComicForm : FormGroup;
  constructor(
    private formBuilder: FormBuilder,
    private gcs: GestionarCompraComicsService,
    private active: ActivatedRoute,
    private router : Router
  ) {
    this.gestionarCompraComicForm = this.formBuilder.group({
      cantidad: [null, Validators.required, Validators.min(1)],
    });
  }

  ngOnInit() {
    this.idComic = <number>(<unknown>this.active.snapshot.params);
  }

  comprarComic(){
    if(this.gestionarCompraComicForm.invalid || this.gestionarCompraComicForm.invalid){
      return;
    }

    let compraDto = new CompraDTO(this.idComic, this.gestionarCompraComicForm.get('cantidad').value);

    this.gcs.comprarComic(compraDto).subscribe(resultadoDTO => {
      if(resultadoDTO.exitoso) {
          this.isInCorrect = false;
        } else {
          this.isInCorrect = true;
        this.mensajeEjecucion = resultadoDTO.mensajeEjecucion;
      }
      
      this.limpiarForm();
  }, error => {
    console.log(error);
  });

  }
  limpiarForm() {
    this.gestionarCompraComicForm.reset();
  }

  public regresar() : void {
    this.router.navigate(['gestionar-comic']);
  }
}
