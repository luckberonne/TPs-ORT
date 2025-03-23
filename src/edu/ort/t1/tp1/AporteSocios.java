package edu.ort.t1.tp1;

import java.util.Scanner;

public class AporteSocios {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese el nombre del primer socio: ");
        String socio1 = scanner.nextLine();
        System.out.print("Ingrese el capital aportado por " + socio1 + ": ");
        double capital1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del segundo socio: ");
        String socio2 = scanner.nextLine();
        System.out.print("Ingrese el capital aportado por " + socio2 + ": ");
        double capital2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del tercer socio: ");
        String socio3 = scanner.nextLine();
        System.out.print("Ingrese el capital aportado por " + socio3 + ": ");
        double capital3 = scanner.nextDouble();
        scanner.nextLine();

        double totalCapital = capital1 + capital2 + capital3;
        double porcentaje1 = (capital1 / totalCapital) * 100;
        double porcentaje2 = (capital2 / totalCapital) * 100;
        double porcentaje3 = (capital3 / totalCapital) * 100;

        System.out.printf("El total aportado es: %.2f%n", totalCapital);
        System.out.printf("%s aportó: %.2f%% del total.%n", socio1, porcentaje1);
        System.out.printf("%s aportó: %.2f%% del total.%n", socio2, porcentaje2);
        System.out.printf("%s aportó: %.2f%% del total.%n", socio3, porcentaje3);
    }
}
