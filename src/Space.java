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
        miss = false;
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

    public boolean getMiss()
    {
        return miss;
    }

    public boolean containsBoat()
    {
        return containsBoat;
    }
    public void setEmpty(boolean e)
    {
        empty = e;
    }
    public void setContainsBoat(boolean b)
    {
        containsBoat = b;
    }

    public void setHit(boolean h)
    {
        hit = h;
    }

    public void setMiss(boolean m)
    {
        miss = m;
    }
}
