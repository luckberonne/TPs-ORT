package edu.ort.t1.tp1;
import java.util.Scanner;

public class SueldoVendedor {
	public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el monto total de ventas: ");
        double ventas = scanner.nextDouble();
        double sueldo = 44000 + (ventas * 0.16);
        System.out.printf("El sueldo total del vendedor es: %.2f%n", sueldo);
    }
}
