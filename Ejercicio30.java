package paquete;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	int res = 0;
	for(int i = 1; i <= 10; i++){
		System.out.println("Inserta el " + i + "º numero");
		int num1 = sc.nextInt();
		
			if(num1 >= 0) {
				res = res + num1;
			}
	}
	System.out.println("La suma de los numeros es = " + res);
	
	sc.close();
	}
}