package com.alga.work.imobiliaria.imobiliaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alga.work.imobiliaria.imobiliaria.DTO.registarCasaDTO;
import com.alga.work.imobiliaria.imobiliaria.model.registarCasa;
import com.alga.work.imobiliaria.service.registarCasaService;

@Controller
@RequestMapping(value = "/register")
public class registarCasaController {
	
	@Autowired
	private registarCasaService registarcasaService;
	
	@PostMapping(value = "/home")
	public registarCasa registar(@RequestBody final registarCasaDTO registarcasaDTO) {
		return registarcasaService.registarHome(registarcasaDTO);
	}

}
