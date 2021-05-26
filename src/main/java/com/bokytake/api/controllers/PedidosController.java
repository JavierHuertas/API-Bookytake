package com.bokytake.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bokytake.api.dto.PedidosDTO;
import com.bokytake.api.dto.ProductosCantidadDTO;
import com.bokytake.api.service.PedidosService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/pedidos", method = { RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT,
		RequestMethod.POST })
public class PedidosController {

	@Autowired
	PedidosService servicio;

	@PostMapping("/nuevo/{idTeinda}/{idUsuario}")
	@ResponseBody
	public void saveProducto(@RequestBody final List<ProductosCantidadDTO> productos,
			@PathVariable(name = "idTeinda") final String idTienda,
			@PathVariable(name = "idUsuario") final String idUsuario) {

		servicio.crearNuevoPedidos(productos, idTienda, idUsuario);
	}

	@GetMapping("/usuario/{id}")
	@ResponseBody
	public ResponseEntity<List<PedidosDTO>> getPedidosUsuario(@PathVariable final String id) {
		return new ResponseEntity<>(servicio.pedidosPorUsuario(id), HttpStatus.OK);
	}

}
