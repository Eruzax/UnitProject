import java.util.Scanner;
public class Player
{
    private Boat carrier;
    private Boat battleship;
    private Boat cruiser;
    private Boat submarine;
    private Boat destroyer;
    private String name;
    private Board playerBoard;
    private Board enemyBoard;
    Scanner scan = new Scanner(System.in);

    public Player(String n)
    {
        name = n;
        playerBoard = new Board(7, 7);
        enemyBoard = new Board(7, 7);
        carrier = new Boat("Carrier", 5);
        battleship = new Boat("Battleship", 4);
        cruiser = new Boat("Cruiser", 3);
        submarine = new Boat("Submarine", 3);
        destroyer = new Boat("Destroyer", 2);
    }

    public Board getPlayerBoard() {
        return playerBoard;
    }

    public void turn()
    {
        System.out.println("Where do you want to attack? (letter, number)");
        String choice = scan.nextLine();
    }

    public void takeHit(int row, int col, boolean h)
    {
        if (playerBoard[row][col].containsShip())
        playerBoard[row][col].setHit(h);
    }

    public void attack(int row, int col)
    {
        enemyBoard[row][col].
    }

    public void drawShip(Boat boat, int row, int col)
    {

        for(int i = col; i < boat.getLength(); i++)
        {
            playerBoard[row][i].setContainsBoat(true);
        }
    }
}
