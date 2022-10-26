package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int alturaArbol; //Guarda la altura del arbol introducida por el usuario
		
		int arbolAlto = 0; //Guarda la altura del arbol mas alto introducido por el usuario
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero y le comunico como finalizar el programa
		System.out.println("Introduzca la altura en centimetros de cada arbol,"
			+ " una vez introducidas\ntodas las alturas, introduzca -1 para obtener la altura del arbol mas alto: ");
		
		//Asigno el valor del usuario a la variable alturaArbol mediante el Scanner
		alturaArbol = dogma.nextInt();
		
		//El bucle se seguira ejecutando mientras que variable alturaArbol sea diferente a -1
		//El bucle dejara de ejecutarse cuando que el variable alturaArbol sea igual -1
		while (alturaArbol!=-1) {
			
			/*Establezco que de cumplirse la condicion de que variable alturaArbol sea mayor
			 *  que variable arbolAlto se ejecute lo siguiente */
			if (alturaArbol>arbolAlto) {
				//variable arbolAlto adquiere valor de variable alturaArbol
				arbolAlto = alturaArbol;
			} 
			
			/*Proporciono al usuario una nueva lectura de datos por Scanner
			 * para que introduzca mas valores o finalize el bucle*/
			alturaArbol = dogma.nextInt();
		}
		
		//Al finalizar el bucle imprimo mensaje por pantalla mostrando la altura del arbol mas alto
		System.out.print("La altura del arbol mas alto es: " + arbolAlto + " centimetros");
		
		
		//Cierro Scanner
		dogma.close();
		
	}

}
