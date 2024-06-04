package com.example.demo.Game;

import com.example.demo.Monster.MonsterService;
import com.example.demo.Room.RoomService;
import com.example.demo.Monster.Monster;
import com.example.demo.Player.Player;
import com.example.demo.Room.Room;

import java.util.Random;
import java.util.Scanner;

public class GameService {

    RoomService roomService = new RoomService();
    private Scanner scanner;
    Random random;
    Room currentRoom;

    public void startGame() {

        System.out.println("Game started!");

        Player player = new Player("Player 1", 100, 1, null);


        currentRoom = roomService.createRooms();
        boolean gameRunning = true;
        scanner = new Scanner(System.in);

        while (gameRunning) {
            System.out.println("You are currently in " + currentRoom.getName() + ". Choose a direction (N, E, S, W):");
            spawnMonsterOrNo();
            scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                gameRunning = false;
                System.out.println("Game over!");
                break;
            } else {
                movePlayer(input);
            }
        }

    }

    public Monster spawnMonsterOrNo() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber == 1) {
            System.out.println("A monster has appeared!");
            return MonsterService.generateRandomMonster();
        } else {
            return null;
        }
    }


    public void movePlayer(String direction) {
        Room nextRoom = currentRoom.getNeighbour(direction);

        if (nextRoom != null) {
            currentRoom = nextRoom;
            System.out.println("You have moved to " + currentRoom.getName() + ".");
        } else {
            System.out.println("You cannot move in that direction.");
        }
    }

    // Add necessary methods to get current room description and health
    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();  // Assuming Room has a getDescription() method
    }

}
