package com.hbt.semillero.poo.exceptions;

/**
 * <b>Descripción:<b> Excepcion que controla cuando una longitud es mayor a la
 * solicitada
 * 
 * <b>Caso de Uso:<b> CUTSR
 * 
 * @author Leonardo Sanchez Camacho
 * @version 1.0
 */
public class InvalidLengthException extends Exception {
    /**
     * <b>Descripción:<b> Constructor de clase
     * 
     * <b>Caso de Uso:<b> CUTSR
     * 
     * @author Leonardo Sanchez Camacho
     * @version 1.0
     */
    public InvalidLengthException(String message) {
        super(message);
    }
}
