package com.bokytake.api.dto;

public class UsuarioPedidoDTO {

	private String id;
	private String nombre;
	private String email;

	public UsuarioPedidoDTO() {
		super();
	}

	public UsuarioPedidoDTO(final String id, final String nombre, final String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
	}

	public UsuarioPedidoDTO(final String nombre, final String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

}
