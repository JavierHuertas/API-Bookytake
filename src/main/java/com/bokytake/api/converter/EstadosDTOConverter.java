package com.bokytake.api.converter;

import org.springframework.stereotype.Component;

import com.bokytake.api.dto.EstadosDTO;
import com.bokytake.api.entity.Estados;

@Component
public class EstadosDTOConverter implements IGenericConverter<Estados, EstadosDTO> {

	@Override
	public EstadosDTO apply(final Estados t) {
		// TODO Auto-generated method stub
		return new EstadosDTO(t.getId(), t.getNombre());
	}

}
