package br.com.curso.javaavancadodio.interfaceFunctional;

import br.com.curso.javaavancadodio.interfaceFunctional.interfaces.Calculation;
import br.com.curso.javaavancadodio.util.Utils;

/**
 * Interface Funcional
 */
public class HighOrderFunction {

    /**
     * Utilizando Função de alta ordem
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Função de alta ordem"));
        Calculation sum = (a, b) -> a + b;
        Calculation subtraction = (a, b) -> a - b;
        Calculation multiplication = (a, b) -> a * b;
        Calculation division = (a, b) -> a / b;

        System.out.println(executeOperation(sum, 5, 5));
        System.out.println(executeOperation(subtraction, 5, 5));
        System.out.println(executeOperation(multiplication, 5, 5));
        System.out.println(executeOperation(division, 5, 5));
    }

    /**
     * Metodo de Execução
     *
     * @param calculation
     * @param a
     * @param b
     * @return result
     */
    private static int executeOperation(Calculation calculation, int a, int b) {
        return calculation.calculate(a, b);
    }

}
