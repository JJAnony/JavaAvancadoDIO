package br.com.curso.javaavancadodio.interfaceFunctional;

import br.com.curso.javaavancadodio.util.Utils;

import java.util.function.Function;

/**
 * Interface Funcional
 */
public class Functions {

    /**
     * Utilizando Funções
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Funções"));
        Function<String, String> reveseString = text -> new StringBuilder(text).reverse().toString();
        System.out.println(reveseString.apply("amazon"));
        Function<String, Integer> transformMultiply = value -> Integer.valueOf(value) * 2;
        System.out.println(transformMultiply.apply("20"));
    }
}
