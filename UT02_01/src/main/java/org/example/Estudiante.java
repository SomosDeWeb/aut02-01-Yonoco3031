package org.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaMedia;
    private boolean matricula;

    public Estudiante(String nombre, int edad, double notaMedia, boolean matricula) {
        setNombre(nombre);
        setEdad(edad);
        setNotaMedia(notaMedia);
        setMatricula(matricula);
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            throw new IllegalArgumentException("El nombre solo puede contener letras y espacios.");
        }
        this.nombre = nombre.trim();
    }

    public void setEdad(int edad) {
        if(edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser positiva.");
        }
        this.edad = edad;
    }

    public void setNotaMedia(double notaMedia) {
        if(notaMedia < 0 || notaMedia > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
        }
        this.notaMedia = notaMedia;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString () {
        return nombre + " (" + edad + " años)" + " - Nota media: " + notaMedia + " - Matriculado: " + matricula + "\n";
    }
}
