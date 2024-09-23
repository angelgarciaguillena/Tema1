package parte1;

import java.util.Scanner;

/*Creamos un programa para introducir un numero y 
 * que el programa lea ese numero y lo muestre*/

public class Ejercicio1 {
	public static void main(String[] args) {

/*Pido un numero al usuario*/
		System.out.println("Introduce un numero");

/*Creo un escaner*/
		Scanner sc = new Scanner(System.in);

/*Hago que el programa lea el numero*/
		double num = sc.nextDouble();
		
/*El programa lee el numero y lo muestra*/
		System.out.println("El numero es " + num);
	
/*Cerramos el Scanner*/
		sc.close();
	}
}
