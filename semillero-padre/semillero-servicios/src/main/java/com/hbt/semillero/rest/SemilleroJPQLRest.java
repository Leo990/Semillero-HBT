/**
 * SemilleroJPQLRest.java
 */
package com.hbt.semillero.rest;

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
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Diego Fernando Alvarez Silva
 * @version 1.0
 */
@Path("/SemilleroJPQLRest")
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class SemilleroJPQLRest {

	/**
	 * Constante que contendra el log de la clase AritmeticaTest
	 */
	private final static Logger LOG = Logger.getLogger(SemilleroJPQLRest.class);

	@PersistenceContext(name="semillero")
	private EntityManager em;

	@GET
	@Path("/test")	
	@Produces(MediaType.APPLICATION_JSON)
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public String generarOperacionComic() {
		LOG.info("Se ejecuta generarOperacionComic()");
		
		try {
			// Obtencion de un registro de la tabla comic haciendo uso del metodo find de la clase EntityManager
			//Comic comic = null;
			// SELECT * FROM COMIC WHERE ID = 15;
//			comic = em.find(Comic.class, 19L);
//			LOG.info("DATA COMIC" + comic.toString());
//
//			//Consults en JPQL para obtener un comic con el id 15 pero quemado o hardcodeado haciendo uso del metodo getSingleResult
//			String consulta = "SELECT c FROM Comic c WHERE c.id = 19 ";
//			Query queryUnComic = em.createQuery(consulta);
//			comic = (Comic) queryUnComic.getSingleResult();
//
//
//			//Consulta en JPQL para obtener un comic con el id 6 tematicaenum y color haciendo uso del metodo getSingleResult y setParameter
//			String consultaDos = "SELECT cm FROM Comic cm "
//					+ " WHERE cm.id = 19 "
//					+ " AND cm.tematicaEnum = 'AVENTURAS'"
//					+ " AND cm.color = 0 "
//					+ " AND cm.estadoEnum = 'ACTIVO' " ;
//			Query queryUnComicDos = em.createQuery(consultaDos);			
//			comic = (Comic) queryUnComicDos.getSingleResult();
//
//
//			String consultaTres = "SELECT cm FROM Comic cm "
//					+ " WHERE cm.id = :idComic "
//					+ " AND cm.tematicaEnum = :tematicaEnum "
//					+ " AND cm.color = :color "
//					+ " AND cm.estadoEnum = :estado " ;
//			Query queryUnComicTres = em.createQuery(consultaTres);
//			queryUnComicTres.setParameter("idComic", comic.getId());
//			queryUnComicTres.setParameter("tematicaEnum", TematicaEnum.AVENTURAS);
//			queryUnComicTres.setParameter("color", Boolean.FALSE);
//			queryUnComicTres.setParameter("estado", EstadoEnum.ACTIVO);
//			comic = (Comic) queryUnComicTres.getSingleResult();
//
//			// Query que genera una exception de tipo NoResultException debido a que la consulta no retorna nada
//			//			String consultaCuarto = "SELECT cm FROM Comic cm WHERE cm.id = :idComic "
//			//					+ " AND cm.tematicaEnum = :tematicaEnum AND cm.color = :colorComic ";
//			//			Query queryUnComicCuatro = em.createQuery(consultaCuarto);
//			//			queryUnComicCuatro.setParameter("idComic", comic.getId());
//			//			queryUnComicCuatro.setParameter("tematicaEnum", TematicaEnum.HUMORISTICO);
//			//			queryUnComicCuatro.setParameter("colorComic", Boolean.TRUE);
//			//			comic = (Comic) queryUnComicCuatro.getSingleResult();
//
//			//Traer los comics filtrando por tematica y color como lista
//			String consultaListaComics = "SELECT cm FROM Comic cm WHERE cm.tematicaEnum = :tematicaEnum"
//					+ " AND cm.color = :colorComic ";
//			Query queryListComics = em.createQuery(consultaListaComics);
//			queryListComics.setParameter("tematicaEnum", TematicaEnum.FANTASTICO);
//			queryListComics.setParameter("colorComic", Boolean.FALSE);
//			List<Comic> listComics = queryListComics.getResultList();
//
//			for (Comic comicList : listComics) {
//				LOG.info("DATA COMIC" + comicList.toString());
//			}
//
//			// Query que genera una exception de tipo NonUniqueResultException debido a que la consulta retorna mas de 1 registro
////			String consultaListaNonUnique = "SELECT cm FROM Comic cm WHERE cm.tematicaEnum = :tematicaEnum"
////					+ " AND cm.color = :colorComic ";
////			Query queryNonUnique = em.createQuery(consultaListaNonUnique);
////			queryNonUnique.setParameter("tematicaEnum", TematicaEnum.FANTASTICO);
////			queryNonUnique.setParameter("colorComic", Boolean.FALSE);
////			comic = (Comic) queryNonUnique.getSingleResult();
//			//List<Comic> listComics = queryListComics.getSingleResult();
//
//			// Se crea comic Thor
//			Comic thor = Comic.builder()
//					.nombre("Thor")
//					.editorial("Marvel")
//					.coleccion("Marvel")
//					.numeroPaginas(50)
//					.precio(new BigDecimal(1000))
//					.estadoEnum(EstadoEnum.ACTIVO)					
//					.cantidad(10L).build();
//			// operacion insert
//			em.persist(thor);
////			em.flush();
//			// operacion select
//			thor = em.find(Comic.class, 24L);
//			
//			thor.setFechaVenta(LocalDate.now());
//			thor.setColor(Boolean.TRUE);
//			// operacion update
//			em.merge(thor);
//			// operacion delete
//			em.remove(comic);
//			
//			String actualizarComic = "UPDATE Comic c SET c.estadoEnum = :estadoEnum "
//								   + " WHERE c.id = :idComic ";
//			Query queryActualizarComic = em.createQuery(actualizarComic);
//			queryActualizarComic.setParameter("estadoEnum", EstadoEnum.INACTIVO);
//			queryActualizarComic.setParameter("idComic", 20L);
//			int recordsUpdate = queryActualizarComic.executeUpdate();
//			
//			LOG.error("Se Actualizaron " + recordsUpdate + " de la tabla comic");
//			// Se eliminan los registros mediante JPQL
//			String eliminarComics = "DELETE FROM Comic  "
//					   + " WHERE id IN ( :idsComics ) ";
//			Query queryEliminarComics = em.createQuery(eliminarComics);
//			queryEliminarComics.setParameter("idsComics", Arrays.asList(16L,17L));
//			int records = queryEliminarComics.executeUpdate();
//			LOG.error("Se eliminaron " + records + " de la tabla comic");
//			
//			// Consulta algunos campos de la entidad y retorna una lista de objetos
//			String consultaCampos = "SELECT c.nombre, c.estadoEnum, c.precio FROM Comic c "
//								  + " WHERE c.id = :idComic ";
//			Query queryCampos = em.createQuery(consultaCampos);
//			queryCampos.setParameter("idComic", 25L);
//			
//			Object[] data = (Object[]) queryCampos.getSingleResult();
//			String nombre = (String) data[0];
//			EstadoEnum estadoEnum = (EstadoEnum) data[1];
//			
//			BigDecimal precio = null;
//			if(data[2] != null) {
//				precio = (BigDecimal) data[2];
//			}
//			precio = data[2] != null ? (BigDecimal) data[2] : null;
//			
//			ComicDTO dto = new ComicDTO();
//			dto.setNombre(nombre);
//			dto.setPrecio(precio);
//			dto.setEstadoEnum(estadoEnum);
//			
			
			// Consulta unos campos de la entidad usando el contructor de comicDTO y retorna una lista de comicsDTO
//			String consultaCamposContructor = "SELECT new com.hbt.semillero.dtos.ComicDTO( c.nombre, c.estadoEnum, c.precio ) "
//					  + " FROM Comic c "
//					  + " WHERE c.id = :idComic ";
//			Query queryCamposConstructor = em.createQuery(consultaCamposContructor);
//			queryCamposConstructor.setParameter("idComic", 24L);
//			ComicDTO comicDTO = (ComicDTO) queryCamposConstructor.getSingleResult();
//			LOG.error("DATA DTO " + comicDTO.toString());
			
			

			// Consulta estructurada como nativa del motor las conocidas nativeQuery
			String consultaNative = "SELECT SCNOMBRE,SCESTADO,SCPRECIO "
					  + " FROM COMIC c "
					  + " WHERE c.SCID=:idComic";
			Query queryNativo = em.createNativeQuery(consultaNative);
			queryNativo.setParameter("idComic", 21L);
			//Object[] data = (Object[]) queryNativo.getSingleResult();
			
			//Paginacion por base datos
			String consultaPaginada = "SELECT new com.hbt.semillero.dtos.ComicDTO( c.nombre, c.estadoEnum, c.precio ) "
					  + " FROM Comic c "
					  + " ORDER BY c.nombre ASC ";
			Query queryPaginado = em.createQuery(consultaPaginada);
			queryPaginado.setFirstResult(1);
			queryPaginado.setMaxResults(3);
			//List<ComicDTO> comicsDTO =  queryPaginado.getResultList();
			
			// Consulta estructurada como nativa del motor las conocidas nativeQuery
			// Consulta estructurada como nativa del motor las conocidas nativeQuery
//			String consultaNative = "SELECT new com.hbt.semillero.dtos.ComicDTO(SCNOMBRE, SCESTADO, SCPRECIO) FROM COMIC WHERE SCID = :idComic";
//			Query queryNativo = em.createNativeQuery(consultaNative);
//			queryNativo.setParameter("idComic", 22L);
//			ComicDTO comicDTONative = (ComicDTO) queryNativo.getSingleResult();
			
		} catch (NonUniqueResultException nure) {
			LOG.error("Se ha presentado ducplicidad de datos con el id 23" + nure.getMessage());
		} catch (NoResultException nre) {
			LOG.error("No se encontro registro para el id 23" + nre.getMessage());
		} catch (Exception e) {
			LOG.error("Se ha presentado un error tecnico" + e.getMessage());
		} 
		LOG.info("Finaliza generarOperacionComic()");
		return "";
	}
} 