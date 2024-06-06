package com.example.demo.Weapon;

public class Weapon {
    String name;
    int damage;

    WeaponRarity rarity;

    public Weapon(String name, int damage, WeaponRarity rarity) {
        this.name = name;
        this.damage = damage;
        this.rarity = rarity;
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

    public WeaponRarity getRarity() {
        return this.rarity;
    }
}
