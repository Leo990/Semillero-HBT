import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ResultadoDTO } from '../dto/resultado-dto';
import { CompraDTO } from '../dto/compra.dto';

const BASE_URL : string = 'localhost:8085/semillero-servicios/rest/gestionarCompraComic/comprarComic'
@Injectable({
  providedIn: 'root'
})
export class GestionarCompraComicsService {
  constructor(private httpClient : HttpClient) { }

  public comprarComic(compraDTO : CompraDTO) : Observable<ResultadoDTO> {
    return this.httpClient.post<ResultadoDTO>(BASE_URL, compraDTO);
  }
}
