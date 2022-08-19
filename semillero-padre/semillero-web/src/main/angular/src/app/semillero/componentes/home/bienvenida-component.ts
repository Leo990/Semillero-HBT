import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

/**
 * @description Componente bienvenida, el cual contiene la imagen de bienvenida al semillero
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
  selector: 'bienvenida',
  templateUrl: './bienvenida-component.html',
})
export class BienvenidaComponent implements OnInit {
  
  public urlImagen : string;
  
  constructor(private router : Router, private activatedRoute: ActivatedRoute) {
    console.log("entro al constructor del componente bienvenida");
  }

  ngOnInit(): void {
    this.urlImagen = "https://scontent-bog1-1.xx.fbcdn.net/v/t39.30808-6/295881776_5286167184798479_2256696051230813250_n.png?_nc_cat=100&ccb=1-7&_nc_sid=730e14&_nc_eui2=AeHfnfL0mVZHs7EZVS1GAwvxZAHe5TOUTUxkAd7lM5RNTKGri5t8B2NdEjrfZ4_2nbs&_nc_ohc=ACGRh_Z0KqoAX_ad76P&_nc_ht=scontent-bog1-1.xx&oh=00_AT8dFo0ZFJj3FreJjKPMuN8Lsxsi06F3AY6w8rBEo3H7QQ&oe=6301FF6A";
        
  }
}