package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class PersonaMasJoven {
    public static void ejecutar(Scanner scanner) {
        String nombre, nombreJoven = "";
        int edad, edadJoven = Integer.MAX_VALUE;

        do {
            System.out.print("Ingrese nombre (* para salir): ");
            nombre = scanner.next();

            if (!nombre.equals("*")) {
                System.out.print("Ingrese edad: ");
                edad = scanner.nextInt();

                if (edad < edadJoven) {
                    edadJoven = edad;
                    nombreJoven = nombre;
                }
            }
        } while (!nombre.equals("*"));

        if (edadJoven == Integer.MAX_VALUE) {
            System.out.println("No se ingresaron personas.");
        } else {
            System.out.println("La persona más joven es: " + nombreJoven + " con " + edadJoven + " años.");
        }
    }
}
