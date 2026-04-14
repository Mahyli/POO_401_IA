package com.mx.curso.unidad_1.Contexualizacion;

public class CapaNeuronal {
    public void propagacionHaciaAdelante() {
        System.out.println("Realizando propagación hacia adelante...");
    }
}

public class CapaConvolucional extends CapaNeuronal {

    @Override
    public void propagacionHaciaAdelante() {
        System.out.println("Transformando tensores con operación convolucional.");
    }
}

public class CapaDensa extends CapaNeuronal {

    @Override
    public void propagacionHaciaAdelante() {
        System.out.println("Transformando tensores con capa densa.");
    }
}

public class Main {
    public static void main(String[] args) {

        CapaConvolucional conv = new CapaConvolucional();
        conv.propagacionHaciaAdelante();

        CapaDensa densa = new CapaDensa();
        densa.propagacionHaciaAdelante();
    }
}
