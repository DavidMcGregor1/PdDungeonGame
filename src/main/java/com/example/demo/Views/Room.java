package com.example.demo.Views;

import java.util.HashMap;

public class Room {
    public String name;
    public HashMap<String, Object> neighbours;

    public Room(String name) {
        this.name = name;
        this.neighbours = new HashMap<>();
    }

    public void addNeighbour(String direction, Room room) {
        this.neighbours.put(direction.toUpperCase(), room);
    }

    public Room getNeighbour(String direction) {
        return (Room) this.neighbours.get(direction.toUpperCase());
    }

    public String getName() {
        return this.name;
    }

    public HashMap<String, Object> getNeighbours() {
        return this.neighbours;
    }
}
