package com.bokytake.api.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductosPedidoId implements java.io.Serializable {

	private int productoId;
	private int pedidoId;

	public ProductosPedidoId() {
	}

	public ProductosPedidoId(final int productoId, final int pedidoId) {
		this.productoId = productoId;
		this.pedidoId = pedidoId;
	}

	@Column(name = "Producto_id", nullable = false)
	public int getProductoId() {
		return this.productoId;
	}

	public void setProductoId(final int productoId) {
		this.productoId = productoId;
	}

	@Column(name = "Pedido_id", nullable = false)
	public int getPedidoId() {
		return this.pedidoId;
	}

	public void setPedidoId(final int pedidoId) {
		this.pedidoId = pedidoId;
	}

	@Override
	public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		if (!(other instanceof ProductosPedidoId)) {
			return false;
		}
		final ProductosPedidoId castOther = (ProductosPedidoId) other;

		return this.getProductoId() == castOther.getProductoId() && this.getPedidoId() == castOther.getPedidoId();
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getProductoId();
		result = 37 * result + this.getPedidoId();
		return result;
	}

}
