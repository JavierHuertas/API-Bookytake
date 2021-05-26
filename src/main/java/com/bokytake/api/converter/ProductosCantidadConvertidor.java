package com.bokytake.api.converter;

import org.springframework.stereotype.Component;

import com.bokytake.api.dto.ProductosCantidadDTO;
import com.bokytake.api.dto.ProductosDTO;

@Component
public class ProductosCantidadConvertidor implements IGenericConverter<ProductosCantidadDTO, ProductosDTO> {

	@Override
	public ProductosDTO apply(final ProductosCantidadDTO t) {
		// TODO Auto-generated method stub
		return t.getProducto();
	}

}
