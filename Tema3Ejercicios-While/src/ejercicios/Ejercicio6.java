package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int edad; //Guarda numero introducido por usuario
		
		int sumaEdades = 0; //Guarda la suma de todas las edades de todos los alumnos
		
		int numeroAlumnos = 0; //Guarda numero total de alumnos
		
		int alumnosMayor = 0; //Guarda cantidad de alumnos mayores de edad
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero y le comunico como finalizar el programa
		System.out.println("Introduzca con numeros las edades de los alumnos, "
			+ "el programa finalizara dandole los resultados tras introducir un numero negativo: ");		
		
		//Asigno el valor del usuario a la variable edad mediante el Scanner
		edad = dogma.nextInt();
		

		//El bucle se seguira ejecutando mientras que el numero introducido sea igual o mayor que 0
		//El bucle dejara de ejecutarse cuando que el numero introducido sea menor que 0
		while (edad>=0) {
			
			//Sumo edad introducida a variable sumaEdades
			sumaEdades += edad;
			
			//Sumo +1 a variable numeroAlumnos cada vez que introduzco un nuevo numero
			++numeroAlumnos;
			
			//Establezco la condicion si variable edad igual o mayor a 18 que de cumplirse ejecutara lo siguiente
			if (edad>=18) {
				//Suma +1 a variable alumnosMayor
				++alumnosMayor;	
			} 
			
			/*Proporciono al usuario una nueva lectura de datos por Scanner
			 *  para que introduzca mas valores o finalize el bucle*/
			edad = dogma.nextInt();
		}
		
		//De finalizar el bucle y cumplirse la condicion de numero de alumnos igual a 0 imprimo por pantalla un mensaje de error
		if (numeroAlumnos==0) {
			System.out.print("Debe introducir al menos un valor positivo antes de introducir"
				+ " un valor negativo para finalizar el programa correctamente. ");
			
			/*De no cumplirse la condicion anterior finalizo el programa imprimiendo por pantalla un mensaje con:
			 *  los alumnos que son mayores de edad, la suma de las edades de todos los alumnos,
			 *   el numero total de alumanos y la edad media de los alumnos*/
		} else {
		System.out.print("Mayor edad: " + alumnosMayor + "\nEdades sumadas: " + sumaEdades + " \nCantidad alumnos: " + numeroAlumnos + "\nMedia: " + (float) sumaEdades/numeroAlumnos);
		}
		
		//Cierro Scanner
		
		dogma.close();
	}

}
