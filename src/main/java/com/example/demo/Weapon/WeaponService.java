package com.example.demo.Weapon;

import java.util.Random;

public class WeaponService {
    public Weapon generateRandomWeapon() {
        Weapon sword = new Weapon("Sword", 10, WeaponRarity.COMMON);
        Weapon axe = new Weapon("Axe", 11, WeaponRarity.COMMON);
        Weapon bowAndArrow = new Weapon("Bow and arrow", 12, WeaponRarity.RARE);
        Weapon staff = new Weapon("Staff", 12, WeaponRarity.EPIC);
        Weapon knife = new Weapon("Knife", 5, WeaponRarity.COMMON);

        Weapon[] weapons = {sword, axe, bowAndArrow, staff, knife};
        Random random = new Random();
        int randomNumber = random.nextInt(weapons.length);
        return weapons[randomNumber];
    }
}
