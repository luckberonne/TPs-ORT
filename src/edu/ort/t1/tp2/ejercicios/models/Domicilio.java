package edu.ort.t1.tp2.ejercicios.models;

public class Domicilio {
	private String calle;
    private int numero;
    private String ciudad;

    public Domicilio() {
        this.calle = "";
        this.numero = 0;
        this.ciudad = "";
    }

    public void setCalle(String calle) { this.calle = calle; }
    public void setNumero(int numero) { this.numero = numero; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getCalle() { return calle; }
    public int getNumero() { return numero; }
    public String getCiudad() { return ciudad; }

    public String obtenerDomicilioCompleto() {
        return calle + " " + numero + ", " + ciudad;
    }
}
