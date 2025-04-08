package edu.ort.t1.tp1.actividad3;

public class NumerosUnoAlCinco {
    public static void ejecutar() {
        System.out.println("Números del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nNúmeros del 5 al 1:");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}

