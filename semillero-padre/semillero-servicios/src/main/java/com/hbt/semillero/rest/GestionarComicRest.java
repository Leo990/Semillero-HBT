package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dtos.ComicDTO;
import com.hbt.semillero.dtos.ConsultarNombrePrecioComicDTO;
import com.hbt.semillero.dtos.ResultadoDTO;
import com.hbt.semillero.poo.interfaces.IGestionarComicLocal;

@Path("/gestionarComicRest")
public class GestionarComicRest {
    
    @EJB
    private IGestionarComicLocal gestionarComicLocal;

    @GET
    @Path("/consultarNombrePrecioComic")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ConsultarNombrePrecioComicDTO consultarNombrePrecioComic(@QueryParam("idComic") Long idComic){
        return this.gestionarComicLocal.consultarNombrePrecio(idComic);
    }

    public ResultadoDTO crearComic(ComicDTO comicDTO){
        ResultadoDTO resultadoDTO = new ResultadoDTO();

        try {
            resultadoDTO = this.gestionarComicLocal.crearComic(comicDTO);
        } catch (Exception e) {
            // TODO: handle exception
            resultadoDTO.setExitoso(true);
            resultadoDTO.setMensajeEjecucion(e.getMessage());
        }

        return resultadoDTO;
    }
}
