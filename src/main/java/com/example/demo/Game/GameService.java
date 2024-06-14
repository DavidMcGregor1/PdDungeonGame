package com.example.demo.Game;

import com.example.demo.AppUtilities.LogService;
import com.example.demo.Combat.CombatService;
import com.example.demo.Loot.Loot;
import com.example.demo.Loot.LootService;
import com.example.demo.Monster.MonsterService;
import com.example.demo.Room.RoomService;
import com.example.demo.Monster.Monster;
import com.example.demo.Player.Player;
import com.example.demo.Room.Room;
import com.example.demo.AppUtilities.Utils;
import com.example.demo.Weapon.WeaponService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameService {

    RoomService roomService = new RoomService();
    CombatService combatService = new CombatService();
    LootService lootService = new LootService();
    LogService logService = new LogService();
    GameSetup gameSetup = new GameSetup();
    private Scanner scanner;
    Random random;
    public Room currentRoom;

    boolean gameRunning;
    Player player;

    public void startGame() {
        gameRunning = true;
        player = gameSetup.initialisePlayer();
        currentRoom = gameSetup.initialiseCurrentRoom();
        askForDirection();

        while (gameRunning && player.getHealth() > 0) {
            displayMainInfo(player);
            System.out.println("ere");
        }
    }

    public void displayMainInfo(Player player) {
        System.out.println("---------------------------------");
        System.out.println(" ");
        System.out.println("You are currently in " + currentRoom.getName());
        System.out.println("Current health: " + player.getHealth() + " HP");
        System.out.println("Current level: " + player.getLevel());
        System.out.println("Current weapon: " + player.getWeapon().getName() + " (" + player.getWeapon().getDamage() + " damage)");
        System.out.println(" ");
        System.out.println("---------------------------------");
    }

    public void askForDirection() {
        System.out.println("Choose a direction (N, E, S, W):");
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("exit")) {
            gameRunning = false;
            System.out.println("Game over!");
        } else {
            movePlayer(input);
        }
    }

//     + ". Choose a direction (N, E, S, W):"

    public Monster shouldSpawnMonster(int playerLevel) {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber == 1) {
            return MonsterService.generateRandomMonster(playerLevel);
        } else {
            return null;
        }
        // uncomment for testing
//        return null;
    }


    public void movePlayer(String direction) {
        Room nextRoom = currentRoom.getNeighbour(direction);

        if (nextRoom != null) {
            currentRoom = nextRoom;
            System.out.println("You have moved to " + currentRoom.getName() + ".");

            Monster currentMonster = shouldSpawnMonster(player.getLevel());
            if (currentMonster != null) {
                System.out.println("Monster: " + currentMonster.getName() + " has appeared!");
                Utils.sleep(3000);
                combatService.combatLoop(player, currentMonster); // Assuming gameSetup.getPlayer() returns the current player
                System.out.println("Fight has ended... moving on");
                lootService.generateLoot(currentMonster);
            } else {
                System.out.println("No monster has appeared.");
            }

        } else {
            System.out.println("You cannot move in that direction.");
        }

        askForDirection();
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();  // Assuming Room has a getDescription() method
    }

}
