package parte1;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		int nota1;
		int nota2;
		int nota3;
		double total;
		final int DIV = 3;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca la nota del primer trimestre*/
		System.out.println("Introduzca la nota del primer trimestre");
		
/*Lo leemos*/
		nota1 = sc.nextInt();
		
		/*Pedimos al usuario que introduzca la nota del segundo trimestre*/
		System.out.println("Introduzca la nota del segundo trimestre");
		
/*Lo leemos*/
		nota2 = sc.nextInt();
		
/*Pedimos al usuario que introduzca la nota del tercer trimestre*/
		System.out.println("Introduzca la nota del tercer trimestre");
		
/*Lo leemos*/
		nota3 = sc.nextInt();
		
/*Realizamos los calculos*/
		total = ( (double) (nota1 + nota2 + nota3)) / DIV;
		
		
/*Mostramos al usuario los resultados*/
		System.out.println("La nota media del expediente es " + (int) total);
		System.out.println("La nota media del boletin es " +  total);
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
