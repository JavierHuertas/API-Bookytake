package com.bokytake.api.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bokytake.api.dao.IProductosRepository;
import com.bokytake.api.dto.ProductosCantidadDTO;
import com.bokytake.api.entity.ProductosPedidos;

@Component
public class ProdPediConverter implements IGenericConverter<ProductosPedidos, ProductosCantidadDTO> {

	@Autowired
	IProductosRepository producto;
	@Autowired
	ProductosDTOConverter converttidor;

	@Override
	public ProductosCantidadDTO apply(final ProductosPedidos t) {

		final ProductosCantidadDTO procant = new ProductosCantidadDTO(
				converttidor.convert(producto.findById(t.getId().getProductoId()).get()), t.getCantidad());

		return procant;
	}

}
