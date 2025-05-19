package edu.ort.t1.tp2.ejercicios.models;

public class Titular {
    private String nombre;

    public Titular(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
