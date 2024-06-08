package com.example.demo;

import com.example.demo.Game.GameService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.logging.log4j2.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdDungeonGameApplication {

	private final static Logger LOGGER = LogManager.getLogger(PdDungeonGameApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PdDungeonGameApplication.class, args);
//		GameService gameService = new GameService();
//		gameService.startGame();
		System.out.println("working");
		LOGGER.info("here");
		LOGGER.debug("debug");
	}

}
