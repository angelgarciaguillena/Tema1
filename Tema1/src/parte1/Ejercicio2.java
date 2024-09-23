package parte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
/*Pido la edad al usuario*/
		System.out.println("Ingrese su edad");

/*Creamos el Scanner*/
		Scanner sc = new Scanner (System.in);
		
/*Leemos el numero de consola*/
		int edad = sc.nextInt();

/*Sumamos un año a la edad introducida*/
		int edadnueva= edad + 1;

/*Mostramos la edad nueva por consola*/
		System.out.println("La edad el año que viene es " + edadnueva);

/*Cerramos el Scanner*/
		sc.close();
	}
}
