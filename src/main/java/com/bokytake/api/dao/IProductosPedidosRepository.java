package com.bokytake.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bokytake.api.entity.ProductosPedidoId;
import com.bokytake.api.entity.ProductosPedidos;

@Repository
public interface IProductosPedidosRepository extends JpaRepository<ProductosPedidos, ProductosPedidoId> {

	@Query("Select p From ProductosPedidos p where p.id.pedidoId = :idPedido")
	List<ProductosPedidos> productosPorId(@Param("idPedido") int idpedido);

}
