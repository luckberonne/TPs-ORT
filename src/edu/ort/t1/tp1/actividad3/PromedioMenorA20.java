package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class PromedioMenorA20 {
    public static void ejecutar(Scanner scanner) {
        int numero, suma = 0, cantidad = 0;
        double promedio;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            suma += numero;
            cantidad++;
            promedio = (double) suma / cantidad;
        } while (promedio < 20);

        System.out.println("Se ingresaron " + cantidad + " números.");
    }
}
