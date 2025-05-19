package edu.ort.t1.tp2.ejercicios;

import edu.ort.t1.tp2.ejercicios.models.Dado;

public class Ejercicio6 {
    public static void ejecutar() {
    	Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        dado1.lanzar();
        dado2.lanzar();

        int valor1 = dado1.getValor();
        int valor2 = dado2.getValor();

        System.out.println("Dado 1: " + valor1);
        System.out.println("Dado 2: " + valor2);

        if (valor1 == valor2) {
            System.out.println("¡Los dados son iguales! Valor: " + valor1);
        } else {
            int mayor = Math.max(valor1, valor2);
            System.out.println("El mayor valor es: " + mayor);
        }

        int sumaTotal = 0;

        for (int i = 0; i < 100; i++) {
            dado1.lanzar();
            dado2.lanzar();
            sumaTotal += dado1.getValor() + dado2.getValor();
        }

        double promedio = sumaTotal / 200.0;
        System.out.println("Promedio de 100 lanzamientos (de los dos dados): " + promedio);
    }

}
