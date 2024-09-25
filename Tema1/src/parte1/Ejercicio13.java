package parte1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
	
/*Creamos las variables*/
		boolean tareas;
		boolean lluvia;
		boolean biblioteca;
		
/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
/*Preguntamos al usuario la condicion de las tareas*/
		System.out.println("¿Has realizado las tareas?");
		
/*Lo leemos en una variable*/
		tareas = sc.nextBoolean();
		
/*Preguntamos al usuario la condicion de la lluvia*/
		System.out.println("¿Esta lloviendo?");
		
/*Lo leemos en una variable*/
		lluvia = sc.nextBoolean();
		
/*Preguntamos al usuario la condicion de la biblioteca*/
		System.out.println("¿Tienes que ir a la biblioteca?");
		
/*Lo leemos en una variable*/
		biblioteca = sc.nextBoolean();
		
/*Creamos las posibilidades*/
		System.out.println(!lluvia && tareas || biblioteca ? "Podre salir" : "No podre salir");
		
/*Cerramos el Scanner*/
		sc.close();
	}
}
