package br.com.curso.javaavancadodio.async.threads;

public class GeneratePDF extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Iniciado!");
            Thread.sleep(10000);
            System.out.println("Gerado!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
