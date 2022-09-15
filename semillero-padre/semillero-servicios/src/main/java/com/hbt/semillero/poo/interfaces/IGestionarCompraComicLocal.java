package com.hbt.semillero.poo.interfaces;

import com.hbt.semillero.dtos.ResultadoDTO;

public interface IGestionarCompraComicLocal {
    ResultadoDTO gestionarCompra(long idComic, short cantidadAComprar) throws Exception;
}
