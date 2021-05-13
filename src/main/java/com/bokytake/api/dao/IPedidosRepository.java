package com.bokytake.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bokytake.api.entity.Pedidos;

@Repository
public interface IPedidosRepository extends JpaRepository<Pedidos, Integer> {

}
