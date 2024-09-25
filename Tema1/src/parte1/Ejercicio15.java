package parte1;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		final double IVA = 0.21;
		double precio;
		double total;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Le pedimos al usuario que introduzca un preccio*/
		System.out.println("Introduzca un precio");
		
/*Lo leemos*/
		precio = sc.nextDouble();

/*Calculamos el precio final*/
		total = (precio * IVA) + precio;
		
/*Mostramos los resultados*/
		System.out.println("El precio final es " + total);
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
