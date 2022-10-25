package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numeroIntroducido=0, sumaNumeros=0;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero positivo a sumar: si quiere finalizar la "
				+ "ejecucion del programa\ny obtener la suma final de numeros introducidos"
				+ " introduzca un numero negativo: ");
		
		numeroIntroducido = dogma.nextInt();
		
		while (numeroIntroducido>=0) {
			
			/*Doy nuevo valor a variable sumaNumeros (iniciada como 0) equivalente a
			la suma de sumaNumeros y numeroIntroducido mediante Scanner
			futuras sumas se realizaran con el nuevo valor de sumaNumeros y 
			el nuevo valor de numeroIntroducido*/
			sumaNumeros = sumaNumeros+numeroIntroducido;
			
			//De introducir un numero que no cumpla la condicion (como -1) se finalizara el bucle
			numeroIntroducido = dogma.nextInt();
		}
		
		/*De finalizarse el bucle se imprimira por pantalla un mensaje con
		el ultimo valor dado a SumaNumeros*/
		System.out.print("La suma final de los numeros introducidos es: " + sumaNumeros);
		
		//Cierro Scanner
		dogma.close();
	}

}
