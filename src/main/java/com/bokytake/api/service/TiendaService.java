package com.bokytake.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bokytake.api.dao.ITiendaRepository;
import com.bokytake.api.dto.ProductosDTO;
import com.bokytake.api.dto.TiendaDTO;
import com.bokytake.api.entity.Tienda;

@Service
public class TiendaService implements ITiendaService {

	@Autowired
	ITiendaRepository tiendaRepo;

	public void crearTienda(final TiendaDTO newtienda) {
		final Tienda tienda = new Tienda(newtienda.getId(), newtienda.getNombre(), newtienda.getLocalizacion(),
				newtienda.getContrasenia(), newtienda.getEmail());
		tiendaRepo.save(tienda);

	}

	@Override
	public List<ProductosDTO> listarProductos(final String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Tienda devolverTienda(final String id) {
		return tiendaRepo.findById(id).get();
	}

}
