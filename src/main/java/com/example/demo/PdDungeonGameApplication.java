package com.example.demo;

import com.example.demo.Game.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdDungeonGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdDungeonGameApplication.class, args);
//		GameService gameService = new GameService();
//		gameService.startGame();
		System.out.println("working");
	}

}
