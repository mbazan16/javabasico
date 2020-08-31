import com.javabasico.base.soluciones.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		//Inicializamos dos variables de tipo entero
		int numero1 =  1234;
		int numero2 = 2;
		
		//Invocamos a los métodos estáticos de la calculadora
		Calculadora.suma(numero1, numero2);
		Calculadora.resta(numero1, numero2);
		Calculadora.multiplicacion(numero1, numero2);
		Calculadora.division(numero1, numero2);
		
		//Invocar al método no estático para que realice la suma de lo  números
		
		Calculadora calculadora = new Calculadora();
		calculadora.sumaDos(numero1, numero2);

	}

}
