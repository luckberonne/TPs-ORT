package edu.ort.t1.tp1.actividad1;
import java.util.Scanner;

public class SalarioSemanal {
	public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el valor de una hora de trabajo: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Ingrese las horas trabajadas por día: ");
        double horasPorDia = scanner.nextDouble();
        double salarioSemanal = (horasPorDia * 5 + (horasPorDia / 2)) * valorHora;
        System.out.printf("El salario semanal es: %.2f%n", salarioSemanal);
    }
}
