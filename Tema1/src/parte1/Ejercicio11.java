package parte1;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		double pesetas;
		double euros;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca el numero dem pesetas*/
		System.out.println("Introduce el numero de pesetas");
		
/*Leemos el numero introducido por el usuario*/
		pesetas = sc.nextDouble();
		
/*Hacemos la conversion*/
		euros = pesetas / 166;
		
/*Mostramos al usuario el resultado*/
		System.out.println(pesetas + " pesetas equivalen a " + euros + "euros");
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
