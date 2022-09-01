package com.hbt.semillero.bean;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.hbt.semillero.dtos.ComicDTO;
import com.hbt.semillero.dtos.ConsultarNombrePrecioComicDTO;
import com.hbt.semillero.dtos.ResultadoDTO;
import com.hbt.semillero.entity.Comic;
import com.hbt.semillero.poo.interfaces.IGestionarComicLocal;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarComicBean implements IGestionarComicLocal {

    private final static Logger LOGGER = Logger.getLogger(GestionarComicBean.class);

    @PersistenceContext
    private EntityManager em;

    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public ConsultarNombrePrecioComicDTO consultarNombrePrecio(Long idComic) {
        // TODO Auto-generated method stub
        LOGGER.info("Inicia operacion consultarNombrePrecio()");
        ConsultarNombrePrecioComicDTO dto = new ConsultarNombrePrecioComicDTO();
        String consultaNombrePrecioComic = "SELECT new com.hbt.semillero.dtos.ConsultarNombrePrecioComicDTO(nombre, precio) "
        + "FROM Comic "
        + "WHERE id = :idComic";
        try {
            Query queryConsultaNombrePrecioComic = em.createQuery(consultaNombrePrecioComic);
            queryConsultaNombrePrecioComic.setParameter("idComic", idComic);
            dto = (ConsultarNombrePrecioComicDTO) queryConsultaNombrePrecioComic.getSingleResult();
            dto.setExitoso(true);
            dto.setMensajeEjecucion("Se ha ejecutado exitosamente");
        } catch (NonUniqueResultException e) {
            // TODO: handle exception
            LOGGER.info("Se ha presentado NonResultUniqueException" + e.getMessage());
            dto.setExitoso(false);
            dto.setMensajeEjecucion("Existen registros duplicados para el id " + idComic);
        } catch (NoResultException e) {
            LOGGER.info("Se ha presentado NonResultUniqueException: " + e.getMessage());
            dto.setExitoso(false);
            dto.setMensajeEjecucion("No existen registros para el id " + idComic);
        } catch (Exception e) {
            LOGGER.info("Se ha presentado un error tecnico" + e.getMessage());
            dto.setExitoso(false);
            dto.setMensajeEjecucion("Se ha presentado un error tecnico" + e.getMessage());
        }
        LOGGER.info("Termina operacion consultarNombrePrecio()");
        return dto;
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public ResultadoDTO crearComic(ComicDTO comicDTO) throws Exception {
        // TODO Auto-generated method stub
        if(comicDTO.getNombre().equals(null)){
            throw new Exception("el campo nombre es requerido");
        }

        Comic comic = this.convertirComicDTOToComic(comicDTO);
        em.persist(comic);

        ResultadoDTO resultado = new ResultadoDTO();
        resultado.setExitoso(true);
        resultado.setMensajeEjecucion("El comic ha sido creado exitosamente");
        return resultado;
    }

    private Comic convertirComicDTOToComic(ComicDTO comicDTO){
        Comic comic = new Comic();
        Comic.builder()
        .id(comicDTO.getId())
        .nombre(comicDTO.getNombre())
        .editorial(comicDTO.getEditorial())
        .tematica(comicDTO.getTematica())
        .coleccion(comicDTO.getColeccion())
        .numeroDePaginas(comicDTO.getNumeroDePaginas())
        .precio(comicDTO.getPrecio())
        .autores(comicDTO.getAutores())
        .color(comicDTO.getColor())
        .fechaVenta(comicDTO.getFechaVenta())
        .estado(comicDTO.getEstado())
        .cantidad(comicDTO.getCantidad());

        return comic;
    }

}