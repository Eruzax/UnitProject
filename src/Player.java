import java.util.Scanner;
public class Player
{
    private Boat boat1;
    private Boat boat2;
    private Boat boat3;
    private Boat boat4;
    private Boat boat5;
    private String name;
    private Board playerBoard;
    Scanner scan = new Scanner(System.in);

    public Player(String n)
    {
        name = n;
        playerBoard = new Board(7, 7);
    }

    public void turn()
    {
        System.out.println("Where do you want to attack? (letter, number)");
        String choice = scan.nextLine();
    }

    public void takeHit(int row, int col)
    {
        playerboard
    }

    public void drawShip(Boat boat, int row, int col)
    {

        for(int i = col; i < boat.getLength(); i++)
        {
            playerBoard[row][i]
        }
    }
}
