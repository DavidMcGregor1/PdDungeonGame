package com.example.demo.UnitTests;

import com.example.demo.Monster.Monster;
import com.example.demo.Player.Player;
import com.example.demo.TestSetup.PlayerSetup;
import org.junit.jupiter.api.Test;

public class AttackTests {
    PlayerSetup playerSetup = new PlayerSetup();
    @Test
    public void playerCanAttackMonster() {}
    Player player = playerSetup.createMockPlayer();
    Monster monster = new Monster("Test Monster", 100, 2, 10);

}
