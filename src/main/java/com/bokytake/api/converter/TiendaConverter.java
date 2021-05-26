package com.bokytake.api.converter;

import org.springframework.stereotype.Component;

import com.bokytake.api.dto.TiendaDTO;
import com.bokytake.api.entity.Tienda;

@Component
public class TiendaConverter implements IGenericConverter<TiendaDTO, Tienda> {

	@Override
	public Tienda apply(final TiendaDTO t) {

		return new Tienda(t.getId(), t.getNombre(), t.getLocalizacion(), t.getContrasenia(), t.getEmail());
	}

}
