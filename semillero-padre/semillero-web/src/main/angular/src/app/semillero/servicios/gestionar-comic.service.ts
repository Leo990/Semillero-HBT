import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ComicDTO } from '../dto/comic.dto';
import { ResultadoDTO } from '../dto/resultado-dto';

@Injectable({
  providedIn: 'root'
})
export class GestionarComicService {

  constructor(private httpClient : HttpClient) { }

  public obtenerComics() : Observable<any> {
    return this.httpClient.get('http://localhost:8085/semillero-servicios/rest/gestionarComicRest/obtenerComics');
  }

  public crearComic(comicDTO : ComicDTO) : Observable<ResultadoDTO> {
    return this.httpClient.post<ResultadoDTO>('http://localhost:8085/semillero-servicios/rest/gestionarComicRest/crearComic', comicDTO);
  }

  public consultarNombrePrecioComic(idComic : string) : Observable<any> {
    let parametros = new HttpParams().set("idComic", idComic);
    
    //let parametros = new HttpParams().set("idComic", JSON.stringify(comicDTO));
    //return this.httpClient.get('http://localhost:8085/semillero-servicios/rest/gestionarComicRest/consultarNombrePrecioComic?idComic=' + idComic);
    return this.httpClient.get('http://localhost:8085/semillero-servicios/rest/gestionarComicRest/consultarNombrePrecioComic', {params : parametros} );
  }

}

