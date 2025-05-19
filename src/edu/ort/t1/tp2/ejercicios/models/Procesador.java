package edu.ort.t1.tp2.ejercicios.models;

public class Procesador {
    private String marca;
    private String modelo;
    private double nivelTemperaturaActual;
    private final double nivelTemperaturaCritica = 90.0;

    public Procesador() {
        this.marca = "";
        this.modelo = "";
        this.nivelTemperaturaActual = 25.0;
    }

    public Procesador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.nivelTemperaturaActual = 25.0;
    }

    public void notificarTemperaturaCritica() {
        if (nivelTemperaturaActual >= nivelTemperaturaCritica) {
            System.out.println("¡Alerta! Temperatura crítica alcanzada: " + nivelTemperaturaActual + "°C");
        }
    }

    public void setNivelTemperaturaActual(double temperatura) {
        this.nivelTemperaturaActual = temperatura;
        notificarTemperaturaCritica();
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getNivelTemperaturaActual() { return nivelTemperaturaActual; }
}