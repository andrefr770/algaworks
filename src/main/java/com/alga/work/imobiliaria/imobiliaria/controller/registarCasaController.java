package com.alga.work.imobiliaria.imobiliaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alga.work.imobiliaria.imobiliaria.DTO.registarCasaDTO;
import com.alga.work.imobiliaria.imobiliaria.model.registarCasa;
import com.alga.work.imobiliaria.service.registarCasaService;

@RestController
@RequestMapping(value = "/home")
@CrossOrigin(origins = "*", maxAge = 3600)
public class registarCasaController {

	@Autowired
	registarCasaService RegisterHome;	
	
	@PostMapping(value = "/register")
	public registarCasa registar(@RequestBody final registarCasaDTO registarcasaDTO) {
		return RegisterHome.registarHome(registarcasaDTO);
	}
	
	@PostMapping(value = "/deleteHome")
	public registarCasa apagarCasa(@RequestBody final registarCasaDTO registarcasaDTO) {
		return RegisterHome.apagarCasa(registarcasaDTO);
	}
	
	@Bean
	public registarCasaService registarHome() {
		return RegisterHome;
	}
	
}