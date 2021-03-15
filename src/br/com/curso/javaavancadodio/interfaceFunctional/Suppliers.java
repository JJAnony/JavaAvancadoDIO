package br.com.curso.javaavancadodio.interfaceFunctional;

import br.com.curso.javaavancadodio.interfaceFunctional.model.Person;
import br.com.curso.javaavancadodio.util.Utils;

import java.util.function.Supplier;

/**
 * Interface Funcional
 */
public class Suppliers {

    /**
     * Utilizando Fornecedores
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Fornecedores"));
        Supplier<Person> instance = () -> new Person();
        System.out.println(instance.get());
    }
}
