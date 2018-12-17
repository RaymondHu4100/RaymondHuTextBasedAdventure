package Rooms;

import People.Person;

public class Road extends House
{
    Person occupant;
    public Road()
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
        Person user = new Person(1,0, 3);
    }
    @Override
    public String toString ()
    {
        if (occupant != null) {
            return "x";
        }
        else return "R";
    }
}