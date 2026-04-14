package com.mx.curso.Unidad_2;

public class empleado {

    private double salario;

        public empleado(int id, double salario) {
            this.salario = salario;
        }

        public void aumentarSalario(double porcentaje) {
            salario += salario * (porcentaje / 100);
        }

        public double getSalario() {
            return salario;
        }

        public static void main(String[] args) {
            Empleado emp = new Empleado(1, 1000);
            emp.aumentarSalario(10);
            System.out.println("Salario: " + emp.getSalario());
        }
    }

