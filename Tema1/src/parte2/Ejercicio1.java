package parte2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		double num;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero con decimales:");
		
/*Lo leemos*/
		num = sc.nextDouble();
		
/*Mostramos el numero redondeado*/
		System.out.println("El numero redondeado es: " + ((int)(num + 0.5)));
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
