package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numeroIntroducido; //Guarda numero introducido por usuario
		
		int sumaNumeros=0; //Guarda suma de los numeros introducidos por el usuario
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero y le comunico como finalizar el programa
		System.out.println("Introduzca un numero entero positivo a sumar: si quiere finalizar la "
				+ "ejecucion del programa\ny obtener la suma final de numeros introducidos"
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
			
			/*Proporciono al usuario una nueva lectura de datos por Scanner
			 *  para que introduzca mas valores o finalize el bucle*/
			numeroIntroducido = dogma.nextInt();
		}
		
		/*De finalizarse el bucle se imprimira por pantalla un mensaje con
		el ultimo valor dado a SumaNumeros*/
		System.out.print("La suma final de los numeros introducidos es: " + sumaNumeros);
		
		//Cierro Scanner
		dogma.close();
	}

}
