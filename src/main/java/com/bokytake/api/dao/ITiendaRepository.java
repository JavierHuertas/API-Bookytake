package com.bokytake.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bokytake.api.entity.Tienda;

@Repository
public interface ITiendaRepository extends JpaRepository<Tienda, String> {

}
