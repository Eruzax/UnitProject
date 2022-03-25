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

    public void takeHit(int row, int col)
    {
        if (playerBoard.getGameBoard()[row][col].containsBoat())
        {
            playerBoard.getGameBoard()[row][col].setHit(true);
        }
        else
        {
            playerBoard.getGameBoard()[row][col].setHit(false);
        }
    }

    public void attack(int row, int col)
    {
        if (enemyBoard.getGameBoard()[row][col].containsBoat())
        {
            enemyBoard.getGameBoard()[row][col].setHit(true);
            System.out.println("HIT!");
        }
        else
        {
            enemyBoard.getGameBoard()[row][col].setHit(false);
        }
    }

    public void drawShip(Boat boat, int row, int col)
    {
        for(int i = col; i < boat.getLength(); i++)
        {
            playerBoard.getGameBoard()[row][i].setContainsBoat(true);
        }
    }
}
