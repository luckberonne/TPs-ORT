package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class CalculadoraVariasOperaciones {
    public static void ejecutar(Scanner scanner) {
        char operacion;

        do {
            System.out.print("Ingrese operación (+, -, *, /, F para finalizar): ");
            operacion = scanner.next().charAt(0);

            if (operacion == 'F' || operacion == 'f') {
                System.out.println("Fin de las operaciones.");
                break;
            }

            System.out.print("Ingrese primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese segundo número: ");
            int num2 = scanner.nextInt();

            switch (operacion) {
                case '+': System.out.println("Resultado: " + (num1 + num2)); break;
                case '-': System.out.println("Resultado: " + (num1 - num2)); break;
                case '*': System.out.println("Resultado: " + (num1 * num2)); break;
                case '/': 
                    if (num2 == 0) {
                        System.out.println("ERROR: No se puede dividir por cero.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;
                default: System.out.println("Operación inválida.");
            }

        } while (true);
    }
}
