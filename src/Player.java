import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class Player
{
    ArrayList<Space> hitSpots;
    private ArrayList<Boat> boats;
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
        hitSpots = new ArrayList<>();
        name = n;
        playerBoard = new Board(9, 9);
        enemyBoard = new Board(9, 9);
        carrier = new Boat("Carrier", 5);
        battleship = new Boat("Battleship", 4);
        cruiser = new Boat("Cruiser", 3);
        submarine = new Boat("Submarine", 3);
        destroyer = new Boat("Destroyer", 2);
        boats = new ArrayList<>();
        boats.add(carrier);
        boats.add(battleship);
        boats.add(cruiser);
        boats.add(submarine);
        boats.add(destroyer);
    }

    public String getName()
    {
        return name;
    }

    public Board getPlayerBoard() {
        return playerBoard;
    }

    public Board getEnemyBoard() {
        return enemyBoard;
    }

    public void takeHit(int row, int col)
    {
        if (playerBoard.getGameBoard()[row][col].containsBoat())
        {
            for (int i = 0; i < boats.size(); i++)
            {
                for (int j = 0; j < boats.get(i).getLength(); j++)
                {
                    if (boats.get(i).getSpots()[j] == playerBoard.getGameBoard()[row][col] && !(hitSpots.contains(playerBoard.getGameBoard()[row][col])))
                    {
                        hitSpots.add(playerBoard.getGameBoard()[row][col]);
                        boats.get(i).loseHealth();
                    }
                }
            }
            playerBoard.getGameBoard()[row][col].setHit(true);
            playerBoard.getGameBoard()[row][col].setEmpty(false);
        }
        else
        {
            playerBoard.getGameBoard()[row][col].setMiss(true);
            playerBoard.getGameBoard()[row][col].setEmpty(false);
        }
    }

    public void attack(Board b, int row, int col)
    {
        if (b.getGameBoard()[row][col].containsBoat())
        {
            enemyBoard.getGameBoard()[row][col].setHit(true);
            enemyBoard.getGameBoard()[row][col].setEmpty(false);
            System.out.println("HIT!");
        }
        else
        {
            enemyBoard.getGameBoard()[row][col].setMiss(true);
            enemyBoard.getGameBoard()[row][col].setEmpty(false);
            System.out.println("MISS!");
        }
    }

    public void setShips()
    {
        Scanner scan = new Scanner(System.in);
        for (int j = 0; j < boats.size(); j++)
        {
            boolean go = true;
            while(go)
            {
                System.out.println("Where do you want to put the start of the " + boats.get(j).getName()+ " (" + boats.get(j).getLength() + ")");
                String start = scan.nextLine();
                System.out.println("(H)orizontal or (V)ertical?");
                String way = scan.nextLine().toUpperCase();
                int r1 = row(start);
                int c1 = col(start);
                if (way.equals("V"))
                {
                    for (int i = r1; i <= boats.get(j).getLength(); i++)
                    {
                        if (r1 + boats.size() > playerBoard.getGameBoard().length || playerBoard.getGameBoard()[i][c1].containsBoat() == true)
                        {
                            System.out.println("Invalid Selection");
                            playerBoard.drawBoard();
                        }
                        else
                        {
                            playerBoard.getGameBoard()[i][c1].setContainsBoat(true);
                            playerBoard.getGameBoard()[i][c1].setEmpty(false);
                            for (int k = 0; k < boats.get(j).getLength(); k++)
                            {
                                boats.get(j).getSpots()[k] = playerBoard.getGameBoard()[i][c1];
                            }
                            go = false;
                        }
                    }
                    playerBoard.drawBoard();
                }
                else if (way.equals("H"))
                {
                    for (int i = c1; i <= boats.get(j).getLength(); i++)
                    {
                        if (c1 + boats.get(j).getLength() > playerBoard.getGameBoard()[j].length || playerBoard.getGameBoard()[r1][i].containsBoat())
                        {
                            System.out.println("Invalid Selection");
                            playerBoard.drawBoard();
                        }
                        else
                        {
                            playerBoard.getGameBoard()[r1][i].setContainsBoat(true);
                            playerBoard.getGameBoard()[r1][i].setEmpty(false);
                            for (int k = 0; k < boats.get(j).getLength(); k++)
                            {
                                boats.get(j).getSpots()[k] = playerBoard.getGameBoard()[r1][i];
                            }
                            go = false;
                        }
                    }
                    playerBoard.drawBoard();
                }
            }
        }
    }

    public static int row(String str)
    {
        int row = 0;

        if (str.substring(0, 1).equals("A"))
        {
            row = 1;
        }
        else if (str.substring(0, 1).equals("B"))
        {
            row = 2;
        }
        else if (str.substring(0, 1).equals("C"))
        {
            row = 3;
        }
        else if (str.substring(0, 1).equals("D"))
        {
            row = 4;
        }
        else if (str.substring(0, 1).equals("E"))
        {
            row = 5;
        }
        else if (str.substring(0, 1).equals("F"))
        {
            row = 6;
        }
        else if (str.substring(0, 1).equals("G"))
        {
            row = 7;
        }
        else if (str.substring(0, 1).equals("H"))
        {
            row = 8;
        }
        else if (str.substring(0, 1).equals("I"))
        {
            row = 9;
        }
        return row;
    }

    public static int col(String str)
    {
        int col = 0;
        if (str.substring(1).equals("1"))
        {
            col = 1;
        }
        else if (str.substring(1).equals("2"))
        {
            col = 2;
        }
        else if (str.substring(1).equals("3"))
        {
            col = 3;
        }
        else if (str.substring(1).equals("4"))
        {
            col = 4;
        }
        else if (str.substring(1).equals("5"))
        {
            col = 5;
        }
        else if (str.substring(1).equals("6"))
        {
            col = 6;
        }
        else if (str.substring(1).equals("7"))
        {
            col = 7;
        }
        else if (str.substring(1).equals("8"))
        {
            col = 8;
        }
        else if (str.substring(1).equals("9"))
        {
            col = 9;
        }
        return col;
    }
}
