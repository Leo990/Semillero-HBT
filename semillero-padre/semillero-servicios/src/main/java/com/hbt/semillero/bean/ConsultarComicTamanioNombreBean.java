package com.hbt.semillero.bean;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.hbt.semillero.dtos.ConsultarComicTamanioNombreDTO;
import com.hbt.semillero.enums.OperadorEnum;
import com.hbt.semillero.poo.exceptions.InvalidLengthException;
import com.hbt.semillero.poo.interfaces.IConsultarComicTamanioNombreLocal;

/**
 * <b>Descripción:<b> Bean que determina el servicio dde consultar los
 * comics con nombre mayor a una longitud dada
 * 
 * <b>Caso de Uso:<b> CUTSR
 * 
 * @author Leonardo Sanchez Camacho
 * @version 1.0
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ConsultarComicTamanioNombreBean implements IConsultarComicTamanioNombreLocal {

    private static Logger LOGGER = Logger.getLogger(ConsultarComicTamanioNombreBean.class);
    private static short MAX_LENGTH = 12;

    @PersistenceContext
    private EntityManager em;

    @Override
    @SuppressWarnings("unchecked")
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(Short length) throws Exception {
        LOGGER.info("Ha iniciado el método consultarComicTamanioNombre(Short length)");
        if (length > MAX_LENGTH) {
            throw new InvalidLengthException("La longitud maxima permitida es de " + MAX_LENGTH);
        }

        ConsultarComicTamanioNombreDTO dto = new ConsultarComicTamanioNombreDTO();
        Query queryListComics = this.queryCompararTamanioNombreComic(OperadorEnum.MAYOR, length);
        dto.setComicSuperanTamanio(queryListComics.getResultList());

        queryListComics = this.queryCompararTamanioNombreComic(OperadorEnum.MENOR_O_IGUAL, length);
        dto.setComicNoSuperanTamanio(queryListComics.getResultList());

        dto.setExitoso(true);
        dto.setMensajeEjecucion("El metodo se ha ejecutado correctamente");

        LOGGER.info("Ha finalizado el método consultarComicTamanioNombre(Short length)");
        return dto;
    }

    /**
     * <b>Descripción:<b> metodo de busqueda de nombre de comics que compara segun
     * un operador que tan grande es la longitud
     * 
     * <b>Caso de Uso:<b> CUTSR
     * 
     * @param operador operador de comparacion <b> MAYOR, MENOR_O_IGUAL
     * @param length   longitud de comparacion del tamaño del nombre del comic
     * @author Leonardo Sanchez Camacho
     * @version 1.0
     */
    private Query queryCompararTamanioNombreComic(OperadorEnum operador, Short length) {
        String queryConsultarComicsQueSuperanTamanio = "SELECT cm.nombre "
                + "FROM Comic cm "
                + "WHERE LENGTH(cm.nombre) " + operador.getEtiqueta() + " :maxLength ";
        Query queryListComics = em.createQuery(queryConsultarComicsQueSuperanTamanio);
        queryListComics.setParameter("maxLength", (int) length);
        return queryListComics;
    }
}
