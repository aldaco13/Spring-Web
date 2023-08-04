package com.springbootweb.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
	
	@GetMapping("/map")
	public void pageMap(Map<String, Object> map) {
		System.out.println("entra pageMap");
		map.put("descMap", "Texto insertado con thymeleaf desde el metodo indexMap usando \"Map<String, Object>\"");
		map.put("tituloMap", "Hola Spring Framework! pageMap");		
	}

}
