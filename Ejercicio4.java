package paquete;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int num1, num2, resul;
	
	System.out.println("Escribe el primer numero");
	num1 = sc.nextInt();
	
	System.out.println("Escribe el segundo numero");
	num2 = sc.nextInt();
	
	System.out.println("Escribe la suma de los numeros anteriores");
	resul = sc.nextInt();
	
	if(resul == (num1 + num2)) {
		System.out.println("La respueta es correcta");
	}
		else {
			System.out.println("Incorrecto, la respuesta correcta es " + (num1 + num2));
		
	}
	}
}