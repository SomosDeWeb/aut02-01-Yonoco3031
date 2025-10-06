package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        int opciones;
        do {
            System.out.println("\n=== Gestor de Estudiantes ===");
            System.out.println("1. Añadir estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Calcular nota media general");
            System.out.println("5. Mostrar mejor estudiante");
            System.out.println("6. Salir");
            System.out.print("Seleccione opción: ");

            opciones = sc.nextInt();
            sc.nextLine();

            switch (opciones) {
                case 1:
                    System.out.println("Introduce nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce edad:");
                    int edad = sc.nextInt();
                    System.out.println("Introduce nota media:");
                    double notaMedia = sc.nextDouble();;
                    System.out.printf("¿Está matriculado? (true/false):");
                    boolean matriculado = sc.nextBoolean();
                    estudiantes.add(new Estudiante(nombre, edad, notaMedia, matriculado));
                    System.out.printf("Estudiante añadido correctamente.");
                    break;
                case 2:
                    System.out.printf("Lista de estudiantes:");
                    if (estudiantes.isEmpty()) {
                        System.out.printf("No hay estudiantes registrados.");
                    } else {
                        for (Estudiante e : estudiantes) {
                            System.out.printf(String.valueOf(e));
                        }
                    }
                    break;
                case 3:
                    System.out.printf("Intruduce el nombre a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Estudiante e : estudiantes) {
                        if (e.getNombre().equalsIgnoreCase(buscar)) {
                            System.out.printf("Encontrado: " + e);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.printf("No se encontro ningún estudiante con ese nombre.");
                    }
                    break;
            }
        } while (opciones != 6);
    }
}
