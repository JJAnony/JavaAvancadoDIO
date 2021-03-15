package br.com.curso.javaavancadodio.functionalParadigm;

import br.com.curso.javaavancadodio.functionalParadigm.interfaces.Function;
import br.com.curso.javaavancadodio.util.Utils;

/**
 * Paradigima funcional
 */
public class InterfaceFunctional {

    /**
     * Utilizando Interface Funcional
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Interface Funcional"));
        Function function = value -> String.valueOf(value);
        System.out.println(function.parse(10));
    }
}
