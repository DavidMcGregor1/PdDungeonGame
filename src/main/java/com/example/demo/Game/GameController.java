package com.example.demo.Game;

import com.example.demo.Game.GameService;
import com.example.demo.Player.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GameController {

    private GameService gameService = new GameService();

    @GetMapping("/game")
    public Map<String, String> game() {
        // Return the initial room description
        Map<String, String> response = new HashMap<>();
        response.put("description", gameService.getCurrentRoomDescription());
        return response;
    }
}
