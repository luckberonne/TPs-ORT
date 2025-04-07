package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class DivisibleMayorMenor {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese segundo número: ");
        int num2 = scanner.nextInt();

        int mayor = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        if (mayor % menor == 0) {
            System.out.println("El mayor es divisible por el menor.");
        } else {
            System.out.println("El mayor NO es divisible por el menor.");
        }
    }
}