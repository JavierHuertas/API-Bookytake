package com.bokytake.api.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bokytake.api.dto.ProductosDTO;
import com.bokytake.api.entity.Productos;

@Component
public class ProductosConverter implements IGenericConverter<ProductosDTO, Productos> {

	@Autowired
	TiendaConverter convertertienda;

	@Override
	public Productos apply(final ProductosDTO t) {

		return new Productos(t.getId(), convertertienda.convert(t.getTienda()), t.getNombre(), t.getPrecio(),
				t.getCantidad(), t.getMostrarApp(), t.getDescripcion(), t.getUrlImg());
	}

}
