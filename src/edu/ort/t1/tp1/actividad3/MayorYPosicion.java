package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class MayorYPosicion {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int cant = scanner.nextInt();

        int mayor = Integer.MIN_VALUE;
        int posicionMayor = -1;

        for (int i = 1; i <= cant; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > mayor) {
                mayor = numero;
                posicionMayor = i;
            }
        }

        System.out.println("El mayor número fue: " + mayor);
        System.out.println("Apareció en la posición: " + posicionMayor);
    }
}
