public class Boat
{
    private int length;
    private String name;
    private int health;
    private boolean dead;
    private Space[] spots;

    public Boat(String n, int l)
    {
        health = l;
        name = n;
        length = l;
        dead = false;
        spots = new Space[l];
    }

    public Space[] getSpots()
    {
        return spots;
    }

    public int getLength()
    {
        return length;
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public void loseHealth()
    {
        health--;
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
