package br.com.curso.javaavancadodio.async;

import br.com.curso.javaavancadodio.async.model.Bedroom;
import br.com.curso.javaavancadodio.async.model.House;
import br.com.curso.javaavancadodio.util.Utils;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * Processamento Assincrono
 */
public class TaskCallable {

    private static final ExecutorService SERVICE = Executors.newFixedThreadPool(2);

    /**
     * Utilizando Callable
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Callable"));
        House house = new House(new Bedroom(), new Bedroom());
        List<Future<String>> futures = house.getActivitiesHouseCallable().stream()
                .map(activity -> SERVICE.submit(() -> {
                    try {
                        return activity.realize();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return null;
                })).collect(Collectors.toList());

        while (true) {
            pintTask(futures);
            if (futures.stream().allMatch(Future::isDone)) {
                pintTask(futures);
                break;
            }
        }
        SERVICE.shutdown();
    }

    private static void pintTask(List<Future<String>> futures) {
        System.out.println(Utils.separator("Lista"));
        for (Future<String> future : futures) {
            try {
                if (future.isDone()) {
                    System.out.println(" * Terminou de " + future.get());
                } else {
                    System.out.println(" - Não Terminou de " + future.get());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
