package com.bokytake.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bokytake.api.dto.TiendaDTO;
import com.bokytake.api.service.TiendaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/tienda", method = { RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT,
		RequestMethod.POST })
public class TiendaController {

	@Autowired
	TiendaService tiendaService;

	@PostMapping("/new")
	@ResponseBody
	public ResponseEntity<?> saveProducto(@RequestBody final TiendaDTO newTienda) {
		tiendaService.crearTienda(newTienda);
		final Map<String, Object> response = new HashMap<>();
		response.put("message", "Producto creado correctamente.");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
