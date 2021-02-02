package com.alga.work.imobiliaria.service;

import com.alga.work.imobiliaria.imobiliaria.DTO.registarCasaDTO;
import com.alga.work.imobiliaria.imobiliaria.model.registarCasa;
import com.alga.work.imobiliaria.mapper.ControllerMapper;

public class registarCasaService {

	public registarCasa registarHome(registarCasaDTO registarcasaDTO) {
		registarCasa casa = ControllerMapper.registarHome(registarcasaDTO);
		return casa;
	}
	
}
