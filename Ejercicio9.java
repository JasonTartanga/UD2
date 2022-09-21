package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		//Scanner
		Scanner sc = new Scanner(System.in);

		//Preguntas y variables
		System.out.println("¿Como se llama?");
		String nombre = sc.next();
		System.out.println("Introduce tu estado civil");	
		char estadoCivil = sc.next().toUpperCase().charAt(0);
		System.out.println("Introduce tu salario bruto anual");
		int salario = sc.nextInt();
	
		//If Casado
		if(estadoCivil == 'C' && salario*0.92 /12 < 1000) {
			System.out.println("Introduce el nº de hijos");
			int hijos = sc.nextInt();
				if(hijos == 1) {
					System.out.println("Sr. " + nombre + " BECA CONCEDIDA");					
				}
				else {
					System.out.println("BECA NO CONCEDIDA");
				}	
		}
		else {
			System.out.println("BECA NO CONCEDIDA");
				}
		
		//IF SOLTERO
		if(estadoCivil == 'S' && salario*0.87 /12 < 1000) {
			System.out.println("Introduce el nº de hijos");
			int hijos = sc.nextInt();
				if(hijos == 1) {
					System.out.println("Sr. " + nombre + " BECA CONCEDIDA");					
				}
				else {
					System.out.println("BECA NO CONCEDIDA");
				}	
		}
		else {
			System.out.println("BECA NO CONCEDIDA");
		}

		//IF VIUDO
		if(estadoCivil == 'V' && salario*0.9 /12 < 1000) {
			System.out.println("Introduce el nº de hijos");
			int hijos = sc.nextInt();
				if(hijos == 1) {
					System.out.println("Sr. " + nombre + " BECA CONCEDIDA");					
				}
				else {
					System.out.println("BECA NO CONCEDIDA");
				}	
		}
		else {
		System.out.println("BECA NO CONCEDIDA");
		}

		//IF OTROS
		if(estadoCivil == 'O' && salario*0.89 /12 < 1000) {
			System.out.println("Introduce el nº de hijos");
			int hijos = sc.nextInt();
				if(hijos == 1) {
					System.out.println("Sr. " + nombre + " BECA CONCEDIDA");					
				}
				else {
					System.out.println("BECA NO CONCEDIDA");
				}	
		}
		else {
		System.out.println("BECA NO CONCEDIDA");
		}
		
	sc.close();
	}
}
