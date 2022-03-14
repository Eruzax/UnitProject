import java.util.Scanner;
public class Player
{
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
}
