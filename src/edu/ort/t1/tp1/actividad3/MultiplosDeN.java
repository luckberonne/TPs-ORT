package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class MultiplosDeN {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        System.out.println("Primeros 10 múltiplos de " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
