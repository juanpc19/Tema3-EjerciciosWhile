package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numeroIntroducido; //Guarda numero introducido por usuario
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero y le comunico como finalizar el programa
		System.out.println("Introduzca un numero, si quiere finalizar la "
			+ "ejecucion del programa introduzca 0: ");		 

		//Asigno el valor del usuario a la variable numeroIntroducido mediante el Scanner
		numeroIntroducido = dogma.nextInt();

		//El bucle se seguira ejecutando mientras el numero introducido distinto a 0
		//El bucle dejara de ejecutarse cuando el numero introducido sea 0
		while (numeroIntroducido !=0) {
			
			/*Establezco que de ser el modulo (resto) del numero introducido dividido entre 2 igual a 0
			se ejecute mensaje diciendo que el numero es par*/
			if (numeroIntroducido%2==0) {
				System.out.println("El numero es par");
			
			/*Establezco que de ser el modulo (resto) del numero introducido dividido entre 2 diferente a 0
			se ejecute mensaje diciendo que el numero es impar*/
			} else {
				System.out.println("El numero es impar");
			}
			
			/*Proporciono al usuario una nueva lectura de datos por Scanner
			 *  para que introduzca mas valores o finalize el bucle*/
			numeroIntroducido = dogma.nextInt();
		
		}
		
		//Cierro Scanner
		dogma.close();
		
	}

}
