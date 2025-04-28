package edu.ort.t1.simulacro;

import java.util.Scanner;

public class ConsultaPopular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        procesarVotaciones(scanner);
        scanner.close();
    }

    public static void procesarVotaciones(Scanner scanner) {
        int votosSi = 0;
        int votosNo = 0;
        int votosBlanco = 0;
        int sumaEdades = 0;
        int cantidadVotantes = 0;
        boolean finalizar = false;

        while (!finalizar) {
            String voto = solicitarVoto(scanner);
            finalizar = voto.equalsIgnoreCase("F");

            if (!finalizar) {
                int edad = solicitarEdad(scanner);
                sumaEdades += edad;
                cantidadVotantes++;

                if (voto.equalsIgnoreCase("S")) {
                    votosSi++;
                } else if (voto.equalsIgnoreCase("N")) {
                    votosNo++;
                } else if (voto.equalsIgnoreCase("B")) {
                    votosBlanco++;
                }
            }
        }

        informarResultados(votosSi, votosNo, votosBlanco, sumaEdades, cantidadVotantes);
    }

    public static String solicitarVoto(Scanner scanner) {
        String votoValido = "";
        boolean esValido = false;

        while (!esValido) {
            System.out.print("Ingrese su voto (S/N/B/F): ");
            String voto = scanner.next().toUpperCase();

            if (voto.equals("S") || voto.equals("N") || voto.equals("B") || voto.equals("F")) {
                votoValido = voto;
                esValido = true;
            } else {
                System.out.println("Voto inválido. Intente nuevamente.");
            }
        }

        return votoValido;
    }

    public static int solicitarEdad(Scanner scanner) {
        int edadValida = 0;
        boolean esValida = false;

        while (!esValida) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad >= 18) {
                edadValida = edad;
                esValida = true;
            } else {
                System.out.println("Edad inválida. Debe ser 18 años o más.");
            }
        }

        return edadValida;
    }

    public static void informarResultados(int votosSi, int votosNo, int votosBlanco, int sumaEdades, int cantidadVotantes) {
        if (cantidadVotantes > 0) {
            String resultado = determinarGanador(votosSi, votosNo, votosBlanco);
            double porcentajeNo = (votosNo * 100.0) / cantidadVotantes;
            double promedioEdad = sumaEdades / (double) cantidadVotantes;

            System.out.println(resultado);
            System.out.println("Porcentaje que no desea que haya podas: " + Math.round(porcentajeNo) + "%");
            System.out.println("La edad promedio de los votantes es de " + Math.round(promedioEdad));
        } else {
            System.out.println("No se registraron votaciones.");
        }
    }

    public static String determinarGanador(int votosSi, int votosNo, int votosBlanco) {
        String resultado = "";

        if (votosBlanco > votosSi && votosBlanco > votosNo) {
            resultado = "Indeterminado";
        } else if (votosSi > votosNo) {
            resultado = "Voto a Favor";
        } else {
            resultado = "Voto en Contra";
        }

        return resultado;
    }
}
