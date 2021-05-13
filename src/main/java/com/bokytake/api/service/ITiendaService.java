package com.bokytake.api.service;

import java.util.List;

import com.bokytake.api.dto.ProductosDTO;

public interface ITiendaService {

	public List<ProductosDTO> listarProductos(String id);

}
