package edu.ort.t1.tp2.ejercicios.models;

public class PersonaEj7 {
    private String nombre;
    private String apellido;
    private String dni;
    private Computadora computadora;

    public PersonaEj7() {
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
        this.computadora = new Computadora();
    }

    public PersonaEj7(String nombre, String apellido, String dni, Computadora computadora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.computadora = computadora;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }

    public void descansar() {
        System.out.println(nombre + " está descansando.");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public Computadora getComputadora() { return computadora; }
    public void setComputadora(Computadora computadora) { this.computadora = computadora; }
}