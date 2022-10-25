package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numeroIntroducido, sumaPositivos = 0, sumaNegativos = 0, cantidad = 0, cantidadNegativos = 0, cantidadCeros = 0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca un numero, el programa finalizara dandole los resultados tras introducir 10 numeros: ");		

		while (cantidad<10) {
			
			numeroIntroducido = dogma.nextInt();
			
			if (numeroIntroducido>=1) {
				sumaPositivos = sumaPositivos +numeroIntroducido;
			
			} else if (numeroIntroducido<=-1) {
				sumaNegativos = sumaNegativos +numeroIntroducido;
				++cantidadNegativos;
				
			} else {
				++cantidadCeros;
				}
			++cantidad;
			}
		
		System.out.print("Suma total de los numeros positivos introducidos: " + sumaPositivos  + ". Media de los numeros negativos introducidos: " + (float) sumaNegativos/cantidadNegativos + ". Cantidad de veces que ha introducido 0: " + cantidadCeros);	
		
		dogma.close();
	}

}
