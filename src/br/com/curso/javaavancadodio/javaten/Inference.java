package br.com.curso.javaavancadodio.javaten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

/**
 * Java 10
 */
public class Inference {

    public static void main(String[] args) {
        connectAndPrintURLJavaOracle();
    }

    /**
     * Conecta e Printa o conteudo da url do Java 10
     *
     * @throws IOException
     */
    private static void connectAndPrintURLJavaOracle() {
        try {
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var connection = url.openConnection();

            try (var reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                System.out.println(reader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Printa o nome Completo
     *
     * @param name
     * @param surname
     */
    private static void printFullName(String name, String surname) {
        var fullName = String.format("%s %s", name, surname);
        System.out.println(fullName);
    }

    /**
     * Printa a suma de varios numeros
     *
     * @param numbers
     */
    private static void printSum(int... numbers) {
        var sum = 0;
        if (numbers.length > 0) {
            for (var number : numbers) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
