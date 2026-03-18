package com.mx.curso.unidad_1.examen;

public class SistemaPago {

    // Clase abstracta base
    static abstract class Pago {
        public abstract void procesarPago();
    }

    // Clase de Tarjeta
    static class Tarjeta extends Pago {
        @Override
        public void procesarPago() {
            System.out.println("Pago realizado con Tarjeta");
        }
    }

    // Clase de PayPal
    static class PayPal extends Pago {
        @Override
        public void procesarPago() {
            System.out.println("Pago realizado con PayPal");
        }
    }

    // Clase de Criptomoneda
    static class Criptomoneda extends Pago {
        @Override
        public void procesarPago() {
            System.out.println("Pago realizado con Criptomoneda");
        }
    }

    // Método principal
    public static void main(String[] args) {

        // Uso de polimorfismo
        Pago p = new Tarjeta();
        p.procesarPago();

        p = new PayPal();
        p.procesarPago();

        p = new Criptomoneda();
        p.procesarPago();
    }
}