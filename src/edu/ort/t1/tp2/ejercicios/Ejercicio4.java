package edu.ort.t1.tp2.ejercicios;

import edu.ort.t1.tp2.ejercicios.models.Persona;

public class Ejercicio4 {
    public static void ejecutar() {

		Persona persona1 = new Persona();
	    persona1.ponerNombre("Fulano");
	    persona1.ponerApellido("Gomez");
	
	    System.out.println("Persona 1: " + persona1.obtenerNombreCompleto());
	    
	    Persona persona2 = new Persona();
	    persona2.ponerNombre("Maria");
	    persona2.ponerApellido("Lopez");
	    
	    System.out.println("Persona 2: " + persona2.obtenerNombreCompleto());
    }

}
