package com.alga.work.imobiliaria.imobiliaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
public class SwaggerController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/swagger2")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
}
