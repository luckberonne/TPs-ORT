package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class Multiplos3No5 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        System.out.println("Primeros " + n + " múltiplos de 3 que no sean múltiplos de 5:");
        int contador = 0;
        int numero = 3;

        while (contador < n) {
            if (numero % 5 != 0) {
                System.out.print(numero + " ");
                contador++;
            }
            numero += 3;
        }

        System.out.println();
    }
}
