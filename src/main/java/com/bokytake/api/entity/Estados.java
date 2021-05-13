package com.bokytake.api.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Estados generated by hbm2java
 */
@Entity
@Table(name = "estados", catalog = "prueba")
public class Estados implements java.io.Serializable {

	private int id;
	private String nombre;
	private List<Pedidos> pedidoses = new ArrayList<Pedidos>(0);

	public Estados() {
	}

	public Estados(final int id, final String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Estados(final int id, final String nombre, final List<Pedidos> pedidoses) {
		this.id = id;
		this.nombre = nombre;
		this.pedidoses = pedidoses;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estados")
	public List<Pedidos> getPedidoses() {
		return this.pedidoses;
	}

	public void setPedidoses(final List<Pedidos> pedidoses) {
		this.pedidoses = pedidoses;
	}

}
