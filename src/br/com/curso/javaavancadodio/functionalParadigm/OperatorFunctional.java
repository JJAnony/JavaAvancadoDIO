package br.com.curso.javaavancadodio.functionalParadigm;

import br.com.curso.javaavancadodio.util.Utils;

import java.util.function.UnaryOperator;

/**
 * Paradigima funcional
 */
public class OperatorFunctional {

    /**
     * Utilizando UnaryOperator
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Operação Funcional"));
        UnaryOperator<Integer> calculate = value -> value * 3;
        int value = 10;
        System.out.println("Value: " + value);
        System.out.println("Result: " + calculate.apply(value));
    }

}
