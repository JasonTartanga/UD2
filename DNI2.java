package DNI;

import java.util.Scanner;

public class DNI2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opc = 0;
		String letraDNI = "TRWAGMYFPDXBNJZSQVLCKE";
		int numLetras = 0;
		int resto = 0;
		boolean tieneLetra = false;
		
		do {
			System.out.println();
		
		System.out.print("Introduce tu DNI (con letra): ");
		String DNI = sc.next().toUpperCase();

		

		if (DNI.length() != 9) {
			System.out.println("El formato del DNI es erroneo");
		} else {
			for (int i = 0; i < DNI.length() - 1; i++) {
				if (Character.isDigit(DNI.charAt(i))) {
					numLetras++;
				} else {
					System.out.println("El formato del DNI es erroneo");
				}
			}
			if (!Character.isDigit(DNI.charAt(8))) {
				tieneLetra = true;
			} else {
				System.out.println("El formato del DNI es erroneo");
			}
			if (numLetras == 8 && tieneLetra) {
				resto = Integer.parseInt(DNI.substring(0, 8)) % 23;
				if (DNI.charAt(8) == letraDNI.charAt(resto)) {
					System.out.println("La letra introducida es correcta");
				} else {
					System.out.println("Incorrecto. La letra de tu DNI es: " + letraDNI.charAt(resto));
				}
			}
		}

		sc.close();
	}

}
