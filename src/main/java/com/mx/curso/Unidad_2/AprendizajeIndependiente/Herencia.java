package com.mx.curso.Unidad_2.AprendizajeIndependiente;

public class Herencia {
    String sonido;

    void hacerSonido() {
        System.out.println("Sonido del animal");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau");
    }
}

class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();
    }
}
