package com.bokytake.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bokytake.api.dto.ProductosDTO;
import com.bokytake.api.service.IProductoService;
import com.bokytake.api.service.ProductoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/productos", method = { RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT,
		RequestMethod.POST })
public class ProductosController {

	@Autowired
	private IProductoService cc;

	@GetMapping("/tienda/{id}")
	@ResponseBody
	public ResponseEntity<List<ProductosDTO>> getProductosPortienda(@PathVariable final String id) {
		return new ResponseEntity<>(((ProductoService) cc).listarProductos(id), HttpStatus.OK);
	}

	@DeleteMapping("/borrar/{idborrar}")
	@ResponseBody
	public ResponseEntity<?> borrarProducto(@PathVariable final Integer idborrar) {
		((ProductoService) cc).borrarProducto(idborrar);
		final Map<String, Object> response = new HashMap<>();
		response.put("message", "Producto borrado correctamente.");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@PostMapping("/tienda/{id}/nuevo")
	@ResponseBody
	public ResponseEntity<?> saveProducto(@RequestBody final ProductosDTO producto, @PathVariable final String id) {
		((ProductoService) cc).guardarNuevoProducto(producto, id);
		final Map<String, Object> response = new HashMap<>();
		response.put("message", "Producto creado correctamente.");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@PutMapping("/editar")
	@ResponseBody
	public ResponseEntity<?> editarProducto(@RequestBody final ProductosDTO producto) {
		((ProductoService) cc).editarProducto(producto);
		final Map<String, Object> response = new HashMap<>();
		response.put("message", "Producto editado correctamente.");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
