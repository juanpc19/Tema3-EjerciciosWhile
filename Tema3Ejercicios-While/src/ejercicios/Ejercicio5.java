package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numeroIntroducido; //Guarda numero introducido por usuario
		
		int sumaPositivos = 0; //Guarda la suma de los numero introducidos por el usuario de ser estos positivos
		
		int sumaNegativos = 0; //Guarda la suma de los numero introducidos por el usuario de ser estos negativos
		
		int cantidad = 0;  //Guarda la cantidad de numeros introducidos (positivos, negativos y 0)
		
		int cantidadNegativos = 0; //Guarda la cantidad de numeros introducidos  de ser estos negativos
		
		int cantidadCeros = 0; //Guarda la cantidad de numeros introducidos de ser estos 0
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario un numero y le comunico como finalizar el programa
		System.out.println("Introduzca un numero, el programa finalizara dandole "
			+ "los resultados tras introducir 10 numeros: ");		

		//El bucle se seguira ejecutando mientras la cantidad de numeros introducidos sea menos de 10
		//El bucle dejara de ejecutarse cuando la cantidad de numeros introducidos sea 10
		while (cantidad<10) {
			
			/*Proporciono al usuario una nueva lectura de datos por Scanner
			 *  para que introduzca mas valores o finalize el bucle*/
			numeroIntroducido = dogma.nextInt();
			
			//Establezco por condicion a cumplirse que el variable numero introducido ha de ser igual o mayor que 1
			if (numeroIntroducido>=1) {
				//De cumplirse la condicion añado valor de dicho numero a variable sumaPositivos
				sumaPositivos += numeroIntroducido;
				
				//Establezco por condicion a cumplirse que el variable numero introducido ha de ser igual o menor que -1
			} else if (numeroIntroducido<=-1) {
				//De cumplirse la condicion añado valor de dicho numero a variable sumaNegativos
				sumaNegativos += numeroIntroducido;
				//De cumplirse la condicion añado +1 a variable cantidadNegativos
				++cantidadNegativos;
				
				/*De no cumplirse ninguna condicion anterior, 
				 * es decir de ser variable numeroIntroducido igual a 0 se ejecuta lo siguiente */
			} else {
				//Sumo +1 a cantidadCeros
				++cantidadCeros;
				}
			//Cada vez que se complete un bucle se le suma +1 a variable cantidad
			++cantidad;
			}
		
		//Imprimo mensaje por pantalla con la suma de los todos los numeros positivos
		System.out.println("Suma total de los numeros positivos introducidos: " + sumaPositivos);
		
		/*Compruebo operador ternario
		 *  que de ser true imprimira por pantalla la media en tipo float (debido al cast)
		 *  y de ser false imprimira un mensaje de error*/
		System.out.println(cantidadNegativos!=0 ?
				
				"Media de los numeros negativos introducidos: " + (float) sumaNegativos/cantidadNegativos 
				
				: "No ha introducido ningun numero negativo del que hacer media");
		
		//Imprimo mensaje por pantalla con la cantidad de ceros introducidos
		System.out.print("Cantidad de veces que ha introducido el numero 0: " + cantidadCeros);	
		
		//Cierro Scanner
		dogma.close();
	}

}
