package com.mx.curso.Unidad_2;

public class Personaje {

    abstract class Personaje {
        abstract void atacar();
    }

    class Guerrero extends Personaje {
        void atacar() {
            System.out.println("El guerrero ataca con espada");
        }
    }

    class Mago extends Personaje {
        void atacar() {
            System.out.println("El mago lanza un hechizo");
        }
    }

    class Main {
        public static void main(String[] args) {
            Personaje g = new Guerrero();
            Personaje m = new Mago();

            g.atacar();
            m.atacar();
        }
    }
}
