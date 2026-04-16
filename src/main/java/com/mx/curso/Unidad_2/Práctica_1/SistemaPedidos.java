package com.mx.curso.Unidad_2.Práctica_1;

import java.util.Scanner;

public class SistemaPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Entregado")) {
            System.out.print("Estado del pedido: ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("Error en envio")) {
                System.out.println("Proceso detenido por error.");
                break; // detiene todo
            }

            if (estado.equalsIgnoreCase("En camino")) {
                System.out.println("El pedido sigue en camino...");
                continue; // salta a la siguiente iteración
            }

            if (estado.equalsIgnoreCase("Entregado")) {
                System.out.println("Pedido entregado correctamente.");
            }
        }
    }
}
