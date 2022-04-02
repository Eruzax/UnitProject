import java.lang.reflect.Array;

/**
 * This class creates a Space object
 * @author Kaden Kwan
 */
public class Space
{
    private boolean empty;
    private boolean hit;
    private boolean miss;
    private boolean containsBoat;

    /**
     * Space constructor
     */
    public Space()
    {
        empty = true;
        hit = false;
        miss = false;
        containsBoat = false;
    }

    /**
     * empty getter method
     * @return This returns the boolean empty
     */
    public boolean getEmpty()
    {
        return empty;
    }

    /**
     * hit getter method
     * @return This returns the boolean hit
     */
    public boolean getHit()
    {
        return hit;
    }

    /**
     * miss getter method
     * @return This returns the boolean miss
     */
    public boolean getMiss()
    {
        return miss;
    }

    /**
     * containsBoat getter method
     * @return This returns the boolean containsBoat
     */
    public boolean containsBoat()
    {
        return containsBoat;
    }

    /**
     * empty setter method
     * @param e This is the boolean empty is being set to
     */
    public void setEmpty(boolean e)
    {
        empty = e;
    }
    /**
     * containsBoat setter method
     * @param b This is the boolean containsBoat is being set to
     */
    public void setContainsBoat(boolean b)
    {
        containsBoat = b;
    }

    /**
     * hit setter method
     * @param h This is the boolean hit is being set to
     */
    public void setHit(boolean h)
    {
        hit = h;
    }

    /**
     * miss setter method
     * @param m This is the boolean miss is being set to
     */
    public void setMiss(boolean m)
    {
        miss = m;
    }
}
