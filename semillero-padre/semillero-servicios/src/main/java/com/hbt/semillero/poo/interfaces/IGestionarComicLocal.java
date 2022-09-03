package com.hbt.semillero.poo.interfaces;

import com.hbt.semillero.dtos.ComicDTO;
import com.hbt.semillero.dtos.ConsultarNombrePrecioComicDTO;
import com.hbt.semillero.dtos.ResultadoDTO;

public interface IGestionarComicLocal {
    ConsultarNombrePrecioComicDTO consultarNombrePrecio(Long idComic);
    public ResultadoDTO crearComic(ComicDTO comic) throws Exception;
    public ResultadoDTO actualizarComic(Long idComic, ComicDTO comic);
    public ResultadoDTO eliminarComic(Long idComic);
}
