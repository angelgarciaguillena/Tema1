package parte1;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		double peras;
		double manzanas;
		double dm;
		double dp;
		double total;
		final double PPER = 2.35;
		final double PMAN = 1.95;
		
/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario el numero de peras que ha comprado*/
		System.out.println("Introduce el numero de peras compradas");
		
/*Leemos la cantidad*/
		peras = sc.nextDouble();
		
/*pedimos al usuario el numero de manzanas que ha comprado*/
		System.out.println("Introduce el numero de manzanas compradas");
		
/*Leemos la cantidad*/
		manzanas = sc.nextDouble();
		
/*Hacemos los calculos para ver cuanto cuestan las manzanas y las peras*/
		dp = peras * PPER;
		dm = manzanas * PMAN;
		
/*Hacemos el total*/
		total = dp + dm;
		
/*Mostramos los resultados*/
		System.out.println("El total de la compra es " + total);
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
