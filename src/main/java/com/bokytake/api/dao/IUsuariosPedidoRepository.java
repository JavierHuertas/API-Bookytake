package com.bokytake.api.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bokytake.api.entity.UsuarioPedido;

@Repository
public interface IUsuariosPedidoRepository extends JpaRepository<UsuarioPedido, String> {

	@Transactional
	@Query("update UsuarioPedido up set nombre = :nombre, apellidos= :apellido  where  up.id = :id ") // apellidos=
																										// :apellido
	@Modifying
	public void editarUsuario(@Param("id") String id, @Param("nombre") String nombre,
			@Param("apellido") String apellido);// , @Param("apellido") String
	// apellido

}
