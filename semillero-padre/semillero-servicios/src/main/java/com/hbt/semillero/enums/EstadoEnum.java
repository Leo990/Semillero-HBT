package com.hbt.semillero.enums;

/**
 * 		
 * <b>Descripción:<b> Enumerador que determina el estado de los comics
 * <b>Caso de Uso:CUTA<b> 
 * @author Leonardo Sanchez Camaccho
 * @version 1.0
 */
public enum EstadoEnum {
    DISPONIBLE("activo"),
    NO_DISPONIBLE("inactivo"),;

    private String etiqueta;

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    EstadoEnum(String etiqueta){
        this.etiqueta = etiqueta;
    }
}
