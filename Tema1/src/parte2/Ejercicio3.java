package parte2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		int num1;
		int num2;
		int resto;
		int resultado;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
/*Lo leemos*/
		num1 = sc.nextInt();
		
/*Pedimos al usuario que introduzca otro numero*/
		System.out.println("Introduce otro numero:");
		
/*Lo leemos*/
		num2 = sc.nextInt();
		
/*Calculamos lo que hay que sumarle para ser multiplo de num2*/
		resto = (num2 % num1);
		resultado = resto == 0 ? 0 : num2 - resto;
		System.out.println("Hay que sumarle " + resultado);
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
