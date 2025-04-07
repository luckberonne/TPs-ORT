package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class MayorDeDos {
    public static void ejecutar(Scanner scanner) {
    	System.out.print("Ingrese primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}