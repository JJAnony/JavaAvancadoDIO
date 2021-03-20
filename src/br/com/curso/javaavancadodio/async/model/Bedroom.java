package br.com.curso.javaavancadodio.async.model;

import br.com.curso.javaavancadodio.async.interfaces.ActivityCallable;
import br.com.curso.javaavancadodio.async.interfaces.ActivityExecutor;

import java.util.Arrays;
import java.util.List;

public class Bedroom extends Room {

    @Override
    List<ActivityExecutor> getActivitiesExecutor() {
        return Arrays.asList(
                this::straightenBedExecutor,
                this::cleanRoomExecutor,
                this::straightenClosetExecutor
        );
    }

    @Override
    public List<ActivityCallable> getActivitiesCallable() {
        return Arrays.asList(
                this::straightenBedCallable,
                this::cleanRoomCallable,
                this::straightenClosetCallable
        );
    }

    private void straightenClosetExecutor() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Arrumar guarda roupa");;
    }

    private void straightenBedExecutor() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Arrumar cama");;
    }

    private String straightenClosetCallable() throws InterruptedException {
        Thread.sleep(5000);
        return "Arrumar guarda roupa";
    }

    private String straightenBedCallable() throws InterruptedException {
        Thread.sleep(1000);
        return "Arrumar cama";
    }

}
