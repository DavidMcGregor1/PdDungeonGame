package com.example.demo.Services;

import com.example.demo.Views.Room;

public class RoomService {


//                       THE LAYER   - THE PIT
//	                		|
//    THE IRON CHAMBERS - THE DUNGEON - THE LOBBY - THE GARDENS
//	        |
//    THE CAVE

    public Room createRooms() {
        Room theCave = new Room("The Cave");
        Room theIronChambers = new Room("The Iron Chambers");
        Room theDungeon = new Room("The Dungeon");
        Room theLayer = new Room("The Layer");
        Room thePit = new Room("The Pit");
        Room theLobby = new Room("The Lobby");
        Room theGardens = new Room("The Gardens");


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