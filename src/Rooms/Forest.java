package Rooms;

import People.Person;

public class Forest extends House
{
    Person occupant;
    public Forest()
    {
    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x)
    {
        occupant = x;
    }
    @Override
    public void roomAction(Person x)
    {
        Person user = new Person(0,6, 2);
    }
    @Override
    public String toString ()
    {
        if (occupant != null) {
            return "x";
        }
        else return "F";
    }
}
