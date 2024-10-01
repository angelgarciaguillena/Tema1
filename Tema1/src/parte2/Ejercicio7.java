package parte2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Creo una variable para acumular el numero de entradas infantiles*/
		int entradaNiño;
		
		/*Creo una variable para acumular el numero de entradas de adulto*/
		int entradaAdulto;
		
		/*Creo una variable para la entrada de adulto*/
		final double ADULTO = 20;
		
		/*Creo una variable para la entrada infantil*/
		final double NIÑO = 15.50;
		
		/*Creo una variable para el bono descuento*/
		final double BONO = 0.05;
		
		/*Creo una variable para el precio en total*/
		double total;
		
		/*Creo una variable para el precio de la entrada infantil*/
		double precioNiño;
		
		/*Creo una variable para el precio de la entrada infantil*/
		double precioAdulto;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el numero de entradas infantiles*/
		System.out.println("Introduce el numero de entradas infantiles:");
		
		/*Lo leemos*/
		entradaNiño = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el numero de entradas de adulto*/
		System.out.println("Introduce el numero de entradas de adulto:");
		
		/*Lo leemos*/
		entradaAdulto = sc.nextInt();
		
		/*Calculamos la entrada de niño y la de adulto*/
		precioNiño = entradaNiño * NIÑO;
		precioAdulto = entradaAdulto * ADULTO;
		
		/*Calculamos el precio en total*/
		total = (precioNiño + precioAdulto) > 100 ? ((precioNiño + precioAdulto) - ((precioNiño + precioAdulto) * BONO)) : (precioNiño + precioAdulto);
		
		/*Mostramos el resultado*/
		System.out.println("El precio total es: " + total);
		
		/*Cerramos el Scanner*/
		sc.close();
		
	}
}
