package com.bokytake.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bokytake.api.converter.UsuarioPedidoDTOConverter;
import com.bokytake.api.dao.IUsuariosPedidoRepository;
import com.bokytake.api.dto.UsuarioPedidoDTO;
import com.bokytake.api.entity.UsuarioPedido;

@Service
public class UsuarioPedidosService implements IUsuarioPedidoService {

	@Autowired
	IUsuariosPedidoRepository usuarioRepo;

	@Autowired
	UsuarioPedidoDTOConverter usuarioPedidoDTOConverter;

	public void saveUsuario(final UsuarioPedidoDTO nuevoUsuario) {
		final UsuarioPedido nuevo = new UsuarioPedido(nuevoUsuario.getId(), nuevoUsuario.getNombre(),
				nuevoUsuario.getEmail());
		usuarioRepo.save(nuevo);
	}

	// cuiudado con el email y los apellidos (Por ahora solo se cambia el nombre)
	public void modificarusuario(final UsuarioPedidoDTO editado) {
		usuarioRepo.editarUsuario(editado.getId(), editado.getNombre());// , editado.getEmail()
	}

}
