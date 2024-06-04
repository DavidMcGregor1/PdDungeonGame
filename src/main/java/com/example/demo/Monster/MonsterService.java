package com.example.demo.Monster;

import java.util.Random;

public class MonsterService {
    public static Monster generateRandomMonster() {
        Monster skeleton = new Monster("Skeleton", 100, 1, 10);
        Monster zombie = new Monster("Zombie", 200, 2, 20);
        Monster ork = new Monster("Ork", 300, 3, 30);
        Monster witch = new Monster("Witch", 400, 4, 40);

        Monster[] monsters = {skeleton, zombie, ork, witch};
        Random random = new Random();
        int randomNumber = random.nextInt(monsters.length);
        return monsters[randomNumber];
    }
}
