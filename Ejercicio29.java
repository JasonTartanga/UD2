package paquete;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	int res = 0;
	for(int i = 1; i <= 10; i++){
		System.out.println("Inserta el " + i + "º numero");
		int num1 = sc.nextInt();
		res = res + num1;
			if(num1 == 0) {
				break;
			}
	}
	System.out.println("La suma de los numeros es = " + res);
	System.out.println("La media de los numeros es = " + (float) res / 10);
	
	sc.close();
	}
}