package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class Pintura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Constantes
        final String FIN = "FIN";
        final int BARRIOS = 10;

        // Acumuladores y contadores generales
        int horasTotalesxBarrio = 0;
        int cantArtistas = 0;
        int maxPintura = 0;

        // Auxiliares para nombres
        String nombreArtista;
        String nombreMaxPintura = "";
        String nombreBarrio;

        int cantPinturaTotalxBarrio;
        int cantPinturaTotal = 0;
        int horas;
        int pintura;

        // Recorre los 10 barrios
        for(int barrio = 1; barrio <= BARRIOS; barrio++) {
        	cantArtistas = 0;
        	cantPinturaTotalxBarrio = 0;
        	horasTotalesxBarrio = 0;

        	// Entrada obligatoria del nombre del barrio
        	do {
				System.out.println("Ingrese Nombre del Barrio");
				nombreBarrio = scanner.nextLine();
			} while (nombreBarrio == "");

        	// Primer artista (fuera del while para evitar mensaje duplicado en primer ingreso)
        	do {
				System.out.println("Ingrese nombre del artista");
				nombreArtista = scanner.nextLine();
			} while (nombreArtista == "");

        	// Procesa artistas del barrio hasta que se ingresa "FIN"
        	while(!nombreArtista.equals(FIN)) {
        		cantArtistas++;

        		// Entrada validada de pintura y horas
        		do {
    				System.out.println("Ingrese Pintura necesaria");
    				pintura = Integer.parseInt(scanner.nextLine());
				} while (pintura < 0);
        		
        		do {
    				System.out.println("Ingrese Horas necesaria");
    				horas = Integer.parseInt(scanner.nextLine());
				} while (horas < 0);

        		// Verifica si es el artista con más pintura usada
        		if (maxPintura < pintura) {
					nombreMaxPintura = nombreArtista;
					maxPintura = pintura;
				}

        		// Acumuladores por barrio
        		cantPinturaTotalxBarrio += pintura;
        		horasTotalesxBarrio += horas;

        		// Solicita el siguiente artista
        		do {
    				System.out.println("Ingrese nombre del artista");
    				nombreArtista = scanner.nextLine();
				} while (nombreArtista == "");
        	}

        	// Muestra resultados del barrio
        	System.out.println("Horas Totales por Barrio: " + horasTotalesxBarrio);
        	System.out.println("Promedio de pintura por Barrio: " + (cantPinturaTotalxBarrio/1000)/cantArtistas);

        	// Acumula pintura total
        	cantPinturaTotal += cantPinturaTotalxBarrio;
        }

        // Resultados generales
        System.out.println("Cantidad Total de mililitros de pintura " + (cantPinturaTotal/1000));
        System.out.println("El artista que usa mas pintura es " + nombreMaxPintura);

        scanner.close();
	}
}
