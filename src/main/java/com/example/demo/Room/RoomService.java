package com.example.demo.Room;

public class RoomService {


//                       THE LAYER   - THE PIT
//	                		|
//    THE IRON CHAMBERS - THE DUNGEON - THE LOBBY - THE GARDENS
//	        |
//    THE CAVE

    public Room createRooms() {
        Room theCave = new Room("The Cave", "You are in a dark cave.");
        Room theIronChambers = new Room("The Iron Chambers", "You are in a room with iron walls.");
        Room theDungeon = new Room("The Dungeon", "You are in a dark dungeon.");
        Room theLayer = new Room("The Layer", "You are in a layer.");
        Room thePit = new Room("The Pit", "You are in a pit.");
        Room theLobby = new Room("The Lobby", "You are in a lobby.");
        Room theGardens = new Room("The Gardens", "You are in a garden.");


        theCave.addNeighbour("N", theIronChambers);

        theIronChambers.addNeighbour("S", theCave);
        theIronChambers.addNeighbour("E", theDungeon);

        theDungeon.addNeighbour("W", theIronChambers);
        theDungeon.addNeighbour("N", theLayer);
        theDungeon.addNeighbour("E", theLobby);

        theLayer.addNeighbour("S", theDungeon);
        theLayer.addNeighbour("E", thePit);

        thePit.addNeighbour("W", theLayer);

        theLobby.addNeighbour("W", theDungeon);
        theLobby.addNeighbour("E", theGardens);

        theGardens.addNeighbour("W", theLobby);

        Room currentRoom = theCave;
        return currentRoom;

    }

}