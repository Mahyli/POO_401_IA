package com.mx.curso.Unidad_2;

public class Restaurante {
        String nombre;
        String tipoDeComida;
        int calificacion;

        void abrir() {
            System.out.println("El restaurante " + nombre + " está abierto.");
        }

        public static void main(String[] args) {
            Restaurante r1 = new Restaurante();
            r1.nombre = "La Parrilla";
            r1.tipoDeComida = "Mexicana";
            r1.calificacion = 5;

            Restaurante r2 = new Restaurante();
            r2.nombre = "Pizza House";
            r2.tipoDeComida = "Italiana";
            r2.calificacion = 4;

            r1.abrir();
            r2.abrir();
        }
    }

