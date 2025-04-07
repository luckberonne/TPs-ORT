package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class EdadJubilacion {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese edad (1-120): ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese género (M/F): ");
        char genero = scanner.next().toUpperCase().charAt(0);

        if (edad < 1 || edad > 120 || (genero != 'M' && genero != 'F')) {
            System.out.println("Datos inválidos.");
        } else {
            boolean jubilado = (genero == 'M' && edad >= 65) || (genero == 'F' && edad >= 60);
            System.out.println("¿Está en edad de jubilarse? " + (jubilado ? "Sí" : "No"));
        }
    }
}
