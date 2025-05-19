package edu.ort.t1.tp2.ejercicios.models;

public class LectoraDVD {
    private String marca;
    private boolean puedeGrabar;

    public LectoraDVD() {
        this.marca = "";
        this.puedeGrabar = false;
    }

    public LectoraDVD(String marca, boolean puedeGrabar) {
        this.marca = marca;
        this.puedeGrabar = puedeGrabar;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public boolean isPuedeGrabar() { return puedeGrabar; }
    public void setPuedeGrabar(boolean puedeGrabar) { this.puedeGrabar = puedeGrabar; }
}