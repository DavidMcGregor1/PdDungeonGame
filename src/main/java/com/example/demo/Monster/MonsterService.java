package com.example.demo.Monster;

import java.util.Random;

public class MonsterService {
    public static Monster generateRandomMonster(int playerLevel) {
        int monsterLevel = generateRandomLevel(playerLevel);

        Monster skeleton = new Monster("Skeleton", 50, monsterLevel, 10);
        Monster zombie = new Monster("Zombie", 40, monsterLevel, 10);
        Monster ork = new Monster("Ork", 60, monsterLevel, 10);
        Monster witch = new Monster("Witch", 30, monsterLevel, 10);

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
