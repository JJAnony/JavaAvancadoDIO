package br.com.curso.javaavancadodio.interfaceFunctional;

import br.com.curso.javaavancadodio.util.Utils;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Interface Funcional
 */
public class Interactions {

    /**
     * Utilizando Interações
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Interações"));
        String[] names = {"José", "Paulo", "Daniel", "Maria", "Java"};
        printAllNames(names);
        printFilterNames(names);

        Integer[] numbers = {1, 2, 3, 4, 5};
        printMultipliedNumbers(numbers);
    }

    /**
     * Printa todos os nomes
     * @param names
     */
    private static void printAllNames(String... names) {
        System.out.println(Utils.separator("Todos os nomes"));
        Stream.of(names).forEach(System.out::println);
    }

    /**
     * Printa os nomes Filtrados
     * @param names
     */
    private static void printFilterNames(String... names) {
        System.out.println(Utils.separator("Filtrando nomes"));
        String result = Stream.of(names)
                .filter(name -> name.length() == 4)
                .collect(Collectors.joining());
        System.out.println(result);
    }

    /**
     * Printa os numeros Multiplicados
     * @param numbers
     */
    private static void printMultipliedNumbers(Integer... numbers) {
        System.out.println(Utils.separator("Multiplicando Numeros"));
        Stream.of(numbers).map(number -> number * 2).forEach(System.out::println);
    }


}
