package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int numeroIntroducido; //Guarda el numero introducido por el usuario
		
		int numeroSecreto = (int) (Math.random()*100); //Guarda el numero secreto
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero y le comunico como finalizar el programa
		System.out.println("Introduzca el numero que cree que es el numero secreto entre 1 y 100: ");	
		
		//Asigno el valor del usuario a la variable numeroIntroducido mediante el Scanner
		numeroIntroducido = dogma.nextInt();
		

		//El bucle se seguira ejecutando mientras que el numero introducido sea diferente al numero secreto y diferente a -1
		//El bucle dejara de ejecutarse cuando que el numero introducido sea igual al numero secreto o igual a -1
		while ((numeroIntroducido!=numeroSecreto) && (numeroIntroducido!=-1)){
			
			//Establezco la condicion de que si numero introducido es mayor que el numero Secreto se imprima el siguiente mensaje
		 if (numeroIntroducido>numeroSecreto) {
				System.out.println("Su numero es mayor al numero secreto");
				
				//Establezco la condicion de que si numero introducido es menor que el numero Secreto se imprima el siguiente mensaje
				} else if (numeroIntroducido<numeroSecreto) {
					System.out.println("Su numero es menor al numero secreto");
					}
		 /*Proporciono al usuario una nueva lectura de datos por Scanner
		 * para que introduzca mas valores o finalize el bucle*/
			numeroIntroducido = dogma.nextInt();
		}
		
		/*Establezco condicion a comprobar si finaliza el bucle,
		si numeroSecreto igual a numeroIntroducido imprimo el siguiente mensaje por consola*/
		if (numeroSecreto==numeroIntroducido) {
			System.out.print("Enhorabuena has adivinado el numero secreto!");
			
			/*De no cumplirse la condicion imprimo mensaje de rendicion por pantalla,
			ya que la unica forma restante de finalizar el bucle es que el usuario haya introducido -1*/
		} else {
			System.out.print("Usted se ha rendido");
		}
		
		//Cierro Scanner
		dogma.close();
	}

}
