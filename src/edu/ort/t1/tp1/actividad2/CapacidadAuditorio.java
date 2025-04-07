package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class CapacidadAuditorio {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese cantidad de inscriptos: ");
        int inscriptos = scanner.nextInt();

        System.out.print("Ingrese cantidad de asientos: ");
        int asientos = scanner.nextInt();

        if (asientos >= inscriptos) {
            System.out.println("Los asientos alcanzan.");
        } else {
            System.out.println("Faltan " + (inscriptos - asientos) + " asientos.");
        }
    }
}
