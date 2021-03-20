package br.com.curso.javaavancadodio.async;

import br.com.curso.javaavancadodio.util.Utils;

import java.util.stream.IntStream;

public class ParalleFactorial {

    public static void main(String[] args) {
        System.out.println(Utils.separator("Searial"));
        long startTime = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(value -> factorial(value));
        long finalTime = System.currentTimeMillis();
        System.out.println("Tempo :" + (finalTime - startTime));

        System.out.println(Utils.separator("Paralle"));
        startTime = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(value -> factorial(value));
        finalTime = System.currentTimeMillis();
        System.out.println("Tempo :" + (finalTime - startTime));
    }

    public static long factorial(long value) {
        long fat = 1;
        for (long i = 2; i <= value; i++) {
            fat *= i;
        }
        return fat;
    }
}
