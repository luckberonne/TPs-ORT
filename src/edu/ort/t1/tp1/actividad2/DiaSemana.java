package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class DiaSemana {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un número (1-7): ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Lunes"); break;
            case 3: System.out.println("Martes"); break;
            case 4: System.out.println("Miércoles"); break;
            case 5: System.out.println("Jueves"); break;
            case 6: System.out.println("Viernes"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Número inválido.");
        }
    }
}
