package com.hbt.semillero.poo.interfaces;

import com.hbt.semillero.dtos.ConsultarComicTamanioNombreDTO;

public interface IConsultarComicTamanioNombreLocal {
    ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(Short length) throws Exception;
}
