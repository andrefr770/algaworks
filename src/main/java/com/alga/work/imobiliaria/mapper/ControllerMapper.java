package com.alga.work.imobiliaria.mapper;

import com.alga.work.imobiliaria.imobiliaria.DTO.registarCasaDTO;
import com.alga.work.imobiliaria.imobiliaria.model.registarCasa;

public class ControllerMapper {
	
	public static registarCasa registarHome(registarCasaDTO registarcasaDTO) {
		
		registarCasa casa = new registarCasa();
		
		casa.setHomePlace(registarcasaDTO.getHomePlace());
		casa.setHomeType(registarcasaDTO.getHomeType());
		casa.setGoodFor(registarcasaDTO.getGoodFor());
		casa.setBussiness(registarcasaDTO.getBussiness());
		casa.setNmrBath(registarcasaDTO.getNmrBath());
		casa.setPrice(registarcasaDTO.getPrice());
		
		return casa;
	}
}
