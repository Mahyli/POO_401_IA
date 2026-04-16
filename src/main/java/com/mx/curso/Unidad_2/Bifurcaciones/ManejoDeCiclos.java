package com.mx.curso.Unidad_2.Bifurcaciones;
public class ManejoDeCiclos {

    public static void main(String[] args) {

        int contador = 1;
        System.out.println("Conteo Ascendente (while):");

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        int numero = 10;
        System.out.println("\nConteo Descendente (do-while):");

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 8);

        System.out.println("\nTabla del 7:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }
}
