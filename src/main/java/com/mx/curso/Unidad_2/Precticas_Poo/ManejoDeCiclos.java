package com.mx.curso.Unidad_2.Precticas_Poo;

public class ManejoDeCiclos {

    public static void main(String[] args) {

        // =========================
        // Tarea 1: while (1 al 5)
        // =========================
        int contador = 1;
        System.out.println("Conteo Ascendente (while):");

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // =========================
        // Tarea 2: do-while (10 al 8)
        // =========================
        int numero = 10;
        System.out.println("\nConteo Descendente (do-while):");

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 8);

        // =========================
        // Tarea 3: for (tabla del 7)
        // =========================
        System.out.println("\nTabla del 7:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }
}