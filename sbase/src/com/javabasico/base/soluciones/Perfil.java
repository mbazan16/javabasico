package com.javabasico.base.soluciones;

public class Perfil {
	// Construir un Bean Perfil, que tenga como atributos el identificador  y el nombre
	// Long y el nombre.
	private Long id;
	private String nombre;

	public Perfil() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
