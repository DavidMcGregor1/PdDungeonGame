package com.example.demo.Loot;

public class FoodLoot extends Loot {
    public FoodLoot(String name, Rarity rarity) {
        super(name, rarity);
    }

    @Override
    public String getLootType() {
        return "Food";
    }
}
