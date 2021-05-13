package com.bokytake.api.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos_pedido", catalog = "prueba")
public class ProductosPedidos implements java.io.Serializable {

	private ProductosPedidoId id;
	private Pedidos pedidos;
	private Productos productos;
	private int cantidad;

	public ProductosPedidos() {
	}

	public ProductosPedidos(final ProductosPedidoId id, final int cantidad) {
		super();
		this.id = id;
		this.cantidad = cantidad;
	}

	public ProductosPedidos(final ProductosPedidoId id, final Pedidos pedidos, final Productos productos,
			final int cantidad) {
		this.id = id;
		this.pedidos = pedidos;
		this.productos = productos;
		this.cantidad = cantidad;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "productoId", column = @Column(name = "Producto_id", nullable = false)),
			@AttributeOverride(name = "pedidoId", column = @Column(name = "Pedido_id", nullable = false)) })
	public ProductosPedidoId getId() {
		return this.id;
	}

	public void setId(final ProductosPedidoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Pedido_id", nullable = false, insertable = false, updatable = false)
	public Pedidos getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(final Pedidos pedidos) {
		this.pedidos = pedidos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Producto_id", nullable = false, insertable = false, updatable = false)
	public Productos getProductos() {
		return this.productos;
	}

	public void setProductos(final Productos productos) {
		this.productos = productos;
	}

	@Column(name = "cantidad", nullable = false)
	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(final int cantidad) {
		this.cantidad = cantidad;
	}

}
