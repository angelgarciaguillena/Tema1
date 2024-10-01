package parte1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		double radio;
		double longitud;
		double area;
		final int NUMERO = 2;
		
/*Pedimos el radio de la circunferencia*/
		System.out.println("Introduce el radio de la circunferencia");
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner (System.in);
		
/*Registramos el radio de la circunferencia*/
		radio = sc.nextDouble();
		
/*Realizamos las operaciones*/
		longitud = NUMERO * Math.PI * radio;
		area = Math.PI * radio * radio;
		
/*Mostramos el resultado de la longitud*/
		System.out.println("La longitud de la circunferencia es " + longitud);
		
/*Mostramos el resultado del area*/
		System.out.println("El area de la circunferencia es " + area);
		
/*Cerramos el Scanner*/
		sc.close();
		
		
		
		
	}
}
