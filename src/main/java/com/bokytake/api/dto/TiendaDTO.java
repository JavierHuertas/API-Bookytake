package com.bokytake.api.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class TiendaDTO implements Serializable {

	private String id;
	private String nombre;
	private String localizacion;
	private String contrasenia;
	private String email;
	private Set<ProductosDTO> productoses = new HashSet<ProductosDTO>(0);
	private Set<PedidosDTO> pedidoses = new HashSet<PedidosDTO>(0);

	// tienda nueva sin pedidos ni productos arraysVacios
	public TiendaDTO(final String id, final String nombre, final String localizacion, final String contrasenia,
			final String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.contrasenia = contrasenia;
		this.email = email;
	}

	public TiendaDTO() {
		super();
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public String getEmail() {
		return email;
	}

	public Set<ProductosDTO> getProductoses() {
		return productoses;
	}

	public Set<PedidosDTO> getPedidoses() {
		return pedidoses;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public void setLocalizacion(final String localizacion) {
		this.localizacion = localizacion;
	}

	public void setContrasenia(final String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setProductoses(final Set<ProductosDTO> productoses) {
		this.productoses = productoses;
	}

	public void setPedidoses(final Set<PedidosDTO> pedidoses) {
		this.pedidoses = pedidoses;
	}

}
