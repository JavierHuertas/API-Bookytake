package com.bokytake.api.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_pedido", catalog = "prueba")
public class UsuarioPedido implements java.io.Serializable {

	private String id;
	private String nombre;
	private String apellidos;
	private String email;
	private List<Pedidos> pedidoses = new ArrayList<Pedidos>(0);

	public UsuarioPedido() {
	}

	public UsuarioPedido(final String id) {
		this.id = id;
	}

	public UsuarioPedido(final String id, final String nombre, final String apellidos, final String email,
			final List<Pedidos> pedidoses) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.pedidoses = pedidoses;
	}

	public UsuarioPedido(final String id, final String nombre, final String apellidos, final String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}

	public UsuarioPedido(final String id, final String nombre, final String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;

	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellidos")
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(final String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarioPedido")
	public List<Pedidos> getPedidoses() {
		return this.pedidoses;
	}

	public void setPedidoses(final List<Pedidos> pedidoses) {
		this.pedidoses = pedidoses;
	}

}
