package com.example.demo.Game;

import com.example.demo.AppUtilities.LogService;
import com.example.demo.Loot.Loot;
import com.example.demo.Player.Player;
import com.example.demo.Weapon.WeaponService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameSetup {

    LogService logService = new LogService();
    WeaponService weaponService = new WeaponService();

    private Scanner scanner;


    public Player initialisePlayer() {
        System.out.println("Welcome to the dungeon! What should we call you?");
        scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        List<Loot> inventory = new ArrayList<>();
        Player player = new Player(playerName, 100, 1, weaponService.generateRandomWeapon(), inventory);
        logService.logInfo("New player created with: " + player.getName() + ", " + player.getWeapon());
        return player;
    }
}
