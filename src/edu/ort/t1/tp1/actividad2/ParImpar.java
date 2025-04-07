package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class ParImpar {
    public static void ejecutar(Scanner scanner) {
    	System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es PAR.");
        } else {
            System.out.println("El número es IMPAR.");
        }
    }
}