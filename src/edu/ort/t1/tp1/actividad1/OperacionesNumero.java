package edu.ort.t1.tp1.actividad1;
import java.util.Scanner;

public class OperacionesNumero {
	 public static void ejecutar(Scanner scanner) {
	        System.out.print("Ingrese un número entero: ");
	        int numero = scanner.nextInt();
	        System.out.println("Multiplicado por 5: " + (numero * 5));
	        System.out.println("Dividido por 2: " + (numero / 2.0));
	    }
}
