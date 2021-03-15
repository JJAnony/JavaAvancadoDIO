package br.com.curso.javaavancadodio.functionalParadigm;

import br.com.curso.javaavancadodio.util.Utils;

/**
 * Paradigima funcional
 */
public class RecursiveFactorial {

    /**
     * Utilizando Recursividade
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Fatorial Recursivo"));
        System.out.println(factorial(5));
    }

    /**
     * Calculo Fatorial
     *
     * @param value
     * @return factorial
     */
    private static int factorial(int value) {
        if (value == 1) {
            return value;
        } else {
            return value * factorial(value - 1);
        }
    }
}
