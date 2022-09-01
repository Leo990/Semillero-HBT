package com.hbt.semillero.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

public class ComicDTO {
	private Long id;
	private String nombre;
	private TematicaEnum tematica;
	private Boolean color;
	private LocalDate fechaVenta;
	private String editorial;
	private String coleccion;
	private short numeroDePaginas;
	private BigDecimal precio;
	private String autores;
	private EstadoEnum estado;
	private short cantidad;

    public ComicDTO(){

    }

    public ComicDTO(String nombre, EstadoEnum estado, BigDecimal precio) {
		this.nombre = nombre;
		this.estado = estado;
		this.precio = precio;
	}
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TematicaEnum getTematica() {
        return this.tematica;
    }

    public void setTematica(TematicaEnum tematica) {
        this.tematica = tematica;
    }

    public Boolean isColor() {
        return this.color;
    }

    public Boolean getColor() {
        return this.color;
    }

    public void setColor(Boolean color) {
        this.color = color;
    }

    public LocalDate getFechaVenta() {
        return this.fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getColeccion() {
        return this.coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public short getNumeroDePaginas() {
        return this.numeroDePaginas;
    }

    public void setNumeroDePaginas(short numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public BigDecimal getPrecio() {
        return this.precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getAutores() {
        return this.autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public EstadoEnum getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoEnum estado) {
        this.estado = estado;
    }

    public short getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

}
