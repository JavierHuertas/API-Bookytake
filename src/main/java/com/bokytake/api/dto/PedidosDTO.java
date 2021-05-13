package com.bokytake.api.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bokytake.api.entity.Estados;
import com.bokytake.api.entity.Tienda;
import com.bokytake.api.entity.UsuarioPedido;

public class PedidosDTO {

	private Integer id;
	private Estados estados;
	private Tienda tienda;
	private UsuarioPedido usuarioPedido;
	private Date freservas;
	private Date frecogida;
	private Float importe;
	private List<ProductosDTO> productoses = new ArrayList<ProductosDTO>(0);

	public PedidosDTO() {
		// TODO Auto-generated constructor stub
	}

	// con todos los argumentos

	public PedidosDTO(final Integer id, final Estados estados, final Tienda tienda, final UsuarioPedido usuarioPedido,
			final Date freservas, final Date frecogida, final Float importe) {
		super();
		this.id = id;
		this.estados = estados;
		this.tienda = tienda;
		this.usuarioPedido = usuarioPedido;
		this.freservas = freservas;
		this.frecogida = frecogida;
		this.importe = importe;

	}

	// creacion v2
	public PedidosDTO(final Estados estados, final Tienda tienda, final UsuarioPedido usuarioPedido,
			final Date freservas, final Date frecogida, final Float importe, final List<ProductosDTO> productoses) {
		super();
		this.estados = estados;
		this.tienda = tienda;
		this.usuarioPedido = usuarioPedido;
		this.freservas = freservas;
		this.frecogida = frecogida;
		this.importe = importe;

		this.productoses = productoses;
	}

	// creacion

	public PedidosDTO(final Estados estados, final Tienda tienda, final UsuarioPedido usuarioPedido,
			final Date freservas, final Float importe, final List<ProductosDTO> productoses) {
		super();
		this.estados = estados;
		this.tienda = tienda;
		this.usuarioPedido = usuarioPedido;
		this.freservas = freservas;
		this.importe = importe;

		this.productoses = productoses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public Estados getEstados() {
		return estados;
	}

	public void setEstados(final Estados estados) {
		this.estados = estados;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(final Tienda tienda) {
		this.tienda = tienda;
	}

	public UsuarioPedido getUsuarioPedido() {
		return usuarioPedido;
	}

	public void setUsuarioPedido(final UsuarioPedido usuarioPedido) {
		this.usuarioPedido = usuarioPedido;
	}

	public Date getFreservas() {
		return freservas;
	}

	public void setFreservas(final Date freservas) {
		this.freservas = freservas;
	}

	public Date getFrecogida() {
		return frecogida;
	}

	public void setFrecogida(final Date frecogida) {
		this.frecogida = frecogida;
	}

	public Float getImporte() {
		return importe;
	}

	public void setImporte(final Float importe) {
		this.importe = importe;
	}

	public List<ProductosDTO> getProductoses() {
		return productoses;
	}

	public void setProductoses(final List<ProductosDTO> productoses) {
		this.productoses = productoses;
	}

}
