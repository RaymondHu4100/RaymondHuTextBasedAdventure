package Rooms;

import People.Person;

public class FireCreature extends House
{
    public static int housepet = 0;
    private static boolean win = false;
    /**
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        housepet = housepet + 1;
        System.out.println("You have just collected a fire creature!");
    }
    @Override
    public void roomAction(Person x)
    {
        Person user = new Person(6,3, 4);
    }
    public String toString ()
    {
        return "I";
    }
}