package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numeroIntroducido; //Guarda numero introducido por usuario
		
		int sumaNumeros=0; //Guarda suma de los numeros introducidos por el usuario
		
		int cantidad=0; // Guarda la cantidad de veces que el usuario introduce un numero por consola
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero y le comunico como finalizar el programa
		System.out.println("Introduzca un numero entero positivo a sumar, si quiere finalizar la "
			+ "ejecucion del programa\ny obtener la media de la suma de todos los de numeros introducidos"
			+ " introduzca un numero negativo: ");
		
		//Asigno el valor del usuario a la variable numeroIntroducido mediante el Scanner
		numeroIntroducido = dogma.nextInt();
		
		//El bucle se seguira ejecutando mientras el numero introducido sea menor o igual a 0
		//El bucle dejara de ejecutarse cuando el numero introducido sea negativo
		while (numeroIntroducido>=0) {	
			
			/*Doy nuevo valor a variable sumaNumeros equivalente a
			la suma de sumaNumeros y numeroIntroducido mediante Scanner
			futuras sumas se realizaran con el nuevo valor de sumaNumeros y 
			el nuevo valor de numeroIntroducido*/
			sumaNumeros += numeroIntroducido;
			
			/*Incremento el valor de variable cantidad en +1 cada vez que introduzco un numero
			 * por consola para llevar la cuenta y despues usarla como divisor en la media*/
			++cantidad;
			
			/*Proporciono al usuario una nueva lectura de datos por Scanner
			 *  para que introduzca mas valores o finalize el bucle*/
			numeroIntroducido = dogma.nextInt();
			
		}
		/*Al introducir un numero negativo finalizo el bucle y compruebo operador ternario
		 *  que de ser true imprimira por pantalla la media en  tipo float (debido al cast)
		 *  y de ser false imprimira un mensaje de error*/
		System.out.print(cantidad!=0 ? "La media de la suma de todos los numeros introducidos es: " + (float) sumaNumeros/cantidad 
				
			: "Asegurese de introducir al menos un numero antes de finalizar el programa");
		
		//Cierro Scanner
		dogma.close();
	}

}
