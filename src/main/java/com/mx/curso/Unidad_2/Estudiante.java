package com.mx.curso.Unidad_2;

import java.util.ArrayList;
public class Estudiante {

        String nombre;
        int id;

        Estudiante(String nombre, int id) {
            this.nombre = nombre;
            this.id = id;
        }
    }

    class Clase {
        String nombreDeClase;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        void mostrarEstudiantes() {
            for (Estudiante e : estudiantes) {
                System.out.println(e.nombre);
            }
        }
    }

    class Main {
        public static void main(String[] args) {
            Clase clase = new Clase();
            clase.nombreDeClase = "Programación";

            clase.estudiantes.add(new Estudiante("Ana", 1));
            clase.estudiantes.add(new Estudiante("Luis", 2));
            clase.estudiantes.add(new Estudiante("Carlos", 3));

            clase.mostrarEstudiantes();
        }
    }
