package com.alga.work.imobiliaria.imobiliaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.alga.work.imobiliaria.imobiliaria.DTO.registarCasaDTO;
import com.alga.work.imobiliaria.imobiliaria.mapper.ControllerMapper;
import com.alga.work.imobiliaria.imobiliaria.model.registarCasa;
import com.alga.work.imobiliaria.imobiliaria.repository.registarCasaRepository;

@Component
public class registarCasaService {

	@Autowired
	registarCasaRepository casaRepository;
	
	public registarCasa registarHome(registarCasaDTO registarcasaDTO) {
		registarCasa casa = ControllerMapper.registarHome(registarcasaDTO);
		return casaRepository.save(casa); 
	}
	
	public registarCasa apagarCasa(registarCasaDTO registarcasaDTO) {
		registarCasa casa = new registarCasa();
		
		Long casaID = registarcasaDTO.getHomeId();
		
		casaRepository.delete(casaID);
		return casa;
	}	
}
