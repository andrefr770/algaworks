package com.alga.work.imobiliaria.imobiliaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alga.work.imobiliaria.imobiliaria.model.registarCasa;

@Repository
public interface registarCasaRepository extends CrudRepository<registarCasa, Long> {
	registarCasa findByhomeId(Long homeId);
}
