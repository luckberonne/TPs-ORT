package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class PromedioEdades {
    public static void ejecutar(Scanner scanner) {
        int suma = 0;
        int contadorImparesMayor18 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la edad " + i + ": ");
            int edad = scanner.nextInt();
            suma += edad;

            if (edad > 18 && edad % 2 != 0) {
                contadorImparesMayor18++;
            }
        }

        double promedio = (double) suma / 5;
        System.out.println("Promedio de las edades: " + promedio);
        System.out.println("Cantidad de edades impares mayores a 18: " + contadorImparesMayor18);
    }
}
