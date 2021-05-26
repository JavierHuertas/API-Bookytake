package com.bokytake.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bokytake.api.converter.PedidosDTOConverter;
import com.bokytake.api.converter.ProductosConverter;
import com.bokytake.api.converter.ProductosDTOConverter;
import com.bokytake.api.dao.IEstadosRepository;
import com.bokytake.api.dao.IPedidosRepository;
import com.bokytake.api.dao.IProductosPedidosRepository;
import com.bokytake.api.dao.IProductosRepository;
import com.bokytake.api.dao.ITiendaRepository;
import com.bokytake.api.dao.IUsuariosPedidoRepository;
import com.bokytake.api.dto.PedidosDTO;
import com.bokytake.api.dto.ProductosCantidadDTO;
import com.bokytake.api.dto.ProductosDTO;
import com.bokytake.api.entity.Pedidos;
import com.bokytake.api.entity.ProductosPedidoId;
import com.bokytake.api.entity.ProductosPedidos;
import com.bokytake.api.entity.Tienda;
import com.bokytake.api.entity.UsuarioPedido;

@Service
public class PedidosService {
	@Autowired
	IEstadosRepository estadosRepository;
	@Autowired
	IProductosRepository porductosRepo;
	@Autowired
	IPedidosRepository repository;
	@Autowired
	ITiendaRepository tiendaRepository;
	@Autowired
	IUsuariosPedidoRepository usuPedidoService;
	@Autowired
	IProductosPedidosRepository porductossabe;
	@Autowired
	ProductosConverter convetidor;
	@Autowired
	ProductosDTOConverter converterDTO;
	@Autowired
	ProductoService producto;
	@Autowired
	PedidosDTOConverter pedidoConverter;

	public void crearNuevoPedidos(final List<ProductosCantidadDTO> productos, final String idTienda,
			final String idUsuario) {
		final Tienda tienda = tiendaRepository.findById(idTienda).get();
		final UsuarioPedido usuario = usuPedidoService.findById(idUsuario).get();

		final Pedidos pedido = new Pedidos(estadosRepository.findById(6).get(), tienda, usuario, new Date(), null, 0);
		repository.save(pedido);
		ProductosPedidoId pedidoo = null;
		for (final ProductosCantidadDTO procandto : productos) {

			System.out.println(procandto.getCantidad());
			System.out.println(procandto.getProducto().getId());
			final ProductosDTO producto2 = converterDTO
					.convert(porductosRepo.findById(procandto.getProducto().getId()).get());

			producto2.setCantidad(producto2.getCantidad() - procandto.getCantidad());
			if (producto2.getCantidad() <= 0) {
				producto2.setMostrarApp(false);
			}
			producto.editarProducto(producto2);

			pedido.setImporte(pedido.getImporte() + procandto.getProducto().getPrecio() * procandto.getCantidad());

			pedidoo = new ProductosPedidoId(procandto.getProducto().getId(), pedido.getId());

			final ProductosPedidos proPed = new ProductosPedidos(pedidoo, procandto.getCantidad());

			porductossabe.save(proPed);

			// pedido.getProductoses().add(proPed);

		}

	}

	public List<PedidosDTO> pedidosPorUsuario(final String idUsuario) {

		return pedidoConverter.convert(repository.pedidosUsuario(idUsuario));
	}

}
