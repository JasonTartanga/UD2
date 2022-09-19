package paquete;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int num1, num2;
	
	System.out.println("Introduce el primer numero");
	num1 = sc.nextInt();
	
	System.out.println("Introduce el segundo numero"); 
	num2 = sc.nextInt();
	
	if(num1 < num2) {
		System.out.println("El numero 1 es menor que el numero 2");
	}
		else if(num1 > num2){
			System.out.println("El numero 1 es mayor que el numero 2");
	}
			else
				System.out.println("Los numeros son iguales");
	}
}