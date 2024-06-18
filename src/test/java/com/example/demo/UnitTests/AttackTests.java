//package com.example.demo.UnitTests;
//
//import com.example.demo.Monster.Monster;
//import com.example.demo.Player.Player;
//import com.example.demo.TestSetup.PlayerSetup;
//import org.junit.jupiter.api.Test;
//
//public class AttackTests {
//    PlayerSetup playerSetup = new PlayerSetup();
//    @Test
//    public void playerCanAttackMonster() {
//        // given
//        Player player = playerSetup.createMockPlayer();
//        Monster monster = new Monster("Test Monster", 100, 2, 10);
//        int monsterHealth = monster.getHealth();
//        int expectedHealth = monsterHealth - player.getWeapon().getDamage();
//
//        // when
//        player.attack(player, monster);
//
//        // then
//        assert(monster.getHealth() == expectedHealth);
//    }
//
//    @Test
//    public void monsterCanAttackPlayer() {
//        // given
//        Player player = playerSetup.createMockPlayer();
//        Monster monster = new Monster("Test Monster", 100, 2, 10);
//        int playerHealth = player.getHealth();
//        int expectedHealth = playerHealth - monster.getDamage();
//
//        // when
//        monster.attack(player, monster);
//
//        // then
//        assert(player.getHealth() == expectedHealth);
//    }
//
//
//}
