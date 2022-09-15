package com.hbt.semillero.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * <b>Descripción:<b> Clase que contiene la informacion de la tabla comic
 * en la BD de semillero
 * <b>Caso de Uso:<b> Semillero2022
 * @author Diego Fernado Alvarez Silva
 * @version 1
 */
@Entity
@Table(name="COMIC")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Comic implements Serializable {
	
	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 216164349106318793L;

	@Id
	@Column(name="SCID")
	@SequenceGenerator(allocationSize= 1, name="COMIC_SCID_GENERATOR", sequenceName="SEQ_COMIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="COMIC_SCID_GENERATOR")
	private Long id;
	
	@Column(name="SCNOMBRE", nullable = false, length=50)
	private String nombre;
	
	@Column(name="SCTEMATICA")
	@Enumerated(value = EnumType.STRING)
	private TematicaEnum tematica;
	
	@Column(name="SCCOLOR")
	private Boolean color;
	
	@Column(name="SCFECHA_VENTA")
	private LocalDate fechaVenta;

	@Column(name="SCEDITORIAL", length=50, nullable=false)
	private String editorial;
	
	@Column(name="SCCOLECCION", length=50, nullable=false)
	private String coleccion;
	
	@Column(name="SCNUMEROPAGINAS", length = 2, nullable = false)
	private short numeroDePaginas;
	
	@Column(name="SCPRECIO", length = 4, nullable = false)
	private BigDecimal precio;
	
	@Column(name="SCAUTORES", length=50)
	private String autores;
	
	@Column(name="SCESTADO", length=50)
	@Enumerated(value = EnumType.STRING)
	private EstadoEnum estado;
	
	@Column(name="SCCANTIDAD", length = 3, nullable = false)
	private short cantidad;
}