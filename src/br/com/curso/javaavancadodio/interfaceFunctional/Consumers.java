package br.com.curso.javaavancadodio.interfaceFunctional;

import br.com.curso.javaavancadodio.util.Utils;

import java.util.function.Consumer;

/**
 * Interface Funcional
 */
public class Consumers {

    /**
     * Utilizando Consumidores
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Consumidores"));
        Consumer<String> print = System.out::println;
        print.accept("Hello Word");
    }
}
