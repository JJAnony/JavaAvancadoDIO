package br.com.curso.javaavancadodio.javaEleven;

import java.util.stream.Collectors;

/**
 * Java 11
 */
public class StringLines {

    /**
     * Utilizando Lines
     * @param args
     */
    public static void main(String[] args) {
        String html = "<html>\n<head>\n</head>\n <body>\n </body>\n</html>";
        System.out.println(html.lines().filter(s -> s.contains("head")).collect(Collectors.joining()));
        System.out.println(html.lines().map(s -> "TAG :: " + s.trim()).collect(Collectors.toList()));
    }
}
