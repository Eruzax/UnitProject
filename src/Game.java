import java.util.Scanner;


public class Game
{
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public void start()
    {
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
        boolean running = true;
        player1.setShips();
        player2.setShips();
        while (running)
        {
            int p1DeadShips = 0;
            int p2DeadShips = 0;

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
            p2DeadShips = checkDeadShips(player2);
            System.out.println("p2 dead ships: " + p2DeadShips);
            if (p2DeadShips == 5)
            {
                System.out.println(player1.getName() + " Wins!");
                running = false;
            }

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
            p1DeadShips = checkDeadShips(player1);
            System.out.println("p1 dead ships: " + p1DeadShips);
            if (p1DeadShips == 5)
            {
                System.out.println(player2.getName() + " Wins!");
                running = false;
            }
        }

    }

    private int checkDeadShips(Player p)
    {
        int counter = 0;
        for (int i = 0; i < p.getBoats().size(); i++)
        {
            if (p.getBoats().get(i).isDead())
            {
                counter++;
            }
        }
        return counter;
    }
}
