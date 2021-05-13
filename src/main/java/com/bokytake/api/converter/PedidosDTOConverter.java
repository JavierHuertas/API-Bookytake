package com.bokytake.api.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bokytake.api.dto.PedidosDTO;
import com.bokytake.api.entity.Pedidos;

@Component
public class PedidosDTOConverter implements IGenericConverter<Pedidos, PedidosDTO> {

	// public PedidosDTO(final Integer id, final Estados estados, final Tienda
	// tienda, final UsuarioPedido usuarioPedido,
	// final Date freservas, final Date frecogida, final float importe, final
	// Set<Productos> productoses) {

	@Autowired
	ProductosDTOConverter proDTOConvert;

	@Override
	public PedidosDTO apply(final Pedidos t) {

		return new PedidosDTO(t.getId(), t.getEstados(), t.getTienda(), t.getUsuarioPedido(), t.getFreservas(),
				t.getFrecogida(), t.getImporte());

	}

}
