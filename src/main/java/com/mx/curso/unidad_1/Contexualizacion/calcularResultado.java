package com.mx.curso.unidad_1.Contexualizacion;

import com.mx.curso.unidad_1.Metrica;

public class calcularResultado () {
    System.out.println("Calculando resultado de la métrica...");
}
}

class Precision extends Metrica {

    @Override
    public void calcularResultado() {
        System.out.println("Calculando Accuracy (Precisión).");
    }
}

class ErrorCuadraticoMedio extends Metrica {

    @Override
    public void calcularResultado() {
        System.out.println("Calculando Error Cuadrático Medio (MSE).");
    }
}

public class Main {
    public static void main(String[] args) {

        Precision p = new Precision();
        p.calcularResultado();

        ErrorCuadraticoMedio mse = new ErrorCuadraticoMedio();
        mse.calcularResultado();
    }
}
