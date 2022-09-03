package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dtos.ConsultarComicTamanioNombreDTO;
import com.hbt.semillero.poo.interfaces.IConsultarComicTamanioNombreLocal;

/**
 * <b>Descripción:<b> Clase que determina el servicio REST de consultar los
 * comics con nombre mayor a una longitud dada
 * 
 * <b>Caso de Uso:<b> CUTSR
 * 
 * @author Leonardo Sanchez Camacho
 * @version 1.0
 */
@Path("/taller")
public class ConsultarComicTamanioNombreRest {

    @EJB
    private IConsultarComicTamanioNombreLocal consultarComicTamanioNombreLocal;

    /**
     * <b>Descripción:<b> Metodo para consultar los comics con nombre mayor a una
     * longitud dada
     * 
     * <b>Caso de Uso:<b> CUTSR
     * 
     * @param length longitud maxima de tamaño de nombre de comic
     * @author Leonardo Sanchez Camacho
     * @version 1.0
     */
    @GET
    @Path("/consultarComicTamanioNombre")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(@QueryParam("length") Short length) {
        ConsultarComicTamanioNombreDTO dto = new ConsultarComicTamanioNombreDTO();

        try {
            return consultarComicTamanioNombreLocal.consultarComicTamanioNombre(length);
        } catch (Exception e) {
            dto.setExitoso(false);
            dto.setMensajeEjecucion(e.getMessage());
        }
        return dto;
    }
}
