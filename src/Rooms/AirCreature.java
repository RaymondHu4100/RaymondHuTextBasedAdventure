package Rooms;

import People.Person;

public class AirCreature extends House
{
    private static boolean win = false;
    /**
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        System.out.println("You have just collected an air creature!");
    }
    @Override
    public void roomAction(Person x)
    {
        if ((Rooms.WaterCreature.forestpet) == 0) {
            Person user = new Person(5, 13, 7);
            (Rooms.WaterCreature.forestpet) = (Rooms.WaterCreature.forestpet) + 1;
        }
        else
        {
            Person user = new Person(5, 13, 6);
            (Rooms.WaterCreature.forestpet) = (Rooms.WaterCreature.forestpet) + 1;
        }
    }
    public String toString ()
    {
        return "I";
    }
}