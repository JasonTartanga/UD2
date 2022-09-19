package paquete;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Escribe un numero");
	int num1 = sc.nextInt();
	
	if(num1 % 2 == 0) {
		System.out.println("El numero es divisible entre dos");
	}
		else if(num1 % 3 == 0) {
			System.out.println("El numero es divisible entre tres");
		}
			else if(num1 % 5 == 0) {
				System.out.println("El numero es divisible entre cinco");
				}
}
}