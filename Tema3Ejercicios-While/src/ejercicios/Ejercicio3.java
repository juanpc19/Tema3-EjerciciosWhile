package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numeroIntroducido, sumaNumeros=0, cantidad=0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero positivo a sumar, si quiere finalizar la "
			+ "ejecucion del programa\ny obtener la media de la suma de todos los de numeros introducidos"
			+ " introduzca un numero negativo: ");
		
		numeroIntroducido = dogma.nextInt();
		
		while (numeroIntroducido>=0) {	
			
			/*Doy nuevo valor a variable sumaNumeros (iniciada como 0) equivalente a
			la suma de sumaNumeros y numeroIntroducido mediante Scanner
			futuras sumas se realizaran con el nuevo valor de sumaNumeros y 
			el nuevo valor de numeroIntroducido*/
			sumaNumeros += numeroIntroducido;
			
			/*Incremento el valor de variable cantidad en +1 cada vez que introduzco un numero
			 * por consola para despues usarla como divisor en la media*/
			++cantidad;
			
			numeroIntroducido = dogma.nextInt();
			
		}
		/*Al introducir un numero negativo finalizo el bucle e imprimo por pantalla
		el siguiente mensaje en el que divido la suma de todos los numeros introducidos 
		(variable sumaNumeros) entre cantidad (variable cantidad) */
		System.out.print(cantidad!=0 ? "La media de la suma de todos los numeros introducidos es: " + (float) sumaNumeros/cantidad 
				
				: "Asegurese de introducir al menos un numero antes de finalizar el programa");
		
		dogma.close();
	}

}
