package com.hbt.semillero.dtos;

import java.util.List;

import com.hbt.semillero.util.JsonUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <b>Descripción:<b> Clase que determina el formato de entrega de los
 * resultados del servicio REST
 * 
 * <b>Caso de Uso:<b> CUTSR
 * 
 * @author Leonardo Sanchez Camacho
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultarComicTamanioNombreDTO extends ResultadoDTO {
    private List<String> comicNoSuperanTamanio;
    private List<String> comicSuperanTamanio;

    /**
     * 
     * @return Lista de <strong>comics</strong> que no superan el tamaño del nombre
     *         segun valor dado
     */
    public List<String> getComicNoSuperanTamanio() {
        return this.comicNoSuperanTamanio;
    }

    /**
     * 
     * @param comicNoSuperanTamanio Lista de <strong>comics</strong> que no superan
     *                              el tamaño segun valor dado
     */
    public void setComicNoSuperanTamanio(List<String> comicNoSuperanTamanio) {
        this.comicNoSuperanTamanio = comicNoSuperanTamanio;
    }

    /**
     * 
     * @return Lista de <strong>comics</strong> que superan el tamaño del nombre
     *         segun valor dado
     */
    public List<String> getComicSuperanTamanio() {
        return this.comicSuperanTamanio;
    }

    /**
     * 
     * @param comicSuperanTamanio Lista de <strong>comics</strong> que no superan el
     *                            tamaño segun valor dado
     */
    public void setComicSuperanTamanio(List<String> comicSuperanTamanio) {
        this.comicSuperanTamanio = comicSuperanTamanio;
    }

    /**
     * <b>Descripción:<b> Metodo que retorna la clase en una representacion en
     * cadena de caracteres.
     * 
     * @author Leonardo Sanchez Camacho
     * @version 1.0
     */
    @Override
    public String toString() {
        return JsonUtils.toStringJson(this);
    }

}
