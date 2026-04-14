package com.mx.curso.Unidad_2;

public class Forma {

        double calcularArea() {
            return 0;
        }
    }

    class Circulo extends Forma {
        double radio;

        Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    class Rectangulo extends Forma {
        double base, altura;

        Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        double calcularArea() {
            return base * altura;
        }
    }

    class Main {
        public static void main(String[] args) {
            Forma[] formas = new Forma[2];
            formas[0] = new Circulo(3);
            formas[1] = new Rectangulo(4, 5);

            for (Forma f : formas) {
                System.out.println("Área: " + f.calcularArea());
            }
        }
    }

