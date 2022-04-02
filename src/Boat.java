import java.util.ArrayList;

/**
 * This class creates the boats
 * @author Kaden Kwan
 */

public class Boat
{
    private int length;
    private String name;
    private int health;
    private boolean dead;
    private ArrayList<Space> spots;

    /**
     * Boat constructor
     * @param n This is the name of the ship
     * @param l This is the length of the ship
     */
    public Boat(String n, int l)
    {
        health = l;
        name = n;
        length = l;
        dead = false;
        spots = new ArrayList<Space>();
    }

    /**
     * spots getter method
     * @return Returns an array list of Spaces that the boat takes up
     */

    public ArrayList<Space> getSpots()
    {
        return spots;
    }

    /**
     * length getter method
     * @return Returns the length (int) of the ship
     */
    public int getLength()
    {
        return length;
    }

    /**
     * name getter method
     * @return Returns the name (String) of the ship
     */
    public String getName()
    {
        return name;
    }

    /**
     * health getter method
     * @return Returns the heath (int) of the ship
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * Increments the health of the ship down one
     */
    public void loseHealth()
    {
        if (health-- < 0)
        {
            health = 0;
        }
        else
        {
            health--;
        }
    }

    /**
     * isDead getter method
     * @return Returns true if the boat is dead and false if not.
     */
    public boolean isDead()
    {
        return dead;
    }

    /**
     * Sets isDead to the parameter d
     * @param d Boolean if the boad is dead or not
     */
    public void setDead(boolean d)
    {
        dead = d;
    }

}
