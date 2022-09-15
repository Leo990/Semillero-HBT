package com.hbt.semillero.dtos;

import com.hbt.semillero.util.JsonUtils;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/* (non-Javadoc)
 * @see com.hbt.semillero.dtos.ResultadoDTO#toString()
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ComicRequiredDTO extends ResultadoDTO{
	private String nombre;
	
	private String editorial;
	
	private String coleccion;
	
	private short numeroDePaginas;
	
	private BigDecimal precio;
	
	private short cantidad;

    @Override
    public String toString(){
        return JsonUtils.toStringJson(this);
    }
}
