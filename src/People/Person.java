package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
    private static int xLoc, yLoc, floor;
    private int inventoryIndex = 0;
    public int getyLoc() {
        return yLoc;
    }
    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }
    public int getxLoc() {
        return xLoc;
    }
    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }
    public static int getFloorNumber() {return floor;}
    public void setFloor(int floor) {this.floor = floor;}
    public void moveNorth()
    {
        yLoc = yLoc -1;
    }
    public void moveSouth()
    {
        yLoc = yLoc + 1;
    }
    public void moveEast()
    {
        xLoc = xLoc + 1;
    }
    public void moveWest()
    {
        xLoc = xLoc - 1;
    }
    public Person (int xLoc, int yLoc, int floor)
    {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.floor = floor;
    }
}
