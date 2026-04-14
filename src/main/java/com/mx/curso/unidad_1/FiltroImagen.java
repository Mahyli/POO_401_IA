package com.mx.curso.unidad_1;

import java.util.ArrayList;
import java.util.List;

// Clase base
class FiltroImagen {
    public void procesar() {
        String mensaje = "procesando imagen";
        System.out.println(mensaje);
    }
}

// Filtro 1
class DetectorDeBordes extends FiltroImagen {
    @Override
    public void procesar() {
        System.out.println("Procesando bordes");
    }
}

// Filtro 2
class EscalaDeGrises extends FiltroImagen {
    @Override
    public void procesar() {
        System.out.println("Procesando escala de grises");
    }
}

// Filtro 3 (lo agregué porque lo usabas)
class ReductorDeRuido extends FiltroImagen {
    @Override
    public void procesar() {
        System.out.println("Reduciendo ruido");
    }
}

// Clase principal
public class   {
    public static void main(String[] args) {

        List<FiltroImagen> pipeline = new ArrayList<>();

        FiltroImagen f1 = new ReductorDeRuido();
        FiltroImagen f2 = new DetectorDeBordes();
        FiltroImagen f3 = new EscalaDeGrises();

        pipeline.add(f1);
        pipeline.add(f2);
        pipeline.add(f3);

        for (FiltroImagen f : pipeline) {
            f.procesar();
        }
    }
}
