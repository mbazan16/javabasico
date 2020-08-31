import com.javabasico.base.soluciones.Casa;

//Paso1: Incluir el Javadoc de esta clase y sus métodos. Lo más completo posible

/**
 * Clase para realizar pruebas de la clase Casa
 * 
 * @author MARIA
 * @version 1.0
 * @see Casa
 *
 */
public class TestPracticas {
	//Paso2:  Inicializar una variable tipo Casa de 3 habitaciones y 2 planta.
	Casa casa = new Casa(3, 2);
	//Paso3:  Declarar variables numHabitaciones y planta de tipo entero
	int numHabitaciones, planta;

	//Paso4:  Crear un método main
	/**
	 * Método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Paso5:  Inicializar la variable testPracticas del tipo de esta clase
		TestPracticas testPracticas = new TestPracticas();
		//Paso6:  Mostrar por consola el objeto casa de testPracticas
		System.out.println(testPracticas.casa);
		//Paso7:  Inicializar las variables nHab y pl con valor 2 y 1 respectivamente
		int nHab = 2, pl = 1;
		//Paso8:  Crear un objeto casa "casa" con el valor de las variables locales de metodo
		Casa casa = new Casa(nHab, pl);
		//Paso9:  Crear un objeto casa "casa2" con el valor de las variables locales de clase
		Casa casa2 = new Casa(testPracticas.numHabitaciones, testPracticas.planta);
		//Paso10:  Mostrar por consola todas las casas
		System.out.println("Casa TestPracticas:");
		System.out.println(testPracticas.casa);
		System.out.println("Casa:");
		System.out.println(casa);
		System.out.println("Casa2:");
		System.out.println(casa2);
		//Paso11:  Modificar los datos de la variable casa local a metodo con los valores de la
		// casa de testPracticas
		casa.modificar(testPracticas.casa);

		//Paso12:  Modificar los m2 a 100 de la casa global a toda la clase, usando la variable
		// casa local, sin pasar el objeto
		testPracticas.casa.modificar(casa.getNumhabitaciones(), casa.getPlanta(), casa.direccion, 100f);

		//Paso13:  Mostrar por consola todas las casas
		System.out.println("Casa TestPracticas:");
		System.out.println(testPracticas.casa);
		System.out.println("Casa:");
		System.out.println(casa);
		System.out.println("Casa2:");
		System.out.println(casa2);

	}

	//Paso14:  Realizar un código de instancia del objeto que inicialice una dirección y la
	// asigne a casa
	// Mostrar por pantalla la dirección
	{
		String direccion = "Alguna dirección";
		casa.direccion = direccion;
		System.out.println(direccion);
	}

}
