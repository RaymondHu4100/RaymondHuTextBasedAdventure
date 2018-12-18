package Rooms;

import People.Person;

public class EarthCreature extends House {
    public static int roadpet = 0;
    private static boolean win = false;

    /**
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        roadpet = roadpet + 1;
        System.out.println("You have just collected an earth creature!");
    }
    @Override
    public void roomAction(Person x)
    {
        Person user = new Person(2,14, 8);
    }
    public String toString() {
        return "I";
    }
}
