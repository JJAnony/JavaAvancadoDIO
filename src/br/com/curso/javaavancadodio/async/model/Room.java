package br.com.curso.javaavancadodio.async.model;

import br.com.curso.javaavancadodio.async.interfaces.ActivityCallable;
import br.com.curso.javaavancadodio.async.interfaces.ActivityExecutor;

import java.util.List;

public abstract class Room {

    abstract List<ActivityExecutor> getActivitiesExecutor();

    abstract List<ActivityCallable> getActivitiesCallable();

    protected void cleanRoomExecutor() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Limpar quarto");
    }

    protected String cleanRoomCallable() throws InterruptedException {
        Thread.sleep(10000);
        return "Limpar quarto";
    }

}
