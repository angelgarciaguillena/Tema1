package parte1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		String nombre;
		int edad;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca su nombre*/
		System.out.println("Introduzca su nombre");
		
/*Leemos su nombre*/
		nombre = sc.nextLine();
		
/*Pedimos la edad al usuario*/
		System.out.println("Introduzca su edad");
		
/*Leemos su edad*/
		edad = sc.nextInt();
		
/*Mostramos los datos del usuario*/
		System.out.println("Hola, " + nombre + " tienes " + edad + " años, ¡qué mayor eres!");

/*Cerramos el Scanner*/
		sc.close();
	}
}
