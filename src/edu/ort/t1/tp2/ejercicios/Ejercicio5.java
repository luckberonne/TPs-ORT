package edu.ort.t1.tp2.ejercicios;

import edu.ort.t1.tp2.ejercicios.models.Domicilio;
import edu.ort.t1.tp2.ejercicios.models.Persona;

public class Ejercicio5 {
    public static void ejecutar() {
    	Persona persona1 = new Persona();
        persona1.ponerNombre("Fulano");
        persona1.ponerApellido("Gomez");

        Persona persona2 = new Persona();
        persona2.ponerNombre("Maria");
        persona2.ponerApellido("Lopez");

        Domicilio domicilio1 = persona1.getDomicilio();
        domicilio1.setCalle("Av. Maipu");
        domicilio1.setNumero(7421);
        domicilio1.setCiudad("Buenos Aires");

        Domicilio domicilio2 = persona2.getDomicilio();
        domicilio2.setCalle("Viamonte");
        domicilio2.setNumero(1234);
        domicilio2.setCiudad("Buenos Aires");

        System.out.println("Persona 1: " + persona1.obtenerNombreCompleto());
        persona1.mostrarDomicilio();

        System.out.println("Persona 2: " + persona2.obtenerNombreCompleto());
        persona2.mostrarDomicilio();
    }

}
