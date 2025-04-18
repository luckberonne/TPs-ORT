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
            System.out.println("22. NumerosUnoAlCinco");
            System.out.println("23. MultiplosDeN");
            System.out.println("24. SecuenciaEntreNumeros");
            System.out.println("25. MatrizCruces");
            System.out.println("26. Multiplos3No5");
            System.out.println("27. PromedioEdades");
            System.out.println("28. MayorYPosicion");
            System.out.println("29. ValidarNota");
            System.out.println("30. CalculadoraVariasOperaciones");
            System.out.println("31. ValidarContinuarWhile");
            System.out.println("315. ValidarContinuarDoWhile");
            System.out.println("32. ValidarNotaEspecial");
            System.out.println("33. MaximoMinimo");
            System.out.println("34. PromedioEstatura");
            System.out.println("35. PersonaMasJoven");
            System.out.println("36. PromedioMenorA20");
            System.out.println("37. SueldosEmpleado");
            System.out.println("38. ControlAccesoWeb");
            System.out.println("39. TiroAlBlanco");
            System.out.println("0. Volver");
            System.out.print("Seleccione un ejercicio: ");
            opcion = scanner.nextInt();

            switch (opcion) {
            	case 22: NumerosUnoAlCinco.ejecutar(); break;
            	case 23: MultiplosDeN.ejecutar(scanner); break;
            	case 24: SecuenciaEntreNumeros.ejecutar(scanner); break;
            	case 25: MatrizCruces.ejecutar(scanner); break;
            	case 26: Multiplos3No5.ejecutar(scanner); break;
            	case 27: PromedioEdades.ejecutar(scanner); break;
            	case 28: MayorYPosicion.ejecutar(scanner); break;
            	case 29: ValidarNota.ejecutar(scanner); break;
            	case 30: CalculadoraVariasOperaciones.ejecutar(scanner); break;
            	case 31: ValidarContinuarWhile.ejecutar(scanner); break;
            	case 315: ValidarContinuarDoWhile.ejecutar(scanner); break;
            	case 32: ValidarNotaEspecial.ejecutar(scanner); break;
            	case 33: MaximoMinimo.ejecutar(scanner); break;
            	case 34: PromedioEstatura.ejecutar(scanner); break;
            	case 35: PersonaMasJoven.ejecutar(scanner); break;
            	case 36: PromedioMenorA20.ejecutar(scanner); break;
            	case 37: SueldosEmpleado.ejecutar(scanner); break;
            	case 38: ControlAccesoWeb.ejecutar(scanner); break;
                case 39: TiroAlBlanco.ejecutar(scanner); break;
                case 0: break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
