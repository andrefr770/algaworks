package com.alga.work.imobiliaria.imobiliaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.alga.work.imobiliaria.imobiliaria.DTO.registarCasaDTO;
import com.alga.work.imobiliaria.imobiliaria.model.registarCasa;
import com.alga.work.imobiliaria.imobiliaria.service.registarCasaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class registarCasaController {

	@Autowired
	registarCasaService RegisterHome;

	@RequestMapping(method = RequestMethod.POST, value = "/registar/casa")
	public registarCasa registar(@RequestBody final registarCasaDTO registarcasaDTO) {
		return RegisterHome.registarHome(registarcasaDTO);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/apagar/casa")
	public registarCasa apagarCasa(@RequestBody final registarCasaDTO registarcasaDTO) {
		return RegisterHome.apagarCasa(registarcasaDTO);
	}
	
}