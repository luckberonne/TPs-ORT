package edu.ort.t1.tp2;

import edu.ort.t1.tp2.ejercicios.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione un ejercicio:");
            System.out.println("1 - Ejercicio1 (sumar y pedirNumero)");
            System.out.println("2 - Ejercicio2 (Persona)");
            System.out.println("3 - Ejercicio3 (Persona)");
            System.out.println("4 - Ejercicio4 (Instanciando)");
            System.out.println("5 - Ejercicio5 (¿Dónde vive Fulano?)");
            System.out.println("6 - Ejercicio6 (Tirando el dado)");
            System.out.println("7 - Ejercicio7 (Compumundo)");
            System.out.println("8 - Ejercicio8 (Que grande esta Tarjeta)");
            System.out.println("9 - Ejercicio9 (Corralito corralón)");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicio1.ejecutar(scanner);
                    break;
                case 2:
                    System.out.println("No es ejecutable...");
					break;
				case 3:
					System.out.println("No es ejecutable...");
					break;
				case 4:
					Ejercicio4.ejecutar();
					break;
				case 5:
					Ejercicio5.ejecutar();
					break;
				case 6:
					Ejercicio6.ejecutar();
					break;
				case 7:
					Ejercicio7.ejecutar();
					break;
				case 8:
					Ejercicio8.ejecutar();
					break;
				case 9:
					Ejercicio9.ejecutar();
					break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
