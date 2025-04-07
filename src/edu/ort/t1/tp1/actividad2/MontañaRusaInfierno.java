package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class MontañaRusaInfierno {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese altura en metros: ");
        double altura = scanner.nextDouble();

        boolean puedeEntrar = edad >= 7 && altura > 1.50;

        System.out.println("¿Puede entrar al juego? " + (puedeEntrar ? "Sí" : "No"));
    }
}
