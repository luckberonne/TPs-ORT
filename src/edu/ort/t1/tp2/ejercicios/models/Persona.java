package edu.ort.t1.tp2.ejercicios.models;

public class Persona {
    private String nombre;
    private String apellido;
    private Domicilio domicilio;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.domicilio = new Domicilio(); 
    }

    public void ponerNombre(String nombre) { this.nombre = nombre; }
    public void ponerApellido(String apellido) { this.apellido = apellido; }
    public String obtenerNombreCompleto() { return this.nombre + " " + this.apellido; }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    public Domicilio getDomicilio() {
        return this.domicilio;
    }

    public void mostrarDomicilio() {
        if (this.domicilio != null) {
            System.out.println("Domicilio: " + domicilio.obtenerDomicilioCompleto());
        } else {
            System.out.println("Sin domicilio asignado.");
        }
    }
}
