package com.bokytake.api.converter;

import com.bokytake.api.dto.ProductosDTO;
import com.bokytake.api.entity.Productos;

public class ProductosConverter implements IGenericConverter<ProductosDTO, Productos> {

	@Override
	public Productos apply(final ProductosDTO t) {

		// return new Productos(, null, 0, null, null, null);
		return null;
	}

}
