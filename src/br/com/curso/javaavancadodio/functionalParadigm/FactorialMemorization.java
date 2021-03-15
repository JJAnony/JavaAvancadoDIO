package br.com.curso.javaavancadodio.functionalParadigm;

import br.com.curso.javaavancadodio.util.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Paradigima funcional
 */
public class FactorialMemorization {

    static Map<Integer, Integer> CALCULATION_MAP = new HashMap<>();

    /**
     * Utilização da Memorização
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Memorização Fatorial"));
        long startTime = System.nanoTime();
        System.out.println(factorial(15));
        long finalTime = System.nanoTime();
        System.out.println("Fatorial 1 " + (finalTime - startTime));

        startTime = System.nanoTime();
        System.out.println(factorial(15));
        finalTime = System.nanoTime();
        System.out.println("Fatorial 2 " + (finalTime - startTime));
    }

    private static Integer factorial(int value) {
        if (value == 1) {
            return value;
        }

        if (CALCULATION_MAP.containsKey(value)) {
            return CALCULATION_MAP.get(value);
        }

        Integer result = value * factorial(value - 1);
        CALCULATION_MAP.put(value, result);
        return result;
    }
}
