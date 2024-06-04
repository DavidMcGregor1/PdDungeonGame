package com.example.demo.Controllers;

import com.example.demo.Services.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GameController {

    private GameService gameService;


    @GetMapping("/game")
    public Map<String, String> game() {
        // Return the initial room description
        Map<String, String> response = new HashMap<>();
        response.put("description", gameService.getCurrentRoomDescription());
        return response;
    }

    @PostMapping("/move")
    public Map<String, Object> move(@RequestBody Map<String, String> request) {
        String direction = request.get("direction");
        gameService.movePlayer(direction);

        // Return the updated room description and health status
        Map<String, Object> response = new HashMap<>();
        response.put("description", gameService.getCurrentRoomDescription());
        response.put("health", gameService.getCurrentHealth());  // Assuming you have a method to get current health
        return response;
    }

}
