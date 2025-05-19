package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class TiroAlBlancoModularizado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // es mejor pasarlo por parametro o declararlo globalmente?
        int cantidadJugadores = obtenerCantidadJugadores(scanner);
        jugar(scanner, cantidadJugadores);
        scanner.close();
    }

    public static int obtenerCantidadJugadores(Scanner scanner) {
        int cantidadJugadores;
        do {
            System.out.print("Ingrese la cantidad de jugadores (mínimo 2): ");
            cantidadJugadores = scanner.nextInt();
            if (cantidadJugadores < 2) {
                System.out.println("Debe haber al menos 2 jugadores.");
            }
        } while (cantidadJugadores < 2);
        return cantidadJugadores;
    }

    public static void jugar(Scanner scanner, int cantidadJugadores) {
        String ganador = "";
        int mayorPuntaje = 0;
        int tirosAlCentro = 0;

        for (int i = 1; i <= cantidadJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + i + ": ");
            String nombre = scanner.next();

            int puntajeJugador = 0;

            for (int tiro = 1; tiro <= 3; tiro++) {
                int distancia = obtenerDistancia(scanner, tiro);
                puntajeJugador += calcularPuntos(distancia); //tiros al centro ??
                if (distancia == 0) {
                    tirosAlCentro++;
                }
            }

            System.out.println("Total de puntos de " + nombre + ": " + puntajeJugador);

            if (puntajeJugador > mayorPuntaje) {
                mayorPuntaje = puntajeJugador;
                ganador = nombre;
            }
        }

        mostrarResultados(ganador, mayorPuntaje, tirosAlCentro);
    }

    public static int obtenerDistancia(Scanner scanner, int tiro) {
        int distancia;
        do {
            System.out.print("Ingrese la distancia del tiro " + tiro + " (mayor o igual a 0): ");
            distancia = scanner.nextInt();
            if (distancia < 0) {
                System.out.println("La distancia no puede ser negativa.");
            }
        } while (distancia < 0);
        return distancia;
    }

    public static int calcularPuntos(int distancia) {
        int puntos;

        if (distancia == 0) {
            puntos = 500;
        } else if (distancia <= 10) {
            puntos = 250;
        } else if (distancia <= 50) {
            puntos = 100;
        } else {
            puntos = 0;
        }

        return puntos;
    }

    public static void mostrarResultados(String ganador, int mayorPuntaje, int tirosAlCentro) {
        System.out.println("Ganador: " + ganador + " con " + mayorPuntaje + " puntos.");
        System.out.println("Cantidad total de tiros al centro: " + tirosAlCentro);
    }
}
