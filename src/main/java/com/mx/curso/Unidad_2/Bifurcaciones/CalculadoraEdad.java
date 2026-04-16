package com.mx.curso.Unidad_2.Bifurcaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {

    public static void main(String[] args) {

        int anioActual = 2025;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu año de nacimiento: ");
            int anioNacimiento = scanner.nextInt();

            int edad = anioActual - anioNacimiento;
            System.out.println("Tu edad es: " + edad);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número válido.");

        } finally {
            scanner.close();
        }
    }
}