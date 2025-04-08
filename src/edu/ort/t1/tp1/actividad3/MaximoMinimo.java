package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class MaximoMinimo {
    public static void ejecutar(Scanner scanner) {
        int numero, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero > max) max = numero;
                if (numero < min) min = numero;
            }
        } while (numero != 0);

        if (max == Integer.MIN_VALUE) {
            System.out.println("No se ingresaron números.");
        } else {
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
        }
    }
}
