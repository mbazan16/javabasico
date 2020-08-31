package com.javabasico.base.soluciones;

//Implementar el código necesario para realizar un CRUD de Perfil. Realizar una clase de negocio
public class GesPerfil {

	Perfil perfil;

	public Perfil leer(Long id) {

		Perfil perfil;
		// Las dos lineas siguientes desaparecerían y leeriamos de base de datos el
		// elemento
		perfil = new Perfil();
		perfil.setId(id);

		return perfil;

	}

	public void crear(Perfil perfil) {
		// Almacenariamos los valores del perfil en la base de datos de un
		// perfil inexistente
	}

	public void update(Perfil perfil) {

		// Almacenariamos los valores del perfil en la base de datos de un
		// perfil existente

	}

	public void delete(Long id) {
		// Eliminariamos el elemento perfil que concidiera con ese id.
	}

}
