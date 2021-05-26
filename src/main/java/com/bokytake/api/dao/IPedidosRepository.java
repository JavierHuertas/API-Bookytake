package com.bokytake.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bokytake.api.entity.Pedidos;

@Repository
public interface IPedidosRepository extends JpaRepository<Pedidos, Integer> {

	@Query("Select p from Pedidos p where p.usuarioPedido.id like :idUsuario")
	List<Pedidos> pedidosUsuario(@Param("idUsuario") String idUsuario);

}
