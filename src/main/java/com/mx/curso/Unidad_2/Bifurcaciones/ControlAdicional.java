package com.mx.curso.Unidad_2.Bifurcaciones;

public class ControlAdicional {

    public static void main(String[] args) {

        System.out.println("Uso de break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nUso de continue:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        int[] numeros = {2, 4, 6, 8, 10};
        String resultado = encontrarNumero(numeros, 6);
        System.out.println("\nResultado búsqueda: " + resultado);
    }

    public static String encontrarNumero(int[] arreglo, int objetivo) {
        for (int num : arreglo) {
            if (num == objetivo) {
                return "Número encontrado";
            }
        }
        return "Número no encontrado";
    }
}