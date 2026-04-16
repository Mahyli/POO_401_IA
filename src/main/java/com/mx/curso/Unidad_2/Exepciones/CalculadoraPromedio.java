package com.mx.curso.Unidad_2.Exepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraPromedio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa la primera nota: ");
            double nota1 = sc.nextDouble();

            System.out.print("Ingresa la segunda nota: ");
            double nota2 = sc.nextDouble();

            double promedio = (nota1 + nota2) / 2;

            System.out.println("El promedio es: " + promedio);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar solo números.");
        } finally {
            sc.close(); // liberar recursos
        }
    }
}
