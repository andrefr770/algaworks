package com.alga.work.imobiliaria.imobiliaria.mapper;

import com.alga.work.imobiliaria.imobiliaria.DTO.registarCasaDTO;
import com.alga.work.imobiliaria.imobiliaria.model.registarCasa;

public class ControllerMapper {

	public static registarCasa registarHome(registarCasaDTO registarcasaDTO) {
		registarCasa casa = new registarCasa(registarcasaDTO.getHomePlace(), registarcasaDTO.getHomeType(), registarcasaDTO.getBussiness(), registarcasaDTO.getPrice(), registarcasaDTO.getGoodFor(), registarcasaDTO.getNmrBath(), registarcasaDTO.getAddress());

		return casa;
	}
}
