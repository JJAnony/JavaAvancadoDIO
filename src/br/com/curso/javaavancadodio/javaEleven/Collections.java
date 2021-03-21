package br.com.curso.javaavancadodio.javaEleven;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Java 11
 */
public class Collections {

    /**
     * Utilizando Collections
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> names = List.of("José", "Carlos", "João", "Silvio");
        System.out.println(names);

        names = Set.of("José", "Carlos", "João", "Silvio", "Aline");
        System.out.println(names);
    }
}
