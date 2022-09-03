package com.hbt.semillero.dtos;

import java.io.Serializable;

import com.hbt.semillero.util.JsonUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoDTO implements Serializable{

    private static final Long serialVersionUID = 1L;
    
    private Boolean exitoso;
    private String mensajeEjecucion;
    
    public static ComicDTO valueOf(String arg){
        return JsonUtils.valueOf(arg, ComicDTO.class);
    }

    public static Long getSerialversionuid() {
        return serialVersionUID;
    }
    
    @Override
    public String toString(){
        return JsonUtils.toStringJson(this);
    }
    
}
