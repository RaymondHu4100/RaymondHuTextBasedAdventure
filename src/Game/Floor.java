package Game;

import Rooms.House;
import People.Person;

public class Floor {
    private House[] [] Floor;

    public Floor (House[] [] Floor)
    {
        this.Floor = Floor;
    }

    public String toString()
    {
        String output = "";
        for (int i = 0; i < Floor.length; i++)
        {
            for (int n = 0; n < Floor[i].length; n++)
            {
                if (Floor [i] [n] != null)
                {
                    output = output + "[" + Floor[i][n].toString() + "]";
                }
                else
                {
                    output = output + "[NULL]";
                }
            }
            output = output + "\n";
        }
        return output;
    }

    public void fill()
    {
        for (int i = 0; i < Floor.length; i++)
        {
            for (int n = 0; n < Floor [i].length; n++)
            {
                Floor [i] [n] = new House();
            }
        }
    }
    public boolean canNorth(Person x)
    {

        if (x.getyLoc()-1 < 0)
        {
            System.out.println("You can't go further north!");
            return false;
        }
        return true;
    }

    public boolean canSouth(Person x)
    {
        if (x.getyLoc() +2 > Floor.length)
        {
            System.out.println("You can't go further south!");
            return false;
        }
        return true;
    }

    public boolean canEast(Person x)
    {
        if (x.getxLoc()+2>Floor[x.getxLoc()].length)
        {
            System.out.println("You can't go further east!");
            return false;
        }
        return true;
    }

    public boolean canWest(Person x)
    {
        if (x.getxLoc()-1<0)
        {
            System.out.println("You can't go further west!");
            return false;
        }
        return true;
    }

    public House getRoom(Person x)
    {
        return Floor [x.getyLoc()] [x.getxLoc()];
    }

    public void addRoom (House a, int x, int y)
    {
        Floor [x] [y] = a;
    }
}
