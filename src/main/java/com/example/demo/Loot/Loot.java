package com.example.demo.Loot;

public class Loot {
    String name;
    Rarity rarity;

    public Loot(String name, Rarity rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }


}
