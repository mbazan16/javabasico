package com.javabasico.base.soluciones;

public class Casa {

	//Paso1: Inicializamos las variables de entero: numHabitaciones y planta por defecto a 0
	int numhabitaciones = 0;
	int planta = 0;
	//Paso2:  Declaramos una cadena de acceso publica llamada dirección
	public String direccion;
	//Paso3:  Declaramos y asignamos un objeto privado float para los m2, le damos un valor
	// por defecto
	private Float m2 = 0f;

	//Paso4:  Declaramos un constructor privado por defecto
	private Casa() {

	}
	//Paso5:  Declaramos un constructor publico con los atributos de tipo primitivo

	public Casa(int numhabitaciones, int planta) {
		super();
		this.numhabitaciones = numhabitaciones;
		this.planta = planta;
	}

	//Paso6:  Declarmos un constructor con todos los tipos numericos
	public Casa(int numhabitaciones, int planta, Float m2) {
		super();
		this.numhabitaciones = numhabitaciones;
		this.planta = planta;
		this.m2 = m2;
	}

	//Paso7:  Declaramos un constructor protegido con los datos de cadena
	protected Casa(String direccion) {
		super();
		this.direccion = direccion;
	}

	//Paso8:  Declararemos los métodos de acceso que sean necesarios para los atributos

	public int getNumhabitaciones() {
		return numhabitaciones;
	}

	public void setNumhabitaciones(int numhabitaciones) {
		this.numhabitaciones = numhabitaciones;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Float getM2() {
		return m2;
	}

	public void setM2(Float m2) {
		this.m2 = m2;
	}

	//Paso9:  Declaramos un metodo init sin parametros que invoque al constructor privado
	// y retorne una instancia de objeto
	public Casa init() {
		return new Casa();
	}

	//Paso10:  Declaramos un metodo modificar que modifique todos los atributos del objeto

	public void modificar(int numHabitaciones, int planta, String direccion, Float m2) {
		this.numhabitaciones = numHabitaciones;
		this.planta = planta;
		this.direccion = direccion;
		this.m2 = m2;

	}

	//Paso11:  Declaramos un metodo modificar que modifique todos los atributos del objeto
	// pasándole como parámetro únicamente otro objeto Casa
	public void modificar(Casa casa) {
		this.numhabitaciones = casa.getNumhabitaciones();
		this.planta = casa.planta;
		this.direccion = casa.direccion;
		this.m2 = casa.m2;

	}

	//Paso12:  Sobreescribir el método toString para que se muestren los atributos de esta clase
	@Override
	public String toString() {
		return "Casa [numhabitaciones=" + numhabitaciones + ", planta=" + planta + ", direccion=" + direccion + ", m2="
				+ m2 + "]";
	}

}
