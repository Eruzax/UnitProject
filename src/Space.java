import java.lang.reflect.Array;

public class Space
{
    private boolean empty;
    private boolean hit;
    private boolean miss;
    private boolean containsBoat;

    public Space()
    {
        empty = true;
        hit = false;
        containsBoat = false;
    }

    public boolean getEmpty()
    {
        return empty;
    }

    public boolean getHit()
    {
        return hit;
    }


    public boolean containsBoat()
    {
        return containsBoat;
    }

    public void setContainsBoat(boolean b)
    {
        containsBoat = b;
    }

    public void setHit(boolean h)
    {
        hit = h;
    }

}
