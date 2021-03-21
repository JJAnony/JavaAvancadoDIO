package br.com.curso.javaavancadodio.javaEleven;

import java.util.function.Function;

/**
 * Java 11
 */
public class InferenceLambda {

    /**
     * Utilizando Inferencia na lambda
     * @param args
     */
    public static void main(String[] args) {
        Function<Integer, Double> division = (var number) -> number / 2.0;
        System.out.println(division.apply(500));
    }
}
