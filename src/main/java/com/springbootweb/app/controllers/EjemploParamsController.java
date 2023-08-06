package com.springbootweb.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Ejemplo para mandar parámetros por URL
 * */

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	@GetMapping("/string")
	public String param(@RequestParam(required=false, defaultValue = "No se recibieron datos") String texto, Model model) {
		
		model.addAttribute("resultado", "El texto enviado es: "+ texto);
		
		return "params/ver";
	}
	
	@GetMapping("/")
	public String index() {
		return "params/index";
	}
	
}
