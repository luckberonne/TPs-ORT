package edu.ort.t1.parcial;

import java.util.Scanner;

public class Parcial {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int fechaAnterior = 19010100;
        int mayorDiferencia = Integer.MIN_VALUE;
        int fechaMayorDiferencia = 0;
        int asistentesTarde;
        int asistentesNoche;
        int diferencia;
        
        System.out.println("Sistema de control de asistentes al cine por turnos.");
        int fecha = leerFecha();
        
        while (fecha != -1) {
            if (esFechaValida(fecha, fechaAnterior)) {
            	asistentesTarde = leerAsistentes("tarde");
                asistentesNoche = leerAsistentes("noche");

                diferencia = calcularDiferencia(asistentesTarde, asistentesNoche);
                System.out.println("Diferencia de asistentes ese día: " + diferencia);

                if (diferencia > mayorDiferencia) {
                    mayorDiferencia = diferencia;
                    fechaMayorDiferencia = fecha;
                }

                fechaAnterior = fecha;
            } else {
                System.out.println("Error: la fecha debe ser mayor a la anterior.");
            }

            fecha = leerFecha();
        }

        mostrarResultadoFinal(mayorDiferencia, fechaMayorDiferencia);
        scanner.close();
    }

    private static int leerFecha() {
        System.out.print("Ingrese fecha |AAAAMMDD| o |-1| para terminar: ");
        return scanner.nextInt();
    }

    private static boolean esFechaValida(int fechaActual, int fechaAnterior) {
    	boolean fechaValida = fechaActual > fechaAnterior && fechaActual >= 19010101;
        return fechaValida;
    }

    private static int leerAsistentes(String turno) {
        System.out.print("Ingrese asistentes para la función de la " + turno + ": ");
        return scanner.nextInt();
    }

    private static int calcularDiferencia(int tarde, int noche) {
    	int diferencia = 0;
    	
    	if (tarde > noche) {
    		diferencia = tarde - noche;
    	}else {
    		diferencia = noche - tarde;
		}
    	
        return diferencia;
    }

    private static void mostrarResultadoFinal(int mayorDiferencia, int fecha) {
        if (mayorDiferencia != Integer.MIN_VALUE) {
            System.out.println("Mayor diferencia registrada: " + mayorDiferencia + " en la fecha " + fecha);
        } else {
            System.out.println("No hay datos para procesar.");
        }
    }
}
