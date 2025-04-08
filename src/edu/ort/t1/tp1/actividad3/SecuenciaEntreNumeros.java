package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class SecuenciaEntreNumeros {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número debe ser menor o igual al segundo.");
            return;
        }

        System.out.println("Incluyéndolos:");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nExcluyéndolos:");
        for (int i = num1 + 1; i < num2; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
