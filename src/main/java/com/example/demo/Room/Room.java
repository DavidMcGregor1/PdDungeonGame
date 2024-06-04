package com.example.demo.Room;

import java.util.HashMap;

public class Room {
    public String name;
    public HashMap<String, Object> neighbours;

    public String description;

    public Room(String name, String description) {
        this.name = name;
        this.neighbours = new HashMap<>();
        this.description = description;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
