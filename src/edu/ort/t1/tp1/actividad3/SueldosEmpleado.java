package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class SueldosEmpleado {
    public static void ejecutar(Scanner scanner) {
        double sueldo, total = 0;
        int contador = 1;
        boolean sueldoNegativo = false;

        System.out.print("Ingrese sueldo del mes " + (contador + 1) + ": ");
        sueldo = scanner.nextDouble();
        while (contador <= 12 && sueldo >= 0) {
            System.out.print("Ingrese sueldo del mes " + (contador + 1) + ": ");
            sueldo = scanner.nextDouble();


				total += sueldo;
				contador++;
            System.out.print("Ingrese sueldo del mes " + (contador + 1) + ": ");
            sueldo = scanner.nextDouble();
        }

        System.out.println("Total cobrado hasta el momento: $" + total);
    }
}
