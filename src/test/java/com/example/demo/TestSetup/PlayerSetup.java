package com.example.demo.TestSetup;

import com.example.demo.Player.Player;
import com.example.demo.Weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

public class PlayerSetup {
    public Player createMockPlayer() {
        Weapon knife = new Weapon("Knife", 10);
        List inventory = new ArrayList();
        Player player = new Player("Test Player", 100, 1, knife, inventory);
        return player;
    }
}
