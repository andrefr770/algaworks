package com.alga.work.imobiliaria.imobiliaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alga.work.imobiliaria.imobiliaria.model.registarCasa;

@Repository
public interface registarCasaRepository extends JpaRepository<registarCasa, Long> {
	registarCasa findByHomeId(Long homeId);
}
