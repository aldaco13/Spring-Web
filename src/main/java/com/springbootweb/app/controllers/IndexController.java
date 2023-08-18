package com.springbootweb.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootweb.app.models.Usuario;

@Controller
public class IndexController {
	
	public static final String INDEX = "index";
	public static final String TRUE = "true";
	
	@Value("${texto.indexController.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexController.perfil.titulo}")
	private String textoPerfil;
	@Value("${texto.indexController.listar.titulo}")
	private String textoListar;
	
	/*@GetMapping({"/index", "/", "/home"})
	public String index() {
		System.out.println(INDEX);
		return INDEX;
	}*/
	
	@GetMapping({"/index", "/home"})
	public String indexModel(Model model) {
		System.out.println("entra indexModel");
		model.addAttribute("muestraDesc", true);
		model.addAttribute("descModel", "Texto insertado con thymeleaf desde el metodo index usando \"model.addAttribute\"");
		model.addAttribute("tituloModel", textoIndex);
		return INDEX;
		
	}
	
	@GetMapping("/rutaAux")
	public String indexAux(Model model) {
		model.addAttribute("muestraAux", true);
		System.out.println("entra indexAux");
		return INDEX;
		
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario user = new Usuario();
		user.setNombre("Omar");
		user.setApellido("Aldaco");
		user.setGenero("H");
		model.addAttribute("titulo", textoPerfil);
		model.addAttribute("usuario", user);
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", textoListar);
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> llenarUsuarios(){
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario u2 = new Usuario();
		u2.setNombre("Diego");
		u2.setApellido("Aldaco");
		
		Usuario u3 = new Usuario();
		u3.setNombre("Virginia");
		u3.setApellido("Montalvo");
		
		usuarios.add(new Usuario("Omar", "Aldaco", "H"));
		usuarios.add(u2);
		usuarios.add(u3);
		
		return usuarios;
	}
		
}
