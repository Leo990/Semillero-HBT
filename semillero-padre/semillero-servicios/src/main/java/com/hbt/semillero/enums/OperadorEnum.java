package com.hbt.semillero.enums;

/**
 * 
 * <b>Descripción:<b> Enumerador que determina el operador de comparacion de
 * longitud en el bean ConsultarComicTamanioNombreBean
 * <b>Caso de Uso:CUTSR<b>
 * 
 * @author Leonardo Sanchez Camaccho
 * @version 1.0
 */
public enum OperadorEnum {
    MAYOR(">"),
    MENOR_O_IGUAL("<="),;

    private String etiqueta;

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    OperadorEnum(String etiqueta) {
        this.etiqueta = etiqueta;
    }
}
