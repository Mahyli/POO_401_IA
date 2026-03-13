package com.mx.curso.unidad_1;

public class AgenteIA {
    int energia = 100;

    public void moverse() {
        System.out.println("El agente se mueve.");
    }
}

class DronExplorador extends AgenteIA {

    @Override
    public void moverse() {
        System.out.println("El dron se mueve en coordenadas 3D.");
    }
}

class RobotTerrestre extends AgenteIA {

    @Override
    public void moverse() {
        System.out.println("El robot se mueve en un plano 2D.");
    }
}

public class Main {
    public static void main(String[] args) {

        DronExplorador dron = new DronExplorador();
        dron.moverse();

        RobotTerrestre robot = new RobotTerrestre();
        robot.moverse();
    }
}
