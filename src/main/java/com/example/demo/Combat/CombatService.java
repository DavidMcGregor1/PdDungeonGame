package com.example.demo.Combat;

import com.example.demo.Monster.Monster;
import com.example.demo.Player.Player;

public class CombatService {
    public void combatLoop(Player player, Monster monster) {
        System.out.println("Combat loop started!");

        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            player.attack(player, monster);
            monster.attack(player, monster);
        }

    }
}
