package parte2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		int num;
		int resto;
		final int MULTIPLO = 7;
		int resultado;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
/*Lo leemos*/
		num = sc.nextInt();
		
/*Calculamos lo que hay que sumarle para ser multiplo de 7*/
		resto = (num % MULTIPLO);
		resultado = resto == 0 ? 0 : MULTIPLO - resto;
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
