package com.mx.curso.Unidad_2;

public class Interface {
    interface Encendible {
        void encender();

        void apagar();
    }

    static class TV implements Encendible {
        public void encender() {
            System.out.println("TV encendida");
        }

        public void apagar() {
            System.out.println("TV apagada");
        }
    }

    static class Bombilla implements Encendible {
        public void encender() {
            System.out.println("Bombilla encendida");
        }

        public void apagar() {
            System.out.println("Bombilla apagada");
        }
    }

    static class Main {
        public static void main(String[] args) {
            Encendible[] dispositivos = new Encendible[2];
            dispositivos[0] = new TV();
            dispositivos[1] = new Bombilla();

            for (Encendible d : dispositivos) {
                d.encender();
                d.apagar();
            }
        }
    }
}
