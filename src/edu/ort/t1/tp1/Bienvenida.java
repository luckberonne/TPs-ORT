package edu.ort.t1.tp1;

import java.util.Scanner;

public class Bienvenida {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Bienvenido, " + nombre + "!");
    }
}
