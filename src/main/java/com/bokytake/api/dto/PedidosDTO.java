package com.bokytake.api.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class PedidosDTO {

	private Integer id;
	private String Estado;
	private String tienda;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("TiendaDTO")
	private TiendaDTO TiendaDTO;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("UsuarioPedidoDTO")
	private UsuarioPedidoDTO UsuarioPedidoDTO;

	private Date freservas;
	private Date frecogida;
	private Float importe;
	private List<ProductosCantidadDTO> productoses = new ArrayList<ProductosCantidadDTO>(0);

	public PedidosDTO() {
		// TODO Auto-generated constructor stub
	}

	// con todos los argumentos
	public PedidosDTO(final Integer id, final String EstadosDTO, final TiendaDTO TiendaDTO,
			final UsuarioPedidoDTO UsuarioPedidoDTO, final Date freservas, final Date frecogida, final Float importe) {
		super();
		this.id = id;
		this.Estado = EstadosDTO;
		this.TiendaDTO = TiendaDTO;
		this.UsuarioPedidoDTO = UsuarioPedidoDTO;
		this.freservas = freservas;
		this.frecogida = frecogida;
		this.importe = importe;

	}

	// creacion v2
	public PedidosDTO(final String EstadosDTO, final TiendaDTO TiendaDTO, final UsuarioPedidoDTO UsuarioPedidoDTO,
			final Date freservas, final Date frecogida, final Float importe,
			final List<ProductosCantidadDTO> productoses) {
		super();
		this.Estado = EstadosDTO;
		this.TiendaDTO = TiendaDTO;
		this.UsuarioPedidoDTO = UsuarioPedidoDTO;
		this.freservas = freservas;
		this.frecogida = frecogida;
		this.importe = importe;

		this.productoses = productoses;
	}

	// creacion

	public PedidosDTO(final String EstadosDTO, final TiendaDTO TiendaDTO, final UsuarioPedidoDTO UsuarioPedidoDTO,
			final Date freservas, final Float importe, final List<ProductosCantidadDTO> productoses) {
		super();
		this.Estado = EstadosDTO;
		this.TiendaDTO = TiendaDTO;
		this.UsuarioPedidoDTO = UsuarioPedidoDTO;
		this.freservas = freservas;
		this.importe = importe;

		this.productoses = productoses;
	}

	public PedidosDTO(final Integer id, final String estado, final String tienda, final Date freservas,
			final Date frecogida, final Float importe, final List<ProductosCantidadDTO> productoses) {
		super();
		this.id = id;
		Estado = estado;
		this.tienda = tienda;
		this.freservas = freservas;
		this.frecogida = frecogida;
		this.importe = importe;
		this.productoses = productoses;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(final String estado) {
		Estado = estado;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(final String tienda) {
		this.tienda = tienda;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getEstadosDTO() {
		return Estado;
	}

	public void setEstadosDTO(final String EstadosDTO) {
		this.Estado = EstadosDTO;
	}

	public TiendaDTO getTiendaDTO() {
		return TiendaDTO;
	}

	public void setTiendaDTO(final TiendaDTO TiendaDTO) {
		this.TiendaDTO = TiendaDTO;
	}

	public UsuarioPedidoDTO getUsuarioPedidoDTO() {
		return UsuarioPedidoDTO;
	}

	public void setUsuarioPedidoDTO(final UsuarioPedidoDTO UsuarioPedidoDTO) {
		this.UsuarioPedidoDTO = UsuarioPedidoDTO;
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

	public List<ProductosCantidadDTO> getProductoses() {
		return productoses;
	}

	public void setProductoses(final List<ProductosCantidadDTO> productoses) {
		this.productoses = productoses;
	}

}
