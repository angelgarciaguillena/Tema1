package parte1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

/*Creamos las variables*/
		double num1;
		double num2;
		double suma;
		double resta;
		double multi;
		double div;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos el primer numero al usuario*/
		System.out.println("Introduzca el primer numero");
		
/*Leemos el primer numero*/
		num1 = sc.nextDouble();
		
/*Pedimos el segundo numero al usuario*/
		System.out.println("Introduzca el segundo numero");
		
/*Leemos el segundo numero*/
		num2 = sc.nextDouble();
		
/*Realizamos las operacines*/
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		div = num1 / num2;
		
/*Mostramos los resultados de las operaciones*/
		System.out.println("La suma vale " + suma);
		System.out.println("La resta vale " + resta);
		System.out.println("La multiplicacion vale " + multi);
		System.out.println("La division vale " + div);
		
/*Cerramos el scanner*/
		sc.close();


	}
}
