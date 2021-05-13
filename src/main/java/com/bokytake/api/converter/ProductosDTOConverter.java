package com.bokytake.api.converter;

import org.springframework.stereotype.Component;

import com.bokytake.api.dto.ProductosDTO;
import com.bokytake.api.entity.Productos;

@Component
public class ProductosDTOConverter implements IGenericConverter<Productos, ProductosDTO> {

	@Override
	public ProductosDTO apply(final Productos t) {

		return new ProductosDTO(t.getId(), t.getNombre(), t.getPrecio(), t.getCantidad(), t.getMostrarApp(),
				t.getDescripcion(), t.getUrlImg());
	}

}
