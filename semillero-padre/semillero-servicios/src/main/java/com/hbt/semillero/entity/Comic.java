package com.hbt.semillero.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

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
	private EstadoEnum estado;
	
	@Column(name="SCCANTIDAD", length = 3, nullable = false)
	private short cantidad;


	public Comic(Long id, String nombre, TematicaEnum tematica, Boolean color, LocalDate fechaVenta, String editorial, String coleccion, short numeroDePaginas, BigDecimal precio, String autores, EstadoEnum estado, short cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.tematica = tematica;
		this.color = color;
		this.fechaVenta = fechaVenta;
		this.editorial = editorial;
		this.coleccion = coleccion;
		this.numeroDePaginas = numeroDePaginas;
		this.precio = precio;
		this.autores = autores;
		this.estado = estado;
		this.cantidad = cantidad;
	}
	

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo tematica
	 * @return La tematica asociado a la clase
	 */
	public TematicaEnum getTematica() {
		return this.tematica;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo tematica
	 * @param tematica La nueva tematica a modificar.
	 */
	public void setTematica(TematicaEnum tematica) {
		this.tematica = tematica;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * @return El estado del color asociado a la clase
	 */
	public Boolean isColor() {
		return this.color;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * @return El color asociado a la clase
	 */
	public Boolean getColor() {
		return this.color;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo color
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(Boolean color) {
		this.color = color;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo fechaVenta
	 * @return El id asociado a la clase
	 */
	public LocalDate getFechaVenta() {
		return this.fechaVenta;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo fechaVenta
	 * @param fechaVenta La nueva fecha de venta a modificar.
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo editorial
	 * @return La editorial asociado a la clase
	 */
	public String getEditorial() {
		return this.editorial;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo editorial
	 * @param editorial La nueva editorial a modificar.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo coleccion
	 * @return La colección asociado a la clase
	 */
	public String getColeccion() {
		return this.coleccion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo colección
	 * @param coleccion La nueva colección a modificar.
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numero de paginas
	 * @return El numero de paginas asociado a la clase
	 */
	public short getNumeroDePaginas() {
		return this.numeroDePaginas;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numero de paginas
	 * @param numeroDePaginas El nuevo numero de paginas a modificar.
	 */
	public void setNumeroDePaginas(short numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * @return El precio asociado a la clase
	 */
	public BigDecimal getPrecio() {
		return this.precio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo autores
	 * @return Los autores asociados a la clase
	 */
	public String getAutores() {
		return this.autores;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo autores
	 * @param autores Los nuevos autores a modificar.
	 */
	public void setAutores(String autores) {
		this.autores = autores;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo estado
	 * @return El estado asociado a la clase
	 */
	public EstadoEnum getEstado() {
		return this.estado;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo estado
	 * @param estado El nuevo estado a modificar.
	 */
	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * @return la cantidad asociado a la clase
	 */
	public short getCantidad() {
		return this.cantidad;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * @param cantidad La nueva cantidad a modificar.
	 */
	public void setCantidad(short cantidad) {
		this.cantidad = cantidad;
	}

	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Comic [id=" + id + ", nombre=" + nombre + ", tematica=" + tematica + ", color=" + color
				+ ", fechaVenta=" + fechaVenta + "]";
	}
}