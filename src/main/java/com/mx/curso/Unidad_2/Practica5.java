package com.mx.curso.Unidad_2;
import java.util.*;
public class Practica5 {

    // Clase abstracta
    abstract class ProcesadorNLP {

        protected String textoCrudo;

        public void cargarTexto(String texto) {
            this.textoCrudo = texto;
        }

        public abstract List<String> tokenizar();

        public abstract void limpiarTexto();

        public abstract Object transformarParaModelo();
    }

    // Implementación simple
    static class ProcesadorSimple extends ProcesadorNLP {

        private List<String> tokens = new ArrayList<>();

        @Override
        public List<String> tokenizar() {
            tokens.clear();
            String[] partes = textoCrudo.split(" ");
            for (String palabra : partes) {
                tokens.add(palabra);
            }
            return tokens;
        }

        @Override
        public void limpiarTexto() {
            textoCrudo = textoCrudo.toLowerCase();
            textoCrudo = textoCrudo.replace(".", "");
            textoCrudo = textoCrudo.replace(",", "");
        }

        @Override
        public Object transformarParaModelo() {
            return tokens.size();
        }
    }

    // Implementación análisis de sentimiento
    static class ProcesadorAnalisisSentimiento extends ProcesadorNLP {

        private List<String> tokens = new ArrayList<>();

        @Override
        public List<String> tokenizar() {
            tokens.clear();
            String[] partes = textoCrudo.split(" ");
            for (String palabra : partes) {
                tokens.add(palabra);
            }
            return tokens;
        }

        @Override
        public void limpiarTexto() {

            List<String> stopWords = Arrays.asList(
                    "el", "la", "los", "las", "un", "una", "y", "de", "es"
            );

            List<String> filtradas = new ArrayList<>();

            for (String palabra : tokens) {

                palabra = palabra.toLowerCase();
                palabra = palabra.replace(".", "").replace(",", "");

                if (!stopWords.contains(palabra)) {
                    filtradas.add(palabra);
                }
            }

            tokens = filtradas;
        }

        @Override
        public Object transformarParaModelo() {

            Map<String, Integer> frecuencia = new HashMap<>();

            List<String> positivas = Arrays.asList(
                    "bueno", "excelente", "feliz", "genial", "increible"
            );

            for (String palabra : tokens) {
                if (positivas.contains(palabra)) {
                    frecuencia.put(palabra,
                            frecuencia.getOrDefault(palabra, 0) + 1);
                }
            }

            return frecuencia;
        }
    }

    // Clase principal
    public class Main {

        public static void main(String[] args) {

            String texto = "El producto es excelente, muy bueno y genial.";

            List<ProcesadorNLP> procesadores = new ArrayList<>();

            procesadores.add(new ProcesadorSimple());
            procesadores.add(new ProcesadorAnalisisSentimiento());

            for (ProcesadorNLP p : procesadores) {

                System.out.println("----- " + p.getClass().getSimpleName() + " -----");

                p.cargarTexto(texto);

                p.limpiarTexto();
                p.tokenizar();

                Object resultado = p.transformarParaModelo();

                System.out.println("Resultado: " + resultado);
                System.out.println();
            }
        }
    }
}
