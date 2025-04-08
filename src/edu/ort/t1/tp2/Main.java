package edu.ort.t1.tp2;

import edu.ort.t1.tp2.ejercicios.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione un ejercicio:");
            System.out.println("1 - Ejercicio1 (sumar y pedirNumero)");
            System.out.println("2 - Ejercicio2 (Persona)");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicio1.ejecutar(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
