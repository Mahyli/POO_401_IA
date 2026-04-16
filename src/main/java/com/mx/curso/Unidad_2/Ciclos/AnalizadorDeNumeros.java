package com.mx.curso.Unidad_2.Ciclos;

import java.util.Scanner;

public class AnalizadorDeNumeros {
    public static void main(String[] args) {

        // Tarea 1: Suma del 1 al 100 (for)
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("Suma del 1 al 100: " + suma);

        // Tarea 2: Primer número mayor a 50 (while)
        int num = 1;
        while (true) {
            if (num > 50) {
                System.out.println("Primer número mayor a 50: " + num);
                break;
            }
            num++;
        }

        // Tarea 3: Validar contraseña (do-while)
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "1234";
        String input;
        boolean esCorrecta;

        do {
            System.out.print("Ingrese la contraseña: ");
            input = scanner.nextLine();

            esCorrecta = input.equals(contraseñaCorrecta);

            if (!esCorrecta) {
                System.out.println("Contraseña incorrecta.");
            }

        } while (!esCorrecta);

        System.out.println("Acceso concedido.");
        scanner.close();
    }
}