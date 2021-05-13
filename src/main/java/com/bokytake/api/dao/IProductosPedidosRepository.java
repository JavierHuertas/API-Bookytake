package com.bokytake.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bokytake.api.entity.ProductosPedidoId;
import com.bokytake.api.entity.ProductosPedidos;

@Repository
public interface IProductosPedidosRepository extends JpaRepository<ProductosPedidos, ProductosPedidoId> {

}
