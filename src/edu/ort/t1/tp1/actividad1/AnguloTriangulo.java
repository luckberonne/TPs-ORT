package edu.ort.t1.tp1.actividad1;

import java.util.Scanner;

public class AnguloTriangulo {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el primer ángulo: ");
        double angulo1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo ángulo: ");
        double angulo2 = scanner.nextDouble();
        double angulo3 = 180 - (angulo1 + angulo2);
        System.out.printf("El tercer ángulo es: %.2f°%n", angulo3);
    }
}