package parte2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
/*Creamos las variables necesarias*/
		int a;
		int b;
		int c;
		int x;
		int y;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca un valor para x*/
		System.out.println("Introduce un valor para x:");
		
/*Lo leemos*/
		x = sc.nextInt();
		
/*Pedimos al usuario que introduzca un valor para a*/
		System.out.println("Introduce un valor para a:");
		
/*Lo leemos*/
		a = sc.nextInt();
		
/*Pedimos al usuario que introduzca un valor para b*/
		System.out.println("Introduce un valor para b:");
		
/*Lo leemos*/
		b = sc.nextInt();
		
/*Pedimos al usuario que introduzca un valor para c*/
		System.out.println("Introduce un valor para c:");
		
/*Lo leemos*/
		c = sc.nextInt();
		
/*Calculamos el valor*/
		y = (a * x * x) + (b * x) + c;
		
/*Mostramos el resultado*/
		System.out.println("El valor de y es " + y);
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
