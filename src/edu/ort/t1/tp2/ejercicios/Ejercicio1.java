package edu.ort.t1.tp2.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int pedirNumero(Scanner scanner, String mensaje, int minimo, int maximo) {
        int numero;

        do {
            System.out.println(mensaje + " (Entre " + minimo + " y " + maximo + "): ");
            numero = scanner.nextInt();
        } while (numero < minimo || numero > maximo);

        return numero;
    }

    public static void ejecutar(Scanner scanner) {
        int numero1 = pedirNumero(scanner, "Ingrese el primer número", 1, 100);
        int numero2 = pedirNumero(scanner, "Ingrese el segundo número", 1, 100);

        int suma = sumar(numero1, numero2);

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}
