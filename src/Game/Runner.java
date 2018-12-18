package Game;

import People.Person;
import Rooms.Road;
import Rooms.Forest;
import Rooms.House;
import Rooms.EndGame;
import Rooms.FireCreature;
import Rooms.WaterCreature;
import Rooms.AirCreature;
import Rooms.EarthCreature;

import java.util.Scanner;

public class Runner {
    private static Board building = new Board(createBoard());
    private static String input = "";
    public static void main(String[] args)
    {
        String input = "";
        // Greeting
        EndGame.setWin(false);
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
        return EndGame.checkWin();
    }
    private static Floor[] createBoard ()
    {
        // Creates and fills a floor with empty rooms
        Floor Floor1 = new Floor(new House[7][7]);
        Floor1.fill();
        Floor1.addRoom(new Forest(),6,6);
        Floor1.addRoom(new FireCreature(),3,6);
        // Adds rooms to Floor 1
        // Creates a room array and sets it to Floor 2
        Floor Floor2 = new Floor(new House[25][25]);
        Floor2.fill();
        Floor2.addRoom(new Road(),23,24);
        Floor2.addRoom(new WaterCreature(),5,13);
        Floor2.addRoom(new AirCreature(),13,5);
        Floor Floor3 = new Floor(new House[37][3]);
        Floor3.fill();
        Floor3.addRoom(new EarthCreature(),14,2);
        Floor3.addRoom(new EndGame(),36,1);
        Floor Floor4 = new Floor(new House[7][7]);
        Floor4.fill();
        Floor4.addRoom(new Forest(),6,6);
        Floor Floor5 = new Floor(new House[25][25]);
        Floor5.fill();
        Floor5.addRoom(new Road(),23,24);
        Floor5.addRoom(new AirCreature(),13,5);
        Floor Floor6 = new Floor(new House[25][25]);
        Floor6.fill();
        Floor6.addRoom(new Road(),23,24);
        Floor Floor7 = new Floor(new House[25][25]);
        Floor7.fill();
        Floor7.addRoom(new Road(),23,24);
        Floor7.addRoom(new WaterCreature(),5,13);
        Floor Floor8 = new Floor(new House[37][3]);
        Floor8.fill();
        Floor8.addRoom(new EndGame(),36,1);
        // Creates a floor array known as building
        Floor [] building = new Floor[9];
        // Sets the floors in the building to the 2d room array.
        building[1] = Floor1;
        building[2] = Floor2;
        building[3] = Floor3;
        building[4] = Floor4;
        building[5] = Floor5;
        building[6] = Floor6;
        building[7] = Floor7;
        building[8] = Floor8;
        return building;
    }
}
