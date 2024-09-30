package parte2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		int segundos;
		int minutos;
		int horas;
		int segundoshor;
		int segundosfin;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca un numero de segundos*/
		System.out.println("Introduzca un numero de segundos");
		
/*Lo leemos*/
		segundos = sc.nextInt();
		
/*Calculamos la cantidad de horas, minutos y segundos*/
		horas = segundos / 3600;
		segundoshor = segundos % 3600;
		minutos = segundoshor / 60;
		segundosfin = segundoshor % 60;
		
/*Mostramos el resultado*/
		System.out.println(horas + " horas, " + minutos + " minutos y " + segundosfin +" segundos");
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
