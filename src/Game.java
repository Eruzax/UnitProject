import java.util.Scanner;


public class Game
{
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);
    private boolean running;
    public void start()
    {
        running = true;
        System.out.println("Welcome to BattleShip!");
        System.out.println("Player 1 enter your name: ");
        String choice = scan.nextLine();
        player1 = new Player(choice);
        System.out.println("Player 2 enter your name: ");
        choice = scan.nextLine();
        player2 = new Player(choice);
        theGame();
    }

    public void theGame()
    {
        player1.setShips();
        player2.setShips();
        while (running)
        {
            int p1DeadShips = 0;
            int p2DeadShips = 0;
            if (p1DeadShips == 5)
            {
                System.out.println(player2.getName() + " Wins!");
                running = false;
            }
            else if (p2DeadShips == 5)
            {
                System.out.println(player1.getName() + " Wins!");
                running = false;
            }
            else
            {
                turn();
            }
        }

    }

    public void turn()
    {
        //Player 1's turn
        System.out.println(player1.getName() + "'s Board");
        player1.getPlayerBoard().drawBoard();
        System.out.println();
        System.out.println("Enemy Board");
        player1.getEnemyBoard().setBoard();;
        System.out.println("Where do you want to attack? (letter, number)");
        String p1Choice = scan.nextLine();
        int p1Row = player1.row(p1Choice);
        int p1col = player1.col(p1Choice);
        player1.attack(player2.getPlayerBoard(), p1Row, p1col);
        player2.takeHit(p1Row, p1col);

        //Player 2's turn

        System.out.println(player2.getName() + "'s Board");
        player2.getPlayerBoard().drawBoard();
        System.out.println();
        System.out.println("Enemy Board");
        player2.getEnemyBoard().setBoard();
        System.out.println();
        System.out.println("Where do you want to attack? (letter, number)");
        String choice = scan.nextLine();
        int p2Row = player1.row(choice);
        int p2Col = player1.col(choice);
        player2.attack(player1.getPlayerBoard(), p2Row, p2Col);
        player1.takeHit(p2Row, p2Col);
    }
}
