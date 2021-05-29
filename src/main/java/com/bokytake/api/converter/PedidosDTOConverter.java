package com.bokytake.api.converter;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bokytake.api.dao.IProductosPedidosRepository;
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
	@Autowired
	TiendaDTOConverter tiendaDTOconverter;
	@Autowired
	UsuarioPedidoDTOConverter usuarioDTOconverter;
	@Autowired
	EstadosDTOConverter estadosDTOconverter;

	@Autowired
	ProdPediConverter converterProPed;
	@Autowired
	IProductosPedidosRepository productos;

	// buscar en la tabla poductospedidos por id

	@Override
	public PedidosDTO apply(final Pedidos t) {

		final PedidosDTO pedido = new PedidosDTO();

		pedido.setTienda(tiendaDTOconverter.convert(t.getTienda()).getNombre());

		pedido.setEstado(t.getEstados().getNombre());

		pedido.setFreservas(new Date(t.getfreserva().getTime()));

		pedido.setProductoses(converterProPed.convert(productos.productosPorId(t.getId())));

		pedido.setImporte(t.getImporte());

		pedido.setFrecogida(null);

		pedido.setId(t.getId());

		/*
		 * new PedidosDTO(t.getId(), t.getEstados().getNombre(),
		 * tiendaDTOconverter.convert(t.getTienda()),
		 * usuarioDTOconverter.convert(t.getUsuarioPedido()), new
		 * Date(t.getFreservas().getTime()), new Date(t.getFrecogida().getTime()),
		 * t.getImporte());
		 */

		return new PedidosDTO(t.getId(), t.getEstados().getNombre(),
				tiendaDTOconverter.convert(t.getTienda()).getNombre(), new Date(t.getfreserva().getTime()), null,
				t.getImporte(), converterProPed.convert(productos.productosPorId(t.getId())));

	}

}
