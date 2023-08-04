package com.springbootweb.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	public static final String INDEX = "index";
	
	/*@GetMapping({"/index", "/", "/home"})
	public String index() {
		System.out.println(INDEX);
		return INDEX;
	}*/
	
	@GetMapping("/index")
	public String indexModel(Model model) {
		System.out.println("entra indexModel");
		model.addAttribute("descModel", "Texto insertado con thymeleaf desde el metodo index usando \"model.addAttribute\"");
		model.addAttribute("tituloModel", "Hola Spring Framework! indexModel");
		return INDEX;
		
	}
	
	@GetMapping("/map")
	public String indexMap(Map<String, Object> map) {
		System.out.println("entra indexMap");
		map.put("descMap", "Texto insertado con thymeleaf desde el metodo indexMap usando \"Map<String, Object>\"");
		map.put("tituloMap", "Hola Spring Framework! indexMap");
		return INDEX;
		
	}
	
}
