package arrays;

public class Ejercicio8 {

	public static void main(String[] args) {

		String primerPlato[] = { "Ensalada  ", "Estofado  ", "Macarrones", "Risotto   ", "Garbanzos ", "Sopa      ",
				"Lentejas  ", "Canelones " };
		String segundoPlato[] = { "Estofado", "Hamburguesa", "Costillas", "Salmon", "Lomo", "Pollo", "Lasaña",
				"Albondigas", "Pizza", "Kebab" };
		String Dia[] = { "Lunes    ", "Martes   ", "Miercoles", "Jueves  ", "Viernes  ", "Sabado   ", "Domingo  " };


		System.out.println("\t\t\tMENU SEMANAL");
		System.out.println();
		System.out.println("         \tPRIMERO \tSEGUNDO");
		System.out.println();

		for (int i = 0; i < Dia.length; i++) {
			int primero = (int) (Math.random() * 8);
			int segundo = (int) (Math.random() * 10);

			System.out.println(Dia[i] + "\t" + primerPlato[primero] + "\t" + segundoPlato[segundo]);
		}
	}
}