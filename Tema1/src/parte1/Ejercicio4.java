package parte1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		double nota1;
		double nota2;
		final int DIVISION = 2;
		double suma;
		double media;
		
/*Creamos el Scanner*/
		Scanner sc = new Scanner (System.in);
				
/*Pedimos la primera y segunda nota al usuario*/
		System.out.println("Ingrese la primera nota");
		
/*Registramos la primera nota*/
		nota1 = sc.nextDouble();
		
/*Pedimos la segunda nota al usuario*/
		System.out.println("Ingrese la segunda nota");
		
/*Registramos la primera nota*/
		nota2 = sc.nextDouble();
		
/*Realizamos las operaciones*/
		suma = nota1 + nota2;
		media = suma / DIVISION;
		
/*Mostramos al usuario la media aritmetica de las dos notas que ha introducido*/
		System.out.println("La media aritmetica es " + media);
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
