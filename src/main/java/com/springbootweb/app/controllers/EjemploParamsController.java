package com.springbootweb.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	/*
	 * Ejemplo para mandar parámetros por URL
	 * */
	@GetMapping("/string")
	public String param(@RequestParam(required=false, defaultValue = "No se recibieron datos") String texto, Model model) {
		
		model.addAttribute("resultado", "El texto enviado es: "+ texto);
		
		return "params/ver";
	}
	
	/*
	 * Ejemplo para recibir parámetros por URL
	 * */
	@GetMapping("/")
	public String index() {
		return "params/index";
	}
	
	/*
	 * Ejemplo para recibir Integer
	 * */
	
	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		
		model.addAttribute("resultado", "El saludo enviado es: '" + saludo + "' y el número enviado es: '" + numero + "'");
		return "params/ver";
	}
	
	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request, Model model) {
		
		String saludo = request.getParameter("saludo");
		
		Integer numero = null;
		try {
			numero = Integer.parseInt(request.getParameter("numero"));
		}catch(NumberFormatException e) {
			numero = 0;
		}
		model.addAttribute("resultado", "El saludo enviado es: '" + saludo + "' y el número enviado es: '" + numero + "'");
		return "params/ver";
	}
	
	
}
