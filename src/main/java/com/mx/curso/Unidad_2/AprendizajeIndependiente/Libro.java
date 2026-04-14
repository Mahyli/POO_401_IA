package com.mx.curso.Unidad_2.AprendizajeIndependiente;

public class Libro {

        String titulo;
        String autor;
        int paginas;

        void mostrarInfo() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Páginas: " + paginas);
            System.out.println("----------------------");
        }

        public static void main(String[] args) {
            Libro libro1 = new Libro();
            libro1.titulo = "El Principito";
            libro1.autor = "Antoine de Saint-Exupéry";
            libro1.paginas = 96;

            Libro libro2 = new Libro();
            libro2.titulo = "Cien Años de Soledad";
            libro2.autor = "Gabriel García Márquez";
            libro2.paginas = 471;

            libro1.mostrarInfo();
            libro2.mostrarInfo();
        }
    }

