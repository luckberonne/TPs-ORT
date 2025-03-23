package edu.ort.t1.tp1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE PROGRAMAS ---");
            System.out.println("1. Mensaje de Bienvenida");
            System.out.println("2. Promedio de Notas");
            System.out.println("3. Operaciones con un Número");
            System.out.println("4. Cálculo de Salario Semanal");
            System.out.println("5. Intercambio de Valores");
            System.out.println("6. Sueldo del Vendedor");
            System.out.println("7. Valor del Terreno");
            System.out.println("8. Operaciones Matemáticas Básicas");
            System.out.println("9. Cálculo de Ángulo en un Triángulo");
            System.out.println("10. Aportes de Socios");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> Bienvenida.ejecutar(scanner);
                case 2 -> PromedioNotas.ejecutar(scanner);
                case 3 -> OperacionesNumero.ejecutar(scanner);
                case 4 -> SalarioSemanal.ejecutar(scanner);
                case 5 -> IntercambioValores.ejecutar(scanner);
                case 6 -> SueldoVendedor.ejecutar(scanner);
                case 7 -> ValorTerreno.ejecutar(scanner);
                case 8 -> OperacionesBasicas.ejecutar(scanner);
                case 9 -> AnguloTriangulo.ejecutar(scanner);
                case 10 -> AporteSocios.ejecutar(scanner);
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("⚠ Opción inválida, intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}