package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class MayorDeTres {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;

        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;

        System.out.println("El mayor es: " + mayor);
    }
}
