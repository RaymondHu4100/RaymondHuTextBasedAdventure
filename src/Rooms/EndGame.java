package Rooms;

import People.Person;

public class EndGame extends House
{
    public static int inventorpet = 0;
    private static boolean win = false;

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        this.win = true;
        inventorpet = (Rooms.FireCreature.housepet) + (Rooms.WaterCreature.forestpet) + (Rooms.EarthCreature.roadpet);
        System.out.println("You have reached the end! You collected " + inventorpet + " out of 4 creatures!");
    }
    public String toString ()
    {
        return "E";
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
