import java.util.Scanner;
public class Game
{
    private Scanner scan = new Scanner(System.in);
    public void welcome()
    {
        System.out.println("Welcome to BattleShip!");
        System.out.println("Player 1 enter your name: ");
        String choice = scan.nextLine();
        Player player1 = new Player(choice);
        System.out.println("Player 2 enter your name: ");
        choice = scan.nextLine();
        Player player2 = new Player(choice);
    }

    public void theGame()
    {

    }
}
