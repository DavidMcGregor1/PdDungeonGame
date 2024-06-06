package com.example.demo.TestSetup;

import com.example.demo.Player.Player;
import com.example.demo.Weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

import static com.example.demo.Weapon.WeaponRarity.COMMON;

public class PlayerSetup {
    public Player createMockPlayer() {
        Weapon knife = new Weapon("Knife", 10, COMMON);
        List inventory = new ArrayList();
        Player player = new Player("Test Player", 100, 1, knife, inventory);
        return player;
    }
}
