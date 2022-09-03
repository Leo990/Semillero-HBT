package com.hbt.semillero.dtos;

import java.math.BigDecimal;

import com.hbt.semillero.util.JsonUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultarNombrePrecioComicDTO extends ResultadoDTO{
    private String nombre;
    private BigDecimal precio;

    @Override
    public String toString(){
        return JsonUtils.toStringJson(this);
    }
}
