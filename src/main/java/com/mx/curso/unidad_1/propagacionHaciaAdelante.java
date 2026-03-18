package com.mx.curso.unidad_1;

import com.mx.curso.unidad_1.Contexualizacion.CapaNeuronal;

public class propagacionHaciaAdelante (){
    System.out.println("Realizando propagación hacia adelante...");
}
}

class CapaConvolucional extends CapaNeuronal {

    @Override
    public void propagacionHaciaAdelante() {
        System.out.println("Transformando tensores con operación convolucional.");
    }
}

class CapaDensa extends CapaNeuronal {

    @Override
    public void propagacionHaciaAdelante() {
        System.out.println("Transformando tensores con capa densa.");
    }
}

public class Main {
    public static void main(String[] args) {

        com.mx.curso.unidad_1.Contexualizacion.CapaConvolucional conv = new com.mx.curso.unidad_1.Contexualizacion.CapaConvolucional();
        conv.propagacionHaciaAdelante();

        com.mx.curso.unidad_1.Contexualizacion.CapaDensa densa = new com.mx.curso.unidad_1.Contexualizacion.CapaDensa();
        densa.propagacionHaciaAdelante();
    }
}
