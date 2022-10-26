package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int numeroIntroducido, numeroRandom = (int) (Math.random()*100);
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca el numero que cree que es el numero secreto entre 1 y 100: ");	
		
		numeroIntroducido = dogma.nextInt();
		
		while ((numeroIntroducido!=numeroRandom) && (numeroIntroducido!=-1)){
			
		 if (numeroIntroducido>numeroRandom) {
				System.out.println("Su numero es mayor al numero secreto");
				
				} else if (numeroIntroducido<numeroRandom) {
					System.out.println("Su numero es menor al numero secreto");
					}
			
			numeroIntroducido = dogma.nextInt();
		}
		
		if (numeroRandom==numeroIntroducido) {
			System.out.print("Enhorabuena has adivinado el numero secreto!");
			
		} else {
			System.out.print("Usted se ha rendido");
		}
		
		dogma.close();
	}

}
