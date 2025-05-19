package edu.ort.t1.tp2.ejercicios;

public class Ejercicio3 { // Persona
    private String nombre;
    private String apellido;

    public Ejercicio3() {
        this.nombre = "";
        this.apellido = "";
    }

    public void ponerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ponerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
}
