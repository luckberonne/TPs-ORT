package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class ValidarNotaEspecial {
    public static void ejecutar(Scanner scanner) {
        int nota;
        do {
            System.out.print("Ingrese una nota válida (2 o de 4 a 10, 0 para ausente): ");
            nota = scanner.nextInt();

            if (nota != 0 && nota != 2 && (nota < 4 || nota > 10)) {
                System.out.println("Nota inválida. Intente nuevamente.");
            }
        } while (nota != 0 && nota != 2 && (nota < 4 || nota > 10));

        System.out.println("Nota válida ingresada: " + nota);
    }
}
