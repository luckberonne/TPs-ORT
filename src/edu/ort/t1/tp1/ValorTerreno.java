package edu.ort.t1.tp1;
import java.util.Scanner;

public class ValorTerreno {
	public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el ancho del terreno en metros: ");
        double ancho = scanner.nextDouble();
        System.out.print("Ingrese el largo del terreno en metros: ");
        double largo = scanner.nextDouble();
        System.out.print("Ingrese el valor del metro cuadrado: ");
        double valorM2 = scanner.nextDouble();
        double valorTotal = ancho * largo * valorM2;
        double perimetro = 2 * (ancho + largo);
        double alambreTotal = perimetro * 3;
        System.out.printf("El valor total del terreno es: %.2f%n", valorTotal);
        System.out.printf("Se necesitan %.2f metros de alambre.%n", alambreTotal);
    }
}
