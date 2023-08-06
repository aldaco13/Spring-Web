package com.springbootweb.app.models;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private String genero;
	
	
	
	public Usuario() {
		
	}
	
	
	public Usuario(String nombre, String apellido, String genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	

}
