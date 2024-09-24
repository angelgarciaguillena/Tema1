package parte1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		boolean mayor;
		int edad;
		final int min = 18;
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);

/*Pedimos al usuario que introduzca su edad*/
		System.out.println("Introduzca su edad");
		
/*Leemos su edad*/
		edad = sc.nextInt();
		
/*Indicamos si es mayor de 18 años*/
		mayor = (edad>=min);
		System.out.println(mayor);
		
/*Cerramos el Scanner*/
		sc.close();
	}

}
