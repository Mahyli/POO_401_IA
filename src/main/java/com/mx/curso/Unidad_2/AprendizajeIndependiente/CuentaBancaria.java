package com.mx.curso.Unidad_2.AprendizajeIndependiente;

public class CuentaBancaria {

        private double saldo;

        public CuentaBancaria(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void depositar(double cantidad) {
            saldo += cantidad;
        }

        public void retirar(double cantidad) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
            } else {
                System.out.println("Fondos insuficientes");
            }
        }

        public double getSaldo() {
            return saldo;
        }

        public static void main(String[] args) {
            CuentaBancaria cuenta = new CuentaBancaria(1000);

            cuenta.depositar(500);
            cuenta.retirar(300);
            cuenta.retirar(1500);

            System.out.println("Saldo actual: " + cuenta.getSaldo());
        }
    }

