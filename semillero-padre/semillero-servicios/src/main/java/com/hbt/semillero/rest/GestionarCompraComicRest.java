package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dtos.ResultadoDTO;
import com.hbt.semillero.poo.interfaces.IGestionarCompraComicLocal;

@Path("/gestionarCompraComic")
public class GestionarCompraComicRest {

    @EJB
    private IGestionarCompraComicLocal gestionarCompraComic;

    @POST
    @Path("/comprarComic")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultadoDTO gestionarCompra(@QueryParam("idComic") long idComic, @QueryParam("cantidadAComprar") short cantidadAComprar){
        ResultadoDTO dto = new ResultadoDTO();
        try {
            dto = gestionarCompraComic.gestionarCompra(idComic, cantidadAComprar);
        } catch (Exception e) {
            dto.setExitoso(false);
            dto.setMensajeEjecucion(e.getMessage());
        }
        return dto;
    }

}
