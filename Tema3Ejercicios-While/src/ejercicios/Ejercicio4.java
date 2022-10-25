package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numeroIntroducido, resto;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero, si quiere finalizar la ejecucion del programa introduzca 0: ");		 

		numeroIntroducido = dogma.nextInt();
		
		resto = numeroIntroducido%2;

		while (numeroIntroducido !=0) {
			
			if (resto==0) {
				System.out.print("El numero es par");
				
			} else {
				System.out.print("El numero es impar");
			}
			
			numeroIntroducido = dogma.nextInt();
			//solo funciona en el primer numero, simpre es par o siempre es impar
		}
		
		System.out.print("Programa cerrandose");
		
		dogma.close();
		
	}

}
