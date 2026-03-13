package com.mx.curso.unidad_1;

public class Checkpoint1 {
    public static void main(String[] args) {

        // Crear 3 drones
        Drone drone1 = new Drone("Drone 1", 100);
        Drone drone2 = new Drone("Drone 2", 100);
        Drone drone3 = new Drone("Drone 3", 100);

        // Usar batería solo en el drone1
        drone1.usarBateria(40);

        // Mostrar estado de los drones
        drone1.mostrarEstado();
        drone2.mostrarEstado();
        drone3.mostrarEstado();

    }
}
