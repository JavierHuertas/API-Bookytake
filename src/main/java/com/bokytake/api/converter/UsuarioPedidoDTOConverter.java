package com.bokytake.api.converter;

import org.springframework.stereotype.Component;

import com.bokytake.api.dto.UsuarioPedidoDTO;
import com.bokytake.api.entity.UsuarioPedido;

@Component
public class UsuarioPedidoDTOConverter implements IGenericConverter<UsuarioPedido, UsuarioPedidoDTO> {

	@Override
	public UsuarioPedidoDTO apply(final UsuarioPedido t) {

		return new UsuarioPedidoDTO(t.getId(), t.getNombre(), t.getEmail());
	}

}
