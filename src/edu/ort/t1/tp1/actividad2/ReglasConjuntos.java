package edu.ort.t1.tp1.actividad2;

import java.util.Scanner;

public class ReglasConjuntos {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        boolean esDeUnSoloDigito = numero >= -9 && numero <= 9;
        boolean esImpar = numero % 2 != 0;
        boolean estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
        boolean noEstaEnNingunGrupo = !esDeUnSoloDigito && !esImpar;

        System.out.println("Número ingresado: " + numero);
        System.out.println("Es de un solo dígito: " + esDeUnSoloDigito);
        System.out.println("Es impar: " + esImpar);
        System.out.println("Está en ambos grupos: " + estaEnAmbosGrupos);
        System.out.println("No está en ningún grupo: " + noEstaEnNingunGrupo);
    }
}
