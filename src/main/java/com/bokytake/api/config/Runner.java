package com.bokytake.api.config;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.bokytake.api.dao.IEstadosRepository;
import com.bokytake.api.dao.IPedidosRepository;
import com.bokytake.api.dao.IProductosPedidosRepository;
import com.bokytake.api.dao.IProductosRepository;
import com.bokytake.api.dao.ITiendaRepository;
import com.bokytake.api.dao.IUsuariosPedidoRepository;
import com.bokytake.api.entity.Estados;
import com.bokytake.api.entity.Pedidos;
import com.bokytake.api.entity.Productos;
import com.bokytake.api.entity.ProductosPedidoId;
import com.bokytake.api.entity.ProductosPedidos;
import com.bokytake.api.entity.Tienda;
import com.bokytake.api.entity.UsuarioPedido;

@Configuration
public class Runner {

	IEstadosRepository estados;
	IUsuariosPedidoRepository usuarios;
	ITiendaRepository tiendas;
	IPedidosRepository pedidos;
	IProductosRepository productos;
	IProductosPedidosRepository proPed;

	public Runner(final IEstadosRepository estados, final IUsuariosPedidoRepository usuarios,
			final ITiendaRepository tiendas, final IPedidosRepository pedidos, final IProductosRepository productos,
			final IProductosPedidosRepository proPed) {
		super();
		this.estados = estados;
		this.usuarios = usuarios;
		this.tiendas = tiendas;
		this.pedidos = pedidos;
		this.productos = productos;
		this.proPed = proPed;
	}

	@Profile("local")
	@Bean
	public ApplicationRunner localApplicationRunnerImpManager() {
		return arg -> {
			runnerData();
		};
	}

	private void runnerData() {
		final Estados estado1 = estados.save(new Estados(1, "Listo"));
		final Estados estado2 = estados.save(new Estados(2, "Preparado"));
		final Estados estado3 = estados.save(new Estados(3, "Aceptado"));
		final Estados estado4 = estados.save(new Estados(4, "Denegado"));
		final Estados estado5 = estados.save(new Estados(5, "Finalizado"));
		final Estados estado6 = estados.save(new Estados(6, "En espera..."));

		final Tienda t1 = tiendas.save(new Tienda("keytienda1", "federico1", "su casa1", "123456", "email@yoquese.es"));

		final List<Productos> ptienda1 = Arrays.asList(productos.save(new Productos(t1, "zapas", 50, 50, true,
				"https://firebasestorage.googleapis.com/v0/b/jardinerias-paca.appspot.com/o/imagenProdcutos%2Fbicirota.jpg?alt=media&token=442ce835-bd84-400b-8038-9a81d5ed7184",
				"https://firebasestorage.googleapis.com/v0/b/jardinerias-paca.appspot.com/o/imagenProdcutos%2Fbicirota.jpg?alt=media&token=442ce835-bd84-400b-8038-9a81d5ed7184")),
				productos.save(new Productos(t1, "camisa", 50, 50, true,
						"https://firebasestorage.googleapis.com/v0/b/jardinerias-paca.appspot.com/o/imagenProdcutos%2Fbicirota.jpg?alt=media&token=442ce835-bd84-400b-8038-9a81d5ed7184",
						"https://firebasestorage.googleapis.com/v0/b/jardinerias-paca.appspot.com/o/imagenProdcutos%2Fbicirota.jpg?alt=media&token=442ce835-bd84-400b-8038-9a81d5ed7184")),
				productos.save(new Productos(t1, "pendiente", 50, 50, true,
						"https://firebasestorage.googleapis.com/v0/b/jardinerias-paca.appspot.com/o/imagenProdcutos%2Fbicirota.jpg?alt=media&token=442ce835-bd84-400b-8038-9a81d5ed7184",
						"https://firebasestorage.googleapis.com/v0/b/jardinerias-paca.appspot.com/o/imagenProdcutos%2Fbicirota.jpg?alt=media&token=442ce835-bd84-400b-8038-9a81d5ed7184")),
				productos.save(new Productos(t1, "Bicicleta", 50, 50, true,
						"https://firebasestorage.googleapis.com/v0/b/jardinerias-paca.appspot.com/o/imagenProdcutos%2Fbicirota.jpg?alt=media&token=442ce835-bd84-400b-8038-9a81d5ed7184",
						"https://firebasestorage.googleapis.com/v0/b/jardinerias-paca.appspot.com/o/imagenProdcutos%2Fbicirota.jpg?alt=media&token=442ce835-bd84-400b-8038-9a81d5ed7184")));
		for (final Productos c : ptienda1) {
			productos.save(c);

		}

		final Tienda t2 = tiendas.save(new Tienda("keytienda2", "federico2", "su casa", "123456", "email@yoquese.es"));
		final List<Productos> ptienda2 = Arrays.asList(
				productos.save(new Productos(t2, "zapas", 50, 50, true, "es muy bonito y sirve para muchas cosas",
						"imagenxD11")),
				productos.save(new Productos(t2, "camisa", 50, 50, true, "es muy bonito y sirve para muchas cosas",
						"imagenxD22")),
				productos.save(new Productos(t2, "pendiente", 50, 50, true, "es muy bonito y sirve para muchas cosas",
						"imagenxD33")),
				productos.save(new Productos(t2, "aviones", 50, 50, true, "es muy bonito y sirve para muchas cosas",
						"imagenxD44")));
		for (final Productos c : ptienda2) {
			productos.save(c);

		}
		final Tienda t3 = tiendas.save(new Tienda("keytienda3", "federico3", "su casa2", "123456", "email@yoquese.es"));
		final Tienda t4 = tiendas.save(new Tienda("keytienda4", "federico4", "su casa3", "123456", "email@yoquese.es"));

		// final UsuarioPedido u1 = usuarios.save(new UsuarioPedido("usuarioKey1",
		// "prueba1", "ramon1", "jjj1@prueba.es"));
		// final UsuarioPedido u2 = usuarios.save(new UsuarioPedido("usuarioKey2",
		// "prueba2", "ramon2", "jjj2@prueba.es"));
		final UsuarioPedido u3 = usuarios.save(new UsuarioPedido("usuarioKey3", "prueba3", "ramon3", "jjj3@prueba.es"));

		final Pedidos p1 = new Pedidos(estado2, t4, u3, new Date(), new Date(), 150);
		pedidos.save(p1);

		final ProductosPedidoId pP1 = new ProductosPedidoId(ptienda2.get(0).getId(), p1.getId());
		final ProductosPedidos proPed = new ProductosPedidos(pP1, 50);

		this.proPed.save(proPed);
		// proPed.

		/*
		 * final UsuarioPedido u1 = usuarios .save(new UsuarioPedido("keyid1", "Ramon",
		 * "Fernandez", "sucorreo@pedro.es", null)); final UsuarioPedido u2 = usuarios
		 * .save(new UsuarioPedido("keyid2", "Ramon", "Fernandez", "sucorreo@pedro.es",
		 * null)); final UsuarioPedido u3 = usuarios .save(new UsuarioPedido("keyid3",
		 * "Ramon", "Fernandez", "sucorreo@pedro.es", null));
		 */
	}

}
