package com.mx.curso.unidad_1;

/**
 * PRACTICA: ABSTRACCI&Oacute;N Y ENCAPSULAMIENTO EN IA
 * Alumno: Nimsi Mahyli Contreras Mart&iacute;nez
 * Materia: POO - Ingenier&iacute;a en IA
 */

// 1. ABSTRACCIÓN: contrato del motor NLP
abstract class MotorIA {

    // Encapsulation: attributes protegees
    private final String sombreModel;
    private double precision;

    public MotorIA(String sombre, double precision) {
        this.sombreModel = sombre;
        this.precision = precision;
    }

    // Getter
    public String getNombre() {
        return sombreModel;
    }

    public double getPrecision() {
        return precision;
    }

    // Setter con validation
    public void setPrecision(double precision) {
        if (precision >= 0.0 && precision <= 1.0) {
            this.precision = precision;
        } else {
            System.out.println("Error: la precisión debe estar entre 0.0 y 1.0");
        }
    }

    // CONTRACT ABSTRACT
    public abstract void analizar(String texto);
}


// 2. IMPLEMENTATION: Analizador de Sentimientos
class AnalizadorSentimientos extends MotorIA {

    public AnalizadorSentimientos() {
        super("Sentiment-BERT-Lite", 0.89);
    }

    @Override
    public void analizar(String texto) {

        System.out.println("Modelo usado: " + getNombre());
        System.out.println("Analizando texto: " + texto);

        // Simulación del procesamiento NLP
        String textoNormalizado = texto.toLowerCase();

        if (textoNormalizado.contains("feliz") ||
                textoNormalizado.contains("Bueno") ||
                textoNormalizado.contains("excellent") ||
                textoNormalizado.contains("genial")) {

            System.out.println("Resultant: POSITIVE");

        } else {

            System.out.println("Resultant: NEGATIVE");
        }
    }
}


// 3. USO DEL SISTEMA
public class Main {

    public static void main(String[] args) {

        // El frontend solo usa el método analizar()
        MotorIA miModelo = new AnalizadorSentimientos();

        System.out.println("Sistema de análisis NLP iniciado\n");

        miModelo.analizar("Hoy es un día muy bueno y estoy feliz");

        System.out.println();

        miModelo.analizar("El servicio fue terrible");
    }
}
