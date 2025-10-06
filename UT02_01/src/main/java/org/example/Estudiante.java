package org.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaMedia;
    private boolean matricula;

    public Estudiante(String nombre, int edad, double notaMedia, boolean matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String toString () {
        return nombre + " (" + edad + ")" + " - Nota media: " + notaMedia + " - Matriculado: " + matricula;
    }
}
