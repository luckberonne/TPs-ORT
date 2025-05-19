package edu.ort.t1.tp2.ejercicios.models;

public class DomicilioEj9 {
	    private String calle;
	    private int altura;
	    private String barrio;

	    public DomicilioEj9(String calle, int altura, String barrio) {
	        this.calle = calle;
	        this.altura = altura;
	        this.barrio = barrio;
	    }

	    @Override
	    public String toString() {
	        return calle + " " + altura + ", " + barrio;
	    }
	}
