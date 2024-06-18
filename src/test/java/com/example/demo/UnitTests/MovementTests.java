//package com.example.demo.UnitTests;
//
//import com.example.demo.Room.Room;
//import com.example.demo.Room.RoomService;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class MovementTests {
//
//    @Test
//    void testCreateRooms() {
//        RoomService roomService = new RoomService();
//        Room currentRoom = roomService.createRooms();
//
//        // Test initial room
//        assertEquals("The Cave", currentRoom.getName());
//
//        // Test navigation to Iron Chambers
//        Room nextRoom = currentRoom.getNeighbour("N");
//        assertNotNull(nextRoom);
//        assertEquals("The Iron Chambers", nextRoom.getName());
//
//        // Test navigation to Dungeon
//        nextRoom = nextRoom.getNeighbour("E");
//        assertNotNull(nextRoom);
//        assertEquals("The Dungeon", nextRoom.getName());
//
//        // Test navigation to Layer
//        nextRoom = nextRoom.getNeighbour("N");
//        assertNotNull(nextRoom);
//        assertEquals("The Layer", nextRoom.getName());
//
//        // Test navigation to Pit
//        nextRoom = nextRoom.getNeighbour("E");
//        assertNotNull(nextRoom);
//        assertEquals("The Pit", nextRoom.getName());
//    }
//}
