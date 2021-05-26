package com.bokytake.api.dto;

public class EstadosDTO {

	private int id;
	private String nombre;

	public EstadosDTO() {
		super();
	}

	public EstadosDTO(final int id, final String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

}
