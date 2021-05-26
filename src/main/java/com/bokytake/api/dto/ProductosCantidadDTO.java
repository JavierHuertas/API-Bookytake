package com.bokytake.api.dto;

public class ProductosCantidadDTO {

	private ProductosDTO producto;
	private int cantidadpedido;

	public ProductosCantidadDTO(final ProductosDTO producto, final int cantidad) {
		super();
		this.producto = producto;
		this.cantidadpedido = cantidad;
	}

	public ProductosCantidadDTO() {
		super();
	}

	public ProductosDTO getProducto() {
		return producto;
	}

	public void setProducto(final ProductosDTO producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidadpedido;
	}

	public void setCantidad(final int cantidad) {
		this.cantidadpedido = cantidad;
	}

}
