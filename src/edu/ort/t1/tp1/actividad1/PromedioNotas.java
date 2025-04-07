package edu.ort.t1.tp1.actividad1;
import java.util.Scanner;

public class PromedioNotas {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese la nota del primer trimestre: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese la nota del segundo trimestre: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingrese la nota del tercer trimestre: ");
        double nota3 = scanner.nextDouble();
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.printf("El promedio de las notas es: %.2f%n", promedio);
    }

}
