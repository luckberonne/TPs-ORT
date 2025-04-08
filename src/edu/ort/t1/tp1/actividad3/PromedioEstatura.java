package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class PromedioEstatura {
    public static void ejecutar(Scanner scanner) {
        double estatura, suma = 0;
        int cantidad = 0;

        do {
            System.out.print("Ingrese estatura (0 para salir): ");
            estatura = scanner.nextDouble();

            if (estatura != 0) {
                suma += estatura;
                cantidad++;
            }
        } while (estatura != 0);

        if (cantidad == 0) {
            System.out.println("No se ingresaron estaturas.");
        } else {
            double promedio = suma / cantidad;
            System.out.println("Promedio de estaturas: " + promedio);
        }
    }
}
