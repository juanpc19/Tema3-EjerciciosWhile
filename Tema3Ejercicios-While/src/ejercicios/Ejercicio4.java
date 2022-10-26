package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero, si quiere finalizar la "
			+ "ejecucion del programa introduzca 0: ");		 

		numeroIntroducido = dogma.nextInt();

		while (numeroIntroducido !=0) {
			
			if (numeroIntroducido%2==0) {
				System.out.println("El numero es par");
				
			} else {
				System.out.println("El numero es impar");
			}
			
			numeroIntroducido = dogma.nextInt();
		
		}
		
		dogma.close();
		
	}

}
