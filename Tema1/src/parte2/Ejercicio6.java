package parte2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
/*Creo la variable para acumular la cantidad de milimetros*/
		double milimetros;
		
/*Creo la variable para acumular la cantidad de centimetros*/
		double centimetros;
		
/*Creo la variable para acumular la cantidad de metros*/
		double metros;
		
/*Creo una variable para mostrar el resultado*/
		double resultado;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario que introduzca la primera medida en milimetros*/
		System.out.println("Introduce una cantidad en milimetros:");
		
/*Lo leemos*/
		milimetros = sc.nextDouble();
		
/*Pedimos al usuario que introduzca la primera medida en milimetros*/
		System.out.println("Introduce una cantidad en centimetros:");
		
/*Lo leemos*/
		centimetros = sc.nextDouble();
		
/*Pedimos al usuario que introduzca la primera medida en milimetros*/
		System.out.println("Introduce una cantidad en metros:");
		
/*Lo leemos*/
		metros = sc.nextDouble();
		
/*Calculamos las operaciones para que el resultado sea en centimetros*/
		resultado = ((milimetros/10) + (metros * 100) + centimetros);
		
/*Mostramos el resultado al usuario*/
		System.out.println("El resultado es " + resultado);
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
