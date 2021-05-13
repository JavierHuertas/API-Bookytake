package com.bokytake.api.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bokytake.api.entity.Productos;

@Repository
public interface IProductosRepository extends JpaRepository<Productos, Integer> {

	@Query("select p from Productos p where p.tienda.id=:id")
	List<Productos> litarProductosTienda(@Param("id") String id);

	/*
	 * private Integer id; private Tienda tienda; private String nombre; private
	 * float precio; private Integer cantidad; private Boolean mostrarApp; private
	 * String urlImg;
	 */

	@Transactional
	@Query("update Productos p set mostrarApp= :mostrarApp,nombre= :nombre, precio= :precio,cantidad= :cantidad, urlImg= :urlImg  where  p.id = :id ")
	@Modifying
	void editarProducto(@Param("id") Integer id, @Param("cantidad") Integer cantidad,
			@Param("mostrarApp") Boolean monstrarApp, @Param("nombre") String nombre, @Param("precio") Float precio,
			@Param("urlImg") String urlImg);

}
