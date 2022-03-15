import java.lang.reflect.Array;

public class Space
{
    private boolean empty;
    private boolean hit;
    private boolean miss;

    public Space()
    {
        empty = true;
        hit = false;
        miss = false;
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
}
