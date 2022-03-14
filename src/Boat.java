public class Boat
{
    private int length;
    private String name;
    private boolean dead;

    public Boat(String n, int l)
    {
        name = n;
        length = l;
        dead = false;
    }

    public int getLength()
    {
        return length;
    }

    public String getName()
    {
        return name;
    }

    public boolean isDead()
    {
        return dead;
    }

    public void setDead(boolean d)
    {
        dead = d;
    }
}
