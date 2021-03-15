package br.com.curso.javaavancadodio.functionalParadigm;

import br.com.curso.javaavancadodio.util.Utils;

/**
 * Paradigima funcional
 */
public class TailCallFactorial {

    /**
     * Utilizando Chamada de Cauda
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Fatorial Chamada de cauda"));
        System.out.println(factorial(5));
    }

    /**
     * Facilitador de Chamada de Função
     *
     * @param value
     * @return factorial
     */
    private static double factorial(double value) {
        return factorial(value, 1);
    }

    /**
     * Calculo Fatorial de Chamada de Cauda
     *
     * @param value
     * @param number
     * @return factorial
     */
    private static double factorial(double value, double number) {
        if (value == 0) {
            return number;
        }
        return factorial(value - 1, number * value);
    }
}
