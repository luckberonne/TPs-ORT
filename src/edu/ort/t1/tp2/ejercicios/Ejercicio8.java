package edu.ort.t1.tp2.ejercicios;

import edu.ort.t1.tp2.ejercicios.models.TarjetaDeCredito;
import edu.ort.t1.tp2.ejercicios.models.Titular;

public class Ejercicio8 {
    public static void ejecutar() {
    	Titular titular = new Titular("Juan Perez");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4145-4141-2222-1111", titular, 10000);

        boolean compra1 = tarjeta.realizarCompra(4000);
        System.out.println("Compra de $4000: " + (compra1 ? "Exitosa" : "Fallida"));
        System.out.println(tarjeta);

        tarjeta.actualizarLimite(3000);
        System.out.println("Límite actualizado a $3000");

        boolean compra2 = tarjeta.realizarCompra(4000);
        System.out.println("Compra de $4000 después de bajar límite: " + (compra2 ? "Exitosa" : "Fallida"));
        System.out.println(tarjeta);
    }

}
