package edu.ort.t1.tp1;

import edu.ort.t1.tp1.actividad1.*;
import edu.ort.t1.tp1.actividad2.*;
import edu.ort.t1.tp1.actividad3.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== MENÚ PRINCIPAL ====");
            System.out.println("1. Actividad 1 (Ejercicios 1 al 10)");
            System.out.println("2. Actividad 2 (Ejercicios 11 al 21)");
            System.out.println("3. Actividad 3 (Ejercicios 22 al 39)");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuActividad1(scanner);
                    break;
                case 2:
                    menuActividad2(scanner);
                    break;
                case 3:
                    menuActividad3(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void menuActividad1(Scanner scanner) {
        int opcion;
        do {
            System.out.println("=== ACTIVIDAD 1 ===");
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
            System.out.println("0. Volver");
            System.out.print("Seleccione un ejercicio: ");
            opcion = scanner.nextInt();

            switch (opcion) {
	            case 1: Bienvenida.ejecutar(scanner); break;
	            case 2: PromedioNotas.ejecutar(scanner); break;
	            case 3: OperacionesNumero.ejecutar(scanner); break;
	            case 4: SalarioSemanal.ejecutar(scanner); break;
	            case 5: IntercambioValores.ejecutar(scanner); break;
	            case 6: SueldoVendedor.ejecutar(scanner); break;
	            case 7: ValorTerreno.ejecutar(scanner); break;
	            case 8: OperacionesBasicas.ejecutar(scanner); break;
	            case 9: AnguloTriangulo.ejecutar(scanner); break;
	            case 10: AporteSocios.ejecutar(scanner); break;
	            case 0: System.out.println("Saliendo del programa..."); break;
	            default: System.out.println("⚠ Opción inválida, intente nuevamente."); break;
            }
        } while (opcion != 0);
    }

    private static void menuActividad2(Scanner scanner) {
        int opcion;
        do {
            System.out.println("=== ACTIVIDAD 2 ===");
            System.out.println("11. ParImpar");
            System.out.println("12. NumeroMayor");
            System.out.println("13. NumeroMayorTres");
            System.out.println("14. MontañaRusaInfierno");
            System.out.println("15. MontañaRusaMiedo");
            System.out.println("16. CapacidadAuditorio");
            System.out.println("17. EdadJubilacion");
            System.out.println("18. MayorDivisibleMenor");
            System.out.println("19. ReglasNumero");
            System.out.println("20. Calculadora");
            System.out.println("21. DiaSemana");
            System.out.println("0. Volver");
            System.out.print("Seleccione un ejercicio: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 11: ParImpar.ejecutar(scanner); break;
                case 12: MayorDeDos.ejecutar(scanner); break;
                case 13: MayorDeTres.ejecutar(scanner); break;
                case 14: MontañaRusaInfierno.ejecutar(scanner); break;
                case 15: MontañaRusaMiedo.ejecutar(scanner); break;
                case 16: CapacidadAuditorio.ejecutar(scanner); break;
                case 17: EdadJubilacion.ejecutar(scanner); break;
                case 18: DivisibleMayorMenor.ejecutar(scanner); break;
                case 19: ReglasConjuntos.ejecutar(scanner); break;
                case 20: Calculadora.ejecutar(scanner); break;
                case 21: DiaSemana.ejecutar(scanner); break;
                case 0: break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void menuActividad3(Scanner scanner) {
        int opcion;
        do {
            System.out.println("=== ACTIVIDAD 3 ===");
            System.out.println("39. DiaSemana");
            System.out.println("0. Volver");
            System.out.print("Seleccione un ejercicio: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 39: TiroAlBlanco.ejecutar(scanner); break;
                case 0: break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
