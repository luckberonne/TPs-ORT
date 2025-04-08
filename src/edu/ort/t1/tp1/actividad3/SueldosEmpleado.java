package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class SueldosEmpleado {
    public static void ejecutar(Scanner scanner) {
        double sueldo, total = 0;
        int contador = 0;

        while (contador < 12) {
            System.out.print("Ingrese sueldo del mes " + (contador + 1) + ": ");
            sueldo = scanner.nextDouble();

            if (sueldo < 0) {
                System.out.println("Sueldo negativo detectado. Finalizando carga.");
                break;
            }

            total += sueldo;
            contador++;
        }

        System.out.println("Total cobrado hasta el momento: $" + total);
    }
}
