package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int alturaArbol, arbolAlto = 0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca la altura en centimetros de cada arbol,"
			+ " una vez introducidas\ntodas las alturas, introduzca -1 para obtener la altura del arbol mas alto: ");
		
		alturaArbol = dogma.nextInt();
		
		while (alturaArbol!=-1) {
			
			if (alturaArbol>arbolAlto) {
				arbolAlto = alturaArbol;
			} 
			
			alturaArbol = dogma.nextInt();
		}
		
		System.out.print("La altura del arbol mas alto es: " + arbolAlto + " centimetros");
		
		dogma.close();
		
	}

}
