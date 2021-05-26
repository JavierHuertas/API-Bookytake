package com.bokytake.api.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProductosDTO implements Serializable {

	private Integer id;
	private TiendaDTO tienda;
	private String nombre;
	private float precio;
	private Integer cantidad;
	private Boolean mostrarApp;
	private String urlImg;
	private String descripcion;
	// private final Set<Pedidos> pedidoses = new HashSet<Pedidos>(0);

	public ProductosDTO(final Integer id, final String nombre, final float precio, final Integer cantidad,
			final Boolean mostrarApp, final String descripcion, final String urlImg) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.mostrarApp = mostrarApp;
		this.urlImg = urlImg;
		this.descripcion = descripcion;
	}

	public ProductosDTO() {
		super();
	}

	// constructor para devolver informacion
	public ProductosDTO(final String nombre, final float precio, final Integer cantidad, final Boolean mostrarApp,
			final String descripcion, final String urlImg) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.mostrarApp = mostrarApp;
		this.urlImg = urlImg;
		this.descripcion = descripcion;
	}

	// constructor para crear desdeLatienda
	public ProductosDTO(final TiendaDTO tienda, final String nombre, final float precio, final Integer cantidad,
			final Boolean mostrarApp, final String urlImg) {
		super();
		this.tienda = tienda;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.mostrarApp = mostrarApp;
		this.urlImg = urlImg;
	}

	public ProductosDTO(final Integer id, final TiendaDTO tienda, final String nombre, final float precio,
			final Integer cantidad, final Boolean mostrarApp, final String descripcion, final String urlImg) {
		super();
		this.id = id;
		this.tienda = tienda;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.mostrarApp = mostrarApp;
		this.urlImg = urlImg;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(final float precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(final Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Boolean getMostrarApp() {
		return mostrarApp;
	}

	public void setMostrarApp(final Boolean mostrarApp) {
		this.mostrarApp = mostrarApp;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(final String urlImg) {
		this.urlImg = urlImg;
	}

	public TiendaDTO getTienda() {
		return tienda;
	}

	public void setTienda(final TiendaDTO tienda) {
		this.tienda = tienda;
	}

}
