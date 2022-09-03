package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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

    @POST
    @Path("/agregarComic")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultadoDTO crearComic(ComicDTO comicDTO){
        ResultadoDTO resultadoDTO = new ResultadoDTO();

        try {
            resultadoDTO = this.gestionarComicLocal.crearComic(comicDTO);
        } catch (Exception e) {
            resultadoDTO.setExitoso(true);
            resultadoDTO.setMensajeEjecucion(e.getMessage());
        }

        return resultadoDTO;
    }

    @PUT
    @Path("/actualizarComic")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultadoDTO actualizarComic(@QueryParam("idComic") Long idComic, ComicDTO comicDTO){
        return this.gestionarComicLocal.actualizarComic(idComic, comicDTO);
    }
    
    @DELETE
    @Path("/eliminarComic")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResultadoDTO eliminarComic(@QueryParam("idComic") Long idComic){
        return this.gestionarComicLocal.eliminarComic(idComic);
    }

}
