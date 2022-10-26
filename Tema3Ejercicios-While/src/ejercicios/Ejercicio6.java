package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int edad, sumaEdades = 0, numeroAlumnos = 0, alumnosMayor = 0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca con numeros las edades de los alumnos, "
			+ "el programa finalizara dandole los resultados tras introducir un numero negativo: ");		
		
		edad = dogma.nextInt();
		
		while (edad>=0) {
			
		
			sumaEdades += edad;
			++numeroAlumnos;
			
			
			if (edad>=18) {
				++alumnosMayor;	
			} 
			
			edad = dogma.nextInt();
			
		}

		if (numeroAlumnos==0) {
			System.out.print("Debe introducir al menos un valor positivo antes de introducir"
				+ " un valor negativo para finalizar el programa correctamente. ");
		} else {
	
		System.out.print("Mayor edad: " + alumnosMayor + "\nEdades sumadas: " + sumaEdades + " \nCantidad alumnos: " + numeroAlumnos + "\nMedia: " + (float) sumaEdades/numeroAlumnos);
		
		}
		dogma.close();
	}

}
