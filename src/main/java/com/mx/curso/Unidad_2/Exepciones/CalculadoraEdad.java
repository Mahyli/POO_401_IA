package com.mx.curso.Unidad_2.Exepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anioActual = 2025;

        try {
            System.out.print("Ingresa tu año de nacimiento: ");
            int anioNacimiento = sc.nextInt();

            int edad = anioActual - anioNacimiento;

            System.out.println("Tu edad es: " + edad + " años.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número válido.");
        } finally {
            sc.close(); // liberar recursos
        }
    }
}