package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class ValidarContinuarWhile {
    public static void ejecutar(Scanner scanner) {
        System.out.print("¿Deseás continuar? [S/N]: ");
        String opcion = scanner.next();

        while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
            System.out.print("Opción inválida. ¿Deseás continuar? [S/N]: ");
            opcion = scanner.next();
        }

        System.out.println("Ingresaste: " + opcion.toUpperCase());
    }
}
