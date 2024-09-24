package parte1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		 
/*Creamos las variables*/
		double num;
		boolean par;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduzca un numero");
		
/*Leemos el numero*/
		num = sc.nextDouble();
		
		
/*Verificamos si el numero es par o impar*/
		par = (num % 2 == 0);
		System.out.println(par);
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
