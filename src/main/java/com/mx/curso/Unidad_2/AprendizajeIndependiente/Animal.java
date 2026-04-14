package com.mx.curso.Unidad_2.AprendizajeIndependiente;

class Animal {
    void hacerSonido() {
        System.out.println("Sonido del animal");
    }
}

public class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}

public class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau");
    }
}

class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[2];
        animales[0] = new Perro();
        animales[1] = new Gato();

        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}