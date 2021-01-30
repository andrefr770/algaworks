package com.alga.work.imobiliaria.imobiliaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
   @RequestMapping(value = "/index")
   public String index() {
      return "index";
   }
   
   @RequestMapping(value="/procurarCasa")
   public String procurarCasa() {
	   return "procurarCasa";
   }
   
   @RequestMapping(value="/registarCasa")
   public String registarCasa() {
	   return "registarCasa";
   }
}