package br.com.curso.javaavancadodio.interfaceFunctional;

import br.com.curso.javaavancadodio.util.Utils;

import java.util.function.Predicate;

/**
 * Interface Funcional
 */
public class Predicates {

    /**
     * Utilizando Predicados
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Predicados"));
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("text"));
    }
}
