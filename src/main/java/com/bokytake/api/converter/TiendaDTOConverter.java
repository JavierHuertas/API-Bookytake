package com.bokytake.api.converter;

import org.springframework.stereotype.Component;

import com.bokytake.api.dto.TiendaDTO;
import com.bokytake.api.entity.Tienda;

@Component
public class TiendaDTOConverter implements IGenericConverter<Tienda, TiendaDTO> {

	@Override
	public TiendaDTO apply(final Tienda t) {

		return new TiendaDTO(t.getId(), t.getNombre(), t.getLocalizacion(), t.getContrasenia(), t.getEmail());

	}

}
