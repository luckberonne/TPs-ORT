package edu.ort.t1.tp2.ejercicios.models;

public class Computadora {
    private String marca;
    private TipoComputadora tipo;
    private Procesador procesador;
    private LectoraDVD lectoraDVD;

    public Computadora() {
        this.marca = "";
        this.tipo = TipoComputadora.DESKTOP;
        this.procesador = new Procesador();
        this.lectoraDVD = null; // No todas tienen lectora DVD
    }

    public Computadora(String marca, TipoComputadora tipo, Procesador procesador, LectoraDVD lectoraDVD) {
        this.marca = marca;
        this.tipo = tipo;
        this.procesador = procesador;
        this.lectoraDVD = lectoraDVD;
    }

    public void prender() {
        System.out.println("La computadora está prendida.");
    }

    public void apagar() {
        System.out.println("La computadora está apagada.");
    }

    public void reiniciar() {
        System.out.println("La computadora se está reiniciando.");
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public TipoComputadora getTipo() { return tipo; }
    public void setTipo(TipoComputadora tipo) { this.tipo = tipo; }

    public Procesador getProcesador() { return procesador; }
    public void setProcesador(Procesador procesador) { this.procesador = procesador; }

    public LectoraDVD getLectoraDVD() { return lectoraDVD; }
    public void setLectoraDVD(LectoraDVD lectoraDVD) { this.lectoraDVD = lectoraDVD; }
}