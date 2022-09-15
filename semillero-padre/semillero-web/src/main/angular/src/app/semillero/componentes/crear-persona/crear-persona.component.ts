import { Component, OnInit } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';
import { ComicDTO } from '../../dto/comic.dto';
import { EstadoEnum } from './enums/estado.enum';
import { TematicaEnum } from './enums/tematica.enum';

@Component({
  selector: 'crear-persona',
  templateUrl: './crear-persona.component.html',
  styleUrls: ['./crear-persona.component.css']
})
export class CrearPersonaComponent implements OnInit {

  public saludo : any;
  public saludo2 : any;
  public comics : Array<any>;
  public comicsTematicaHorror : Array<ComicDTO>;
  public comicsTematicaHumoristico : Array<ComicDTO>;
  public imagen : any;

  constructor(public translate: TranslateService) {
    translate.addLangs(['es', 'en']);
    translate.setDefaultLang('es');
    translate.use('es'); 
   }

  ngOnInit() {
    this.saludo = "Hola semillero 2022";
    this.saludo2 = {mensaje: "DIEGO ALVAREZ"};
    this.comics = this.crearComic();
    let url = "https://alfabetajuega.com/hero/2022/09/Goku-y-Superman-intercambian-sus-trajes-en-esta-version-alternativa-que-te-encantara.jpg?width=768&aspect_ratio=16:9&format=nowebp";
    let heigth : number = 500;
    let width = 700;
    this.imagen = this.asignarImagen(url, heigth, width);

    let comics = new Map<string,Array<ComicDTO>>();

    this.comicsTematicaHorror = new Array<ComicDTO>()
    //let comicBatman = new ComicDTO("Batman", TematicaEnum.HORROR, 900);
   // let comicDragonBall = new ComicDTO("Dragon Ball", TematicaEnum.HORROR, 800);

    this.comicsTematicaHumoristico = new Array<ComicDTO>()
   // let comicChavo = new ComicDTO("Chavo del 8", TematicaEnum.HUMORISTICO, 1900);
   // let comicChapulin = new ComicDTO("Chapulin colorado", TematicaEnum.HUMORISTICO, 600);

   // this.comicsTematicaHorror.push(comicBatman);
   // this.comicsTematicaHorror.push(comicDragonBall);

  //  this.comicsTematicaHumoristico.push(comicChavo);
  //  this.comicsTematicaHumoristico.push(comicChapulin);

    comics.set(TematicaEnum.HORROR, this.comicsTematicaHorror);
    comics.set(TematicaEnum.HUMORISTICO,  this.comicsTematicaHumoristico);

    let comicHumoristicos = comics.get(TematicaEnum.HUMORISTICO);
    console.log("Comics humoristicos " + JSON.stringify(comicHumoristicos));

    comics.forEach((value : Array<ComicDTO>, key : string) => {
      if(TematicaEnum.HORROR == key) {
        console.log("Lista comics horror: " + key + " " + JSON.stringify(value) );
      } else {
        console.log("Lista comics humoristico: " + key + " " + JSON.stringify(value) );
      }
      
    });

  }

  private asignarImagen(url : string, heigth : number, width : number ) : any {
    return {
      url : url,
      heigth : heigth,
      width : width
    }
  }

  private crearComic() : Array<any> {
    let listaComics : Array<any>;

    let comicSuperman : any = {
      nombre : "Superman",
      estado : EstadoEnum.ACTIVO,
      precio : 19000,
      tematica : TematicaEnum.CIENCIA_FICCION,
      fechaVenta : new Date(),
      color : true
    }

    let comicThor : any = {
      nombre : "Thor",
      estado : EstadoEnum.ACTIVO,
      precio : 17000,
      tematica : TematicaEnum.CIENCIA_FICCION,
      fechaVenta : null
    }

    let comicSpiderman : any = {
      nombre : "Spiderman",
      estado : EstadoEnum.INACTIVO,
      precio : 1000,
      tematica : TematicaEnum.HUMORISTICO,
      fechaVenta : null
    }

    listaComics = new Array<any>();
    listaComics.push(comicSuperman);
    listaComics.push(comicThor);
    listaComics.push(comicSpiderman);

    //listaComics.splice(0,1);

    return listaComics;
  }

  public mostrarDescripcionImagen() : void {
    console.log(JSON.stringify(this.imagen));
    alert("Info imagen" + JSON.stringify(this.imagen));
  }

}
