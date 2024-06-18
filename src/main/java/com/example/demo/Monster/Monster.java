package com.example.demo.Monster;

import com.example.demo.Player.Player;

public class Monster {
    String name;
    int health;
    int level;
    int damage;

    public Monster(String name, int health, int level, int damage) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.damage = damage;
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

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(Player player, Monster monster) {
        try {
            System.out.println(monster.getName() + " attacks " + player.getName() + " for " + monster.getDamage() + " damage!");
            Thread.sleep(3000);  // Pause for 3 seconds
            System.out.println("---------------------------------");
            System.out.println(" ");

            player.setHealth(player.getHealth() - monster.getDamage());

            if (player.getHealth() < 0) {
                player.setHealth(0);
            }

            System.out.println(player.getName() + " has " + player.getHealth() + " health left!");
            Thread.sleep(3000);  // Pause for 3 seconds
            System.out.println("---------------------------------");
            System.out.println(" ");
        } catch (InterruptedException e) {
            System.out.println("Combat was interrupted");
        }
    }




}
