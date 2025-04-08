package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class ValidarContinuarDoWhile {
    public static void ejecutar(Scanner scanner) {
        String opcion;

        do {
            System.out.print("¿Deseás continuar? [S/N]: ");
            opcion = scanner.next();
        } while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N"));

        System.out.println("Ingresaste: " + opcion.toUpperCase());
    }
}
