package br.com.curso.javaavancadodio.async.interfaces;

@FunctionalInterface
public interface ActivityExecutor {
    void realize() throws InterruptedException;
}
