package com.bokytake.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bokytake.api.converter.ProductosDTOConverter;
import com.bokytake.api.dao.IProductosRepository;
import com.bokytake.api.dto.ProductosDTO;
import com.bokytake.api.entity.Productos;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	IProductosRepository productoInterface;

	@Autowired
	ProductosDTOConverter proDTOConvert;

	@Autowired
	TiendaService tiendaservice;

	public List<ProductosDTO> listarProductos(final String id) {
		return proDTOConvert.convert(productoInterface.litarProductosTienda(id));
	}

	// public Productos(final Tienda tienda, final String nombre, final float
	// precio, final Integer cantidad,final Boolean mostrarApp, final String urlImg)
	// {

	public void guardarNuevoProducto(final ProductosDTO nuevoProducto, final String idTienda) {
		final Productos saveP = new Productos(tiendaservice.devolverTienda(idTienda), nuevoProducto.getNombre(),
				nuevoProducto.getPrecio(), nuevoProducto.getCantidad(), nuevoProducto.getMostrarApp(),
				nuevoProducto.getDescripcion(), nuevoProducto.getUrlImg());
		productoInterface.save(saveP);
	}

	public void borrarProducto(final Integer id) {
		productoInterface.deleteById(id);
	}

	public void editarProducto(final ProductosDTO editadoProducto) {
		productoInterface.editarProducto(editadoProducto.getId(), editadoProducto.getCantidad(),
				editadoProducto.getMostrarApp(), editadoProducto.getNombre(), editadoProducto.getPrecio(),
				editadoProducto.getUrlImg());

	}

}
