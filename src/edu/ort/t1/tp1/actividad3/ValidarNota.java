package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class ValidarNota {
    public static void ejecutar(Scanner scanner) {
        int nota;
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Intente nuevamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida ingresada: " + nota);
    }
}
