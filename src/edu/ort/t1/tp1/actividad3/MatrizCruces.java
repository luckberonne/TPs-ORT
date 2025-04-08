package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class MatrizCruces {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el ancho: ");
        int ancho = scanner.nextInt();

        System.out.print("Ingrese el alto: ");
        int alto = scanner.nextInt();

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
