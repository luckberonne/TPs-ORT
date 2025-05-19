package edu.ort.t1.tp2.ejercicios.models;

public class PersonaEj9 {
	    private int dni;
	    private String nombre;
	    private String apellido;
	    private DomicilioEj9 domicilio;

	    public PersonaEj9(int dni, String nombre, String apellido, DomicilioEj9 domicilio) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.domicilio = domicilio;
	    }

	    public int getDni() {
	        return dni;
	    }

	    @Override
	    public String toString() {
	        return nombre + " " + apellido + " (DNI: " + dni + "), Domicilio: " + domicilio;
	    }
	}
