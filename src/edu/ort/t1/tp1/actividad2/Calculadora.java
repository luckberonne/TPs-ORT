package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class Calculadora {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        switch (operacion) {
            case '+': System.out.println("Resultado: " + (a + b)); break;
            case '-': System.out.println("Resultado: " + (a - b)); break;
            case '*': System.out.println("Resultado: " + (a * b)); break;
            case '/': 
                if (b == 0) {
                    System.out.println("ERROR: No se puede dividir por cero.");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
                break;
            default: System.out.println("Operación inválida.");
        }
    }
}
