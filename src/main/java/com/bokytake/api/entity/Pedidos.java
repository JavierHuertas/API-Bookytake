package com.bokytake.api.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pedidos generated by hbm2java
 */
@Entity
@Table(name = "pedidos", catalog = "prueba")
public class Pedidos implements java.io.Serializable {

	private Integer id;
	private Estados estados;
	private Tienda tienda;
	private UsuarioPedido usuarioPedido;
	private Date freserva;
	private Date frecogida;
	private float importe;
	private List<ProductosPedidos> productoses = new ArrayList<ProductosPedidos>(0);

	public Pedidos() {
	}

	public Pedidos(final Estados estados, final Tienda tienda, final UsuarioPedido usuarioPedido, final Date freserva,
			final Date frecogida, final float importe) {
		this.estados = estados;
		this.tienda = tienda;
		this.usuarioPedido = usuarioPedido;
		this.freserva = freserva;
		this.importe = importe;
		this.frecogida = frecogida;
	}

	public Pedidos(final Integer id, final Estados estados, final Tienda tienda, final UsuarioPedido usuarioPedido,
			final Date freserva, final Date frecogida, final float importe) {
		this.id = id;
		this.estados = estados;
		this.tienda = tienda;
		this.usuarioPedido = usuarioPedido;
		this.freserva = freserva;
		this.importe = importe;
		this.frecogida = frecogida;
	}

	public Pedidos(final Estados estados, final Tienda tienda, final UsuarioPedido usuarioPedido, final Date freserva,
			final Date frecogida, final float importe, final List<ProductosPedidos> productoses) {
		this.estados = estados;
		this.tienda = tienda;
		this.usuarioPedido = usuarioPedido;
		this.freserva = freserva;
		this.frecogida = frecogida;
		this.importe = importe;
		this.productoses = productoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Estado_id", nullable = false)
	public Estados getEstados() {
		return this.estados;
	}

	public void setEstados(final Estados estados) {
		this.estados = estados;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Tienda_id", nullable = false)
	public Tienda getTienda() {
		return this.tienda;
	}

	public void setTienda(final Tienda tienda) {
		this.tienda = tienda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Usuario_id", nullable = false)
	public UsuarioPedido getUsuarioPedido() {
		return this.usuarioPedido;
	}

	public void setUsuarioPedido(final UsuarioPedido usuarioPedido) {
		this.usuarioPedido = usuarioPedido;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "freserva", nullable = false, length = 19)
	public Date getfreserva() {
		return this.freserva;
	}

	public void setfreserva(final Date freserva) {
		this.freserva = freserva;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "frecogida", length = 19)
	public Date getFrecogida() {
		return this.frecogida;
	}

	public void setFrecogida(final Date frecogida) {
		this.frecogida = frecogida;
	}

	@Column(name = "importe", nullable = false, precision = 12, scale = 0)
	public float getImporte() {
		return this.importe;
	}

	public void setImporte(final float importe) {
		this.importe = importe;
	}

	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "pedidos") public
	 * List<ProductosPedidos> getProductoses() { return this.productoses; }
	 *
	 * public void setProductoses(final List<ProductosPedidos> productoses) {
	 * this.productoses = productoses; }
	 */

}
