package com.mx.curso.Unidad_2;

public class Producto {

        String nombre;
        double precio;

        void mostrarDetalles() {
            System.out.println(nombre + " - $" + precio);
        }
    }

    class Electronica extends Producto {
        int garantia;

        @Override
        void mostrarDetalles() {
            System.out.println(nombre + " - $" + precio + " Garantía: " + garantia + " años");
        }
    }

    class Alimento extends Producto {
        String fechaCaducidad;

        @Override
        void mostrarDetalles() {
            System.out.println(nombre + " - $" + precio + " Caduca: " + fechaCaducidad);
        }
    }

    class Main {
        public static void main(String[] args) {
            Producto[] productos = new Producto[2];

            Electronica e = new Electronica();
            e.nombre = "Laptop";
            e.precio = 10000;
            e.garantia = 2;

            Alimento a = new Alimento();
            a.nombre = "Pan";
            a.precio = 30;
            a.fechaCaducidad = "20/05/2026";

            productos[0] = e;
            productos[1] = a;

            for (Producto p : productos) {
                p.mostrarDetalles();
            }
        }
    }
