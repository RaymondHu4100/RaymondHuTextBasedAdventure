package Rooms;

import People.Person;

public class House {
    Person occupant;
    public House()
    {
    }
    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        occupant = x;
    }

    /**
     *  This method preforms the room action.
     * @param x the User
     */
    public void roomAction(Person x)
    {
        System.out.println("Go collect some creatures!");
    }
    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
    public String toString ()
    {
        if (occupant != null) {
            return "x";
        }
        else return " ";
    }
}
