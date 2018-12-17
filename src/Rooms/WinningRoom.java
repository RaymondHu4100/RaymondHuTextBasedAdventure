package Rooms;

import People.Person;

public class WinningRoom extends House
{
    private static boolean win = false;


    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        this.win = true;
        System.out.println("You have reached the end! You collected " + "6" + " out of 4 creatures!");
    }
    public String toString ()
    {
        return "W";
    }
    public static void setWin(boolean a)
    {
        win = a;
    }
    public static boolean checkWin()
    {
        return win;
    }

}
