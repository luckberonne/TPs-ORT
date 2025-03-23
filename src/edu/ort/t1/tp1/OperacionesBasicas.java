package edu.ort.t1.tp1;

import java.util.Scanner;

public class OperacionesBasicas {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (b != 0 ? ((double) a / b) : "No se puede dividir por 0"));
    }
}