package edu.ort.t1.tp1.actividad1;
import java.util.Scanner;

public class IntercambioValores {
	public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Antes del intercambio: num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Después del intercambio: num1 = " + num1 + ", num2 = " + num2);
    }
}
