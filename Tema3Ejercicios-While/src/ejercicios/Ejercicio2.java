package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numeroIntroducido; //Guarda numero introducido por usuario
		
		int cantidad=0; // Guarda la cantidad de veces que el usuario introduce un numero por consola
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero y le comunico como finalizar el programa
		System.out.println("Introduzca un numero entero positivo a contar, si quiere finalizar"
				+ " la ejecucion del programa\ny obtener la cantidad total de numeros introducidos"
				+ " introduzca un numero negativo: ");
		
		//Asigno el valor del usuario a la variable numeroIntroducido mediante el Scanner
		numeroIntroducido = dogma.nextInt();
		
		//El bucle se seguira ejecutando mientras el numero introducido sea menor o igual a 0
		//El bucle dejara de ejecutarse cuando el numero introducido sea negativo
		while (numeroIntroducido>=0) {	
			
			//sumo +1 a variable cantidad cada vez que el usuario introduce un numero para llevar la cuenta
			++cantidad;
			
			/*Proporciono al usuario una nueva lectura de datos por Scanner
			 *  para que introduzca mas valores o finalize el bucle*/
			numeroIntroducido = dogma.nextInt();
			
		}
		
		//Muestro la cantidad de numeros introducidos por el usuario mediante un mensaje en pantalla
		System.out.print("La cantidad total de los numeros introducidos es: " + cantidad);
		
		//Cierro Scanner
		dogma.close();

	}

}
