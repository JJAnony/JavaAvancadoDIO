package br.com.curso.javaavancadodio.functionalParadigm;

import br.com.curso.javaavancadodio.util.Utils;

import java.util.function.BiPredicate;

/**
 * Paradigima funcional
 */
public class PureFunction {

    /**
     * Funções Puras
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Funções Puras"));
        BiPredicate<Integer, Integer> verify = (params, value) -> params > value;
        System.out.println("Result verify 13 > 12 = " + verify.test(13, 12));
        System.out.println("Result verify 11 > 12 = " + verify.test(11, 12));
    }
}
