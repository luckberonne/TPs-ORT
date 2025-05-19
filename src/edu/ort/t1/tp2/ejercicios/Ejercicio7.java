package edu.ort.t1.tp2.ejercicios;

import edu.ort.t1.tp2.ejercicios.models.Computadora;
import edu.ort.t1.tp2.ejercicios.models.LectoraDVD;
import edu.ort.t1.tp2.ejercicios.models.Procesador;
import edu.ort.t1.tp2.ejercicios.models.TipoComputadora;
import edu.ort.t1.tp2.ejercicios.models.PersonaEj7;
public class Ejercicio7 {
    public static void ejecutar() {
    	Procesador procesador = new Procesador("Intel", "i7-11700K");
        procesador.setNivelTemperaturaActual(85.0);
        procesador.setNivelTemperaturaActual(95.0); 

        LectoraDVD lectoraDVD = new LectoraDVD("Sony", true);

        Computadora computadora = new Computadora("HP", TipoComputadora.LAPTOP, procesador, lectoraDVD);

        PersonaEj7 persona = new PersonaEj7("Lucas", "González", "12345678", computadora);

        persona.trabajar();
        persona.descansar();

        computadora.prender();
        computadora.reiniciar();
        computadora.apagar();

        if (computadora.getLectoraDVD() != null) {
            System.out.println("La lectora DVD de marca " + computadora.getLectoraDVD().getMarca() +
                               " puede grabar: " + computadora.getLectoraDVD().isPuedeGrabar());
        } else {
            System.out.println("La computadora no tiene lectora DVD.");
        }
    }

}
