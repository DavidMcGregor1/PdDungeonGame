package com.example.demo.Combat;

import com.example.demo.Monster.Monster;
import com.example.demo.Player.Player;

public class CombatService {
    public void combatLoop(Player player, Monster monster) {
        System.out.println("Combat loop started!");
//
//        while (player.getHealth() > 0 && monster.getHealth() > 0) {
//            player.attack(player, monster);
//
//            // Check if the monster is defeated after the player's attack
//            if (monster.getHealth() <= 0) {
//                System.out.println(monster.getName() + " is defeated!");
//                break;
//            }
//
//            monster.attack(player, monster);
//
//            // Check if the player is defeated after the monster's attack
//            if (player.getHealth() <= 0) {
//                System.out.println(player.getName() + " is defeated!");
//                break;
//            }
//        }

        System.out.println("Combat loop ended");
    }

}
