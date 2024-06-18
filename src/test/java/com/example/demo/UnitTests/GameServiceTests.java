//package com.example.demo.UnitTests;
//
//import com.example.demo.Game.GameService;
//import com.example.demo.Room.RoomService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class GameServiceTests {
//
//        private GameService gameService;
//
//        @BeforeEach
//        void setUp() {
//            gameService = new GameService();
//            RoomService roomService = new RoomService();
//            gameService.currentRoom = roomService.createRooms();  // Set the initial room
//        }
//
//        @Test
//        void testMovePlayerNorth() {
//            gameService.movePlayer("N");
//            assertEquals("The Iron Chambers", gameService.currentRoom.getName());
//        }
//
//        @Test
//        void testMovePlayerEastFromIronChambers() {
//            gameService.movePlayer("N");
//            gameService.movePlayer("E");
//            assertEquals("The Dungeon", gameService.currentRoom.getName());
//        }
//
//        @Test
//        void testMovePlayerInvalidDirection() {
//            gameService.movePlayer("S");
//            assertEquals("The Cave", gameService.currentRoom.getName());
//        }
//
//        @Test
//        void testMovePlayerSequence() {
//            gameService.movePlayer("N");
//            assertEquals("The Iron Chambers", gameService.currentRoom.getName());
//            gameService.movePlayer("E");
//            assertEquals("The Dungeon", gameService.currentRoom.getName());
//            gameService.movePlayer("N");
//            assertEquals("The Layer", gameService.currentRoom.getName());
//            gameService.movePlayer("E");
//            assertEquals("The Pit", gameService.currentRoom.getName());
//        }
//    }
//
