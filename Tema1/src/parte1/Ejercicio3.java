package parte1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		int edad; 
		int nacimiento;
		int actual;
/*Creamos un Scanner*/
		Scanner sc = new Scanner (System.in);
		
/*Pedimos la fecha de nacimiento al usuario*/
		System.out.println("Introduzca su año de nacimiento");
		
/*Leemos la fecha de nacimiento*/
		nacimiento = sc.nextInt();
		
/*Pedimos la fecha actual del usuario*/
		System.out.println("Introduzca el año actual");
		
/*Leemos la fecha actual*/
		actual = sc.nextInt();
		
/*Realizamos la resta para calcular su edad*/
		edad = actual - nacimiento;
		
/*Mostramos la edad del usuario*/
		System.out.println("Tu edad es " + edad);
		
/*Cerramos el Scanner*/
		sc.close();
	
	}
}
