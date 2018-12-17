package Game;

import People.Person;
import Rooms.Road;
import Rooms.Forest;
import Rooms.House;
import Rooms.WinningRoom;

import java.util.Scanner;

public class Runner {
    private static Board building = new Board(createBoard());
    private static String input = "";
    public static void main(String[] args)
    {
        String input = "";
        // Greeting
        WinningRoom.setWin(false);
        System.out.println("Pocket Creatures V6.9");
        Scanner in = new Scanner(System.in);
        Person user = new Person(0,0, 1);
        building.getFloor(user).getRoom(user).enterRoom(user);
        boolean a;
        while (true) {
            a = turn(in, user);
            if (a)
            {
                break;
            }
        }
        // add a roomAction() method in room and overwrite it. Make science, compsci, math and humanities rooms.
    }
    public static boolean move(String move, Floor floor, Person x)
    {
        building.getFloor(x).getRoom(x).leaveRoom(x);
        if(move.toLowerCase().equals("w"))
        {
            if (floor.canNorth(x))
            {
                x.moveNorth();
                return true;
            }
            return false;

        }
        if(move.toLowerCase().equals("s"))
        {
            if (floor.canSouth(x))
            {
                x.moveSouth();
                return true;
            }
            return false;
        }
        if(move.toLowerCase().equals("d"))
        {
            if (floor.canEast(x))
            {
                x.moveEast();
                return true;
            }

            return false;
        }
        if(move.toLowerCase().equals("a"))
        {
            if (floor.canWest(x))
            {
                x.moveWest();
                return true;
            }

            return false;
        }
        else
        {
            System.out.println("Use W, A, S, D to move around.");
            return false;
        }

    }
    private static boolean turn(Scanner in, Person x)
    {
        input = "";
        System.out.println("");
        System.out.println(building.print(Person.getFloorNumber()));
        building.getFloor(x).getRoom(x).roomAction(x);
        while (!move(input,building.getFloor(x),x))
        {
            input = in.nextLine();
        }
        building.getFloor(x).getRoom(x).enterRoom(x);
        return WinningRoom.checkWin();
    }
    private static Floor[] createBoard ()
    {
        // Creates and fills a floor with empty rooms
        Floor Floor1 = new Floor(new House[7][7]);
        Floor1.fill();
        Floor1.addRoom(new Forest(),6,6);
        // Adds rooms to Floor 1
        // Creates a room array and sets it to Floor 2
        Floor Floor2 = new Floor(new House[25][25]);
        Floor2.fill();
        Floor2.addRoom(new Road(),23,24);
        Floor Floor3 = new Floor(new House[3][37]);
        Floor3.fill();
        Floor3.addRoom(new WinningRoom(),1,36);
        // Creates a floor array known as building
        Floor [] building = new Floor[4];
        // Sets the floors in the building to the 2d room array.
        building[1] = Floor1;
        building[2] = Floor2;
        building[3] = Floor3;
        return building;
    }
}
