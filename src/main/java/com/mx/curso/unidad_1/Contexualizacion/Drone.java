package com.mx.curso.unidad_1.Contexualizacion;

public class Drone {
    String nombre;
    int bateria;

    // Constructor
    public Drone(String nombre, int bateria) {
        this.nombre = nombre;
        this.bateria = bateria;
    }

    public void usarBateria(int cantidad) {
        bateria -= cantidad;
    }

    public void mostrarEstado() {
        System.out.println(nombre + " batería: " + bateria + "%");
    }
}
