package com.example.demo.Player;

import com.example.demo.Loot.Loot;
import com.example.demo.Monster.Monster;
import com.example.demo.Weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    int health;
    int level;
    Weapon weapon;
    List<Loot> inventory = new ArrayList<>();

    public Player(String name, int health, int level, Weapon weapon, List<Loot> inventory) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.weapon = weapon;
        this.inventory = inventory;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(List<Loot> inventory) {
        this.inventory = inventory;
    }

    public List<Loot> getInventory() {
        return inventory;
    }

    public void attack(Player player, Monster monster) {
        System.out.println(player.getName() + " attacks " + monster.getName() + " with " + player.weapon.getName() + " for " + player.weapon.getDamage() + " damage!");
        monster.setHealth(monster.getHealth() - player.weapon.getDamage() -2);
        System.out.println(monster.getName() + " has " + monster.getHealth() + " health left!");
    }


}
