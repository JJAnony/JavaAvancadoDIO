package br.com.curso.javaavancadodio.async.model;

import br.com.curso.javaavancadodio.async.interfaces.ActivityCallable;
import br.com.curso.javaavancadodio.async.interfaces.ActivityExecutor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class House {

    private List<Room> rooms;

    public House(Room... rooms) {
        this.rooms = Arrays.asList(rooms);
    }

    public List<ActivityCallable> getActivitiesHouseCallable() {
        return this.rooms.stream().map(Room::getActivitiesCallable)
                .reduce(new ArrayList<ActivityCallable>(), (list, activities) -> {
                    list.addAll(activities);
                    return list;
                });
    }

    public List<ActivityExecutor> getActivitiesHouseExecutor() {
        return this.rooms.stream().map(Room::getActivitiesExecutor)
                .reduce(new ArrayList<ActivityExecutor>(), (list, activities) -> {
                    list.addAll(activities);
                    return list;
                });
    }

}
