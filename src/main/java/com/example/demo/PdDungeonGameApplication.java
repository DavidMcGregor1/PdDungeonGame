package com.example.demo;

import com.example.demo.Services.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdDungeonGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdDungeonGameApplication.class, args);
		GameService gameService = new GameService();
		gameService.startGame();
	}

}
