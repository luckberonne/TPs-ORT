package edu.ort.t1.tp2.ejercicios.models;

public class Dado {
    private int valor;

    public Dado() {
        lanzar(); 
    }

    public void lanzar() {
        valor = (int)(Math.random() * 6) + 1; 
    }

    public int getValor() {
        return valor;
    }
}
