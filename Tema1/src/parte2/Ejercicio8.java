package parte2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Creo una variable para acumular la longitud en metros*/
		double metros;
		
		/*Creo una variable para acumular la longitud en centimetros*/
		double centimetros;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la longitud en metros*/
		System.out.println("Introduce la longitud en metros:");
		
		/*Lo leemos*/
		metros = sc.nextDouble();
		
		/*Lo transformamos a centimetros*/
		centimetros = metros * 100;
		
		/*Mostramos el resultado*/
		System.out.println("La longitud en centimetros es: " + (int) centimetros);
		
		/*Cerramos el Scanner*/
		sc.close();
		
		
	}
}
