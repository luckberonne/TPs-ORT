package edu.ort.t1.tp1.actividad3;

import java.util.Scanner;

public class ControlAccesoWeb {
    public static void ejecutar(Scanner scanner) {
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "123456";

        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < 3) {
            System.out.print("Ingrese usuario: ");
            String usuario = scanner.next();

            System.out.print("Ingrese contraseña: ");
            String contrasena = scanner.next();

            if (usuario.equals("batman") && contrasena.equals("soybatman")) {
                System.out.println("\nBienvenido Caballero de la Noche");
                System.out.println("Gotham está a salvo gracias a ti.\n");
                accesoConcedido = true;
                break;
            }

            if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
                accesoConcedido = true;
                break;
            } else {
                System.out.println("Credenciales incorrectas. Intentelo nuevamente.");
                intentos++;
            }
        }

        if (accesoConcedido) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Se ha bloqueado la cuenta");
        }
    }
}
