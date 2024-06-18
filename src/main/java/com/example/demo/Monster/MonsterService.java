package com.example.demo.Monster;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MonsterService {

    private static final Map<Integer, Integer> healthMap = new HashMap<>();
    private static final Map<Integer, Integer> damageMap = new HashMap<>();

    static {
        healthMap.put(1, 10);
        healthMap.put(2, 20);
        healthMap.put(3, 30);
        healthMap.put(4, 40);
        healthMap.put(5, 50);

        damageMap.put(1, 5);
        damageMap.put(2, 8);
        damageMap.put(3, 10);
        damageMap.put(4, 12);
        damageMap.put(5, 14);
    }

    public static Monster generateRandomMonster(int playerLevel) {
        int monsterLevel = generateRandomLevel(playerLevel);

        int health = healthMap.getOrDefault(monsterLevel, 50);
        int damage = damageMap.getOrDefault(monsterLevel, 10);

        Monster skeleton = new Monster("Skeleton", health, monsterLevel, damage);
        Monster zombie = new Monster("Zombie", health, monsterLevel, damage);
        Monster ork = new Monster("Ork", health, monsterLevel, damage);
        Monster witch = new Monster("Witch", health, monsterLevel, damage);

        Monster[] monsters = {skeleton, zombie, ork, witch};
        Random random = new Random();
        int randomNumber = random.nextInt(monsters.length);
        return monsters[randomNumber];
    }

    public static int generateRandomLevel(int playerLevel) {
        Random random = new Random();
        int levelDifference = random.nextInt(5) -2; // This generates a random number between -2 and 2
        int monsterLevel = playerLevel + levelDifference;
        if (monsterLevel < 1) {
            monsterLevel = 1; // Ensure the monster level is at least 1
        }
        return monsterLevel;
    }
}
