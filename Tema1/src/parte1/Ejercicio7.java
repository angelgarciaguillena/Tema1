package parte1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
/*Creamos las variables*/
		String nombre;
		String dir;
		String tel;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Pedimos al usuario su nombre*/
		System.out.println("Introduzca su nombre");
		
/*Leemos su nombre*/
		nombre = sc.nextLine();
		
/*Pedimos al usuario su direccion*/
		System.out.println("Introduzca su direccion");
		
/*Leemos su direccion*/
		dir = sc.nextLine();
		
/*Pedimos al usuario su telefono*/
		System.out.println("Introduzca su telefono");
		
/*Leemos su telefono*/
		tel = sc.nextLine();
		
/*Mostramos los datos introducidos por el usuario*/
		System.out.println("Nombre:" + nombre);
		System.out.println("Direccion:" + dir);
		System.out.println("Telefono:" + tel);
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
