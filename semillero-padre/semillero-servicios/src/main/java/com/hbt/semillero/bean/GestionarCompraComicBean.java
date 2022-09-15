package com.hbt.semillero.bean;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.hbt.semillero.dtos.ResultadoDTO;
import com.hbt.semillero.entity.Comic;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.poo.interfaces.IGestionarCompraComicLocal;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarCompraComicBean implements IGestionarCompraComicLocal {

    private final static Logger LOGGER = Logger.getLogger(GestionarCompraComicBean.class);

    @PersistenceContext
    private EntityManager em;

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public ResultadoDTO gestionarCompra(long idComic, short cantidadAComprar) throws Exception {
        LOGGER.info("Inicia operacion consultarNombrePrecio()");
        ResultadoDTO dto = new ResultadoDTO();
        Comic comic = em.find(Comic.class, idComic);
        if (comic == null) {
            LOGGER.info("El comic con id " + idComic + " No se encuentra entre los registros");
            throw new Exception("El comic con id " + idComic + " No se encuentra entre los registros");
        }
        if (comic.getEstado() != null && comic.getEstado() == EstadoEnum.INACTIVO) {
            LOGGER.info("El comic seleccionado no cuenta con stock en bodega");
            throw new Exception("El comic seleccionado no cuenta con stock en bodega");
        }
        if (comic.getCantidad() < cantidadAComprar) {
            LOGGER.info("La cantidad existente del comic es:  " + comic.getCantidad() + ", y supera la ingresada");
            throw new Exception(
                    "La cantidad existente del comic es:  " + comic.getCantidad() + ", y supera la ingresada");
        }else if (comic.getCantidad() == cantidadAComprar){
            comic.setCantidad((short)0);
            comic.setEstado(EstadoEnum.INACTIVO);
        }else{
            comic.setCantidad((short)(comic.getCantidad() - cantidadAComprar));
        }

        dto.setExitoso(true);
        dto.setMensajeEjecucion("La compra del comic " + comic.getNombre() + " fue exitosa.");
        em.merge(comic);

        LOGGER.info("Finaliza operacion consultarNombrePrecio()");
        return dto;
    }

}
