package br.com.curso.javaavancadodio.async;

import br.com.curso.javaavancadodio.async.model.Bedroom;
import br.com.curso.javaavancadodio.async.model.House;
import br.com.curso.javaavancadodio.util.Utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Processamento Assincrono
 */
public class TaskExecutor {

    private static final ExecutorService SERVICE = Executors.newFixedThreadPool(4);

    /**
     * Utilizando Executores
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Utils.separator("Executor"));
        House house = new House(new Bedroom(), new Bedroom());
        house.getActivitiesHouseExecutor().forEach(activity -> SERVICE.execute(() -> {
            try {
                activity.realize();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        SERVICE.shutdown();
    }
}
