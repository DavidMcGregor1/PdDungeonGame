package com.example.demo.Monster;

import java.util.Random;

public class MonsterService {
    public static Monster generateRandomMonster() {
        Monster skeleton = new Monster("Skeleton", 50, 1, 10);
        Monster zombie = new Monster("Zombie", 40, 2, 10);
        Monster ork = new Monster("Ork", 60, 3, 10);
        Monster witch = new Monster("Witch", 30, 4, 10);

        Monster[] monsters = {skeleton, zombie, ork, witch};
        Random random = new Random();
        int randomNumber = random.nextInt(monsters.length);
        return monsters[randomNumber];
    }
}
