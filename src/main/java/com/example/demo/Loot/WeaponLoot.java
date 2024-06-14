package com.example.demo.Loot;

public class WeaponLoot extends Loot {
    public WeaponLoot(String name, Rarity rarity) {
        super(name, rarity);
    }

    @Override
    public String getLootType() {
        return "Weapon";
    }
}
