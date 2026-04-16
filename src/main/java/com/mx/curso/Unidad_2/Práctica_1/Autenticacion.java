package com.mx.curso.Unidad_2.Práctica_1;

import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String passwordCorrecto = "pass123";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Contraseña: ");
            String password = sc.nextLine();

            if (usuario.equals(usuarioCorrecto)) {
                if (password.equals(passwordCorrecto)) {
                    System.out.println("Autenticación exitosa.");
                    break;
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else {
                System.out.println("Usuario no encontrado.");
            }

            if (i == 3) {
                System.out.println("Demasiados intentos. Acceso denegado.");
            }
        }
    }
}
