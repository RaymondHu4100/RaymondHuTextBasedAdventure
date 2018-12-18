package Rooms;

import People.Person;

public class WaterCreature extends House
{
    public static int forestpet = 0;
    private static boolean win = false;

    /**
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x)
    {
        occupant = x;
        System.out.println("You have just collected a water creature!");
    }
    @Override
    public void roomAction(Person x)
    {
        if (forestpet == 0) {
            Person user = new Person(13, 5, 5);
            forestpet = forestpet + 1;
        }
        else
        {
            Person user = new Person(13, 5, 6);
            forestpet = forestpet + 1;
        }
    }
    public String toString ()
    {
        return "I";
    }
}