package br.com.curso.javaavancadodio.async;

import br.com.curso.javaavancadodio.async.runnables.LoadRunnable;
import br.com.curso.javaavancadodio.async.threads.GeneratePDF;
import br.com.curso.javaavancadodio.util.Utils;

/**
 * Processamento Assincrono
 */
public class Threads {

    public static void main(String[] args) {
        System.out.println(Utils.separator("Threads"));
        Thread generatePDF = new GeneratePDF();
        Thread load = new Thread(new LoadRunnable(generatePDF));

        generatePDF.start();
        load.start();
    }


}
