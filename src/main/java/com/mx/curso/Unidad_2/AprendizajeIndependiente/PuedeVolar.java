package com.mx.curso.Unidad_2.AprendizajeIndependiente;

public class PuedeVolar {

    interface PuedeVolar {
        void volar();
    }

    class Avion implements PuedeVolar {
        public void volar() {
            System.out.println("El avión enciende sus motores y despega");
        }
    }

    class Pajaro implements PuedeVolar {
        public void volar() {
            System.out.println("El pájaro bate sus alas y vuela");
        }
    }

    class Main {
        public static void main(String[] args) {
            PuedeVolar[] objetos = new PuedeVolar[2];
            objetos[0] = new Avion();
            objetos[1] = new Pajaro();

            for (PuedeVolar obj : objetos) {
                obj.volar();
            }
        }
    }
}

