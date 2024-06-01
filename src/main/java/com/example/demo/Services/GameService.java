package com.example.demo.Services;

import com.example.demo.Views.Room;

import java.util.Scanner;

public class GameService {

    RoomService roomService = new RoomService();
    private Scanner scanner;
    Room currentRoom;

    public void startGame() {
        System.out.println("Game started!");

        currentRoom = roomService.createRooms();
        boolean gameRunning = true;
        scanner = new Scanner(System.in);

        while (gameRunning) {
            System.out.println("You are currently in " + currentRoom.getName() + ". Choose a direction (N, E, S, W):");
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

    public void movePlayer(String direction) {
        Room nextRoom = currentRoom.getNeighbour(direction);

        if (nextRoom != null) {
            currentRoom = nextRoom;
            System.out.println("You have moved to " + currentRoom.getName() + ".");
        } else {
            System.out.println("You cannot move in that direction.");
        }
    }

}
