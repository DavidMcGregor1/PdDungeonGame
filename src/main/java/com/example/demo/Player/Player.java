package com.example.demo.Player;

import com.example.demo.Loot.Loot;
import com.example.demo.Monster.Monster;
import com.example.demo.AppUtilities.Utils;
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
        try {
            System.out.println(player.getName() + " attacks " + monster.getName() + " with " + player.getWeapon().getName() + " for " + player.getWeapon().getDamage() + " damage!");
            Utils.sleep(3000);
            System.out.println("---------------------------------");
            System.out.println(" ");

            monster.setHealth(monster.getHealth() - player.getWeapon().getDamage());

            if (monster.getHealth() < 0) {
                monster.setHealth(0);
            }

            System.out.println(monster.getName() + " has " + monster.getHealth() + " health left!");
            Thread.sleep(3000);  // Pause for 3 seconds
            System.out.println("---------------------------------");
            System.out.println(" ");
        } catch (InterruptedException e) {
            System.out.println("Combat was interrupted");
        }
    }



}
