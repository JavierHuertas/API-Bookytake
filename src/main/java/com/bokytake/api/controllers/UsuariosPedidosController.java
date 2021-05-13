package com.bokytake.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bokytake.api.dto.UsuarioPedidoDTO;
import com.bokytake.api.service.UsuarioPedidosService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/usuarios", method = { RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT,
		RequestMethod.POST })
public class UsuariosPedidosController {

	@Autowired
	UsuarioPedidosService usuarioService;

	@PostMapping("/nuevo")
	@ResponseBody
	public ResponseEntity<?> saveProducto(@RequestBody final UsuarioPedidoDTO newUsuario) {
		usuarioService.saveUsuario(newUsuario);
		final Map<String, Object> response = new HashMap<>();
		response.put("message", "Producto creado correctamente.");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@PutMapping("/editar")
	@ResponseBody
	public ResponseEntity<?> editarProducto(@RequestBody final UsuarioPedidoDTO editUsuario) {
		usuarioService.modificarusuario(editUsuario);
		final Map<String, Object> response = new HashMap<>();
		response.put("message", "Usuario editado correctamente.");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
