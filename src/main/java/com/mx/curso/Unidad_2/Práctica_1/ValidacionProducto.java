package com.mx.curso.Unidad_2.Práctica_1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidacionProducto {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Nombre del producto: ");
                String nombre = sc.nextLine();

                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();

                System.out.print("Precio: ");
                double precio = sc.nextDouble();

                // Validaciones
                if (cantidad > 0) {
                    if (precio > 0) {
                        System.out.println("Producto registrado correctamente.");
                    } else {
                        System.out.println("Error: El precio debe ser positivo.");
                    }
                } else {
                    System.out.println("Error: La cantidad debe ser mayor a 0.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar valores numéricos válidos.");
            }
        }
    }

