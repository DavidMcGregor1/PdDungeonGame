package com.example.demo.Views;

public class Player {
    String name;
    int health;
    int level;
    Weapon weapon;

    public Player(String name, int health, int level, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.weapon = weapon;
    }
}
