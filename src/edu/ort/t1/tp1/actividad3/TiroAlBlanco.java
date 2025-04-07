package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class TiroAlBlanco {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese la cantidad de jugadores (mínimo 2): ");
        int cantidadJugadores = scanner.nextInt();

        while (cantidadJugadores < 2) {
            System.out.print("Debe haber al menos 2 jugadores. Ingrese nuevamente: ");
            cantidadJugadores = scanner.nextInt();
        }

        String ganador = "";
        int mayorPuntaje = 0;
        int tirosAlCentro = 0;

        for (int i = 1; i <= cantidadJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + i + ": ");
            String nombre = scanner.next();

            int puntajeJugador = 0;

            for (int tiro = 1; tiro <= 3; tiro++) {
                System.out.print("Ingrese la distancia del tiro " + tiro + ": ");
                int distancia = scanner.nextInt();

                int puntos = 0;

                if (distancia == 0) {
                    puntos = 500;
                    tirosAlCentro++;
                } else if (distancia <= 10) {
                    puntos = 250;
                } else if (distancia <= 50) {
                    puntos = 100;
                }

                puntajeJugador += puntos;
            }

            System.out.println("Total de puntos de " + nombre + ": " + puntajeJugador);

            if (puntajeJugador > mayorPuntaje) {
                mayorPuntaje = puntajeJugador;
                ganador = nombre;
            }
        }

        System.out.println("=== RESULTADOS ===");
        System.out.println("Ganador: " + ganador + " con " + mayorPuntaje + " puntos.");
        System.out.println("Cantidad total de tiros al centro: " + tirosAlCentro);
    }
}
