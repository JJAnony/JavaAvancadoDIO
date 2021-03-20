package br.com.curso.javaavancadodio.async.interfaces;

import java.util.concurrent.Future;

@FunctionalInterface
public interface ActivityCallable {
    String realize() throws InterruptedException;
}
