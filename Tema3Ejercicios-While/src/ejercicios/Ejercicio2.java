package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numeroIntroducido, cantidad=0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero positivo a contar, si quiere finalizar"
				+ " la ejecucion del programa\ny obtener la cantidad total de numeros introducidos"
				+ " introduzca un numero negativo: ");
		
		numeroIntroducido = dogma.nextInt();
		
		while (numeroIntroducido>=0) {	
			
			++cantidad;
			
			numeroIntroducido = dogma.nextInt();
			
			//Incremento el valor de variable cantidad en +1 cada vez que introduzco un numero por consola
			
			
		}
		
		System.out.print("La cantidad total de los numeros introducidos es: " + cantidad);
		
		dogma.close();

	}

}
