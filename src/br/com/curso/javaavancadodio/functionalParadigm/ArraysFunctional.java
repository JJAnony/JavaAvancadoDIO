package br.com.curso.javaavancadodio.functionalParadigm;

import br.com.curso.javaavancadodio.util.Utils;

import java.util.Arrays;

/**
 * Paradigima funcional
 */
public class ArraysFunctional {

    /**
     * Utilizando Arrays
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Operação com Arrays"));
        int[] value = {1, 2, 3, 4};
        Arrays.stream(value)
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .forEach(number -> System.out.println(number));
    }
}
