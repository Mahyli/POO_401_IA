package com.mx.curso.Unidad_2.Bifurcaciones;

public class SistemaCalificaciones {

    public static void main(String[] args) {

        int notaExamen = 95; // puedes cambiar el valor

        // Validación
        if (notaExamen < 0 || notaExamen > 100) {
            System.out.println("La nota es inválida");
            return;
        }

        // if - else
        if (notaExamen >= 60) {
            System.out.println("¡Felicidades, has aprobado!");

            // if anidado
            if (notaExamen >= 90) {
                System.out.println("¡Excelente desempeño!");
            }

        } else {
            System.out.println("Lo sentimos, no has aprobado.");
        }

        // switch (por rangos)
        char calificacion;

        switch (notaExamen / 10) {
            case 10:
            case 9:
                calificacion = 'A';
                break;
            case 8:
                calificacion = 'B';
                break;
            case 7:
                calificacion = 'C';
                break;
            case 6:
                calificacion = 'D';
                break;
            default:
                calificacion = 'F';
        }

        System.out.println("Tu calificación es: " + calificacion);
    }
}
