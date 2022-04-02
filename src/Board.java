import java.lang.reflect.Array;

/**
 * This class prints out the game board as it updates.
 * It also sets each space object in the array of spaces to its correct value.
 * @author Kaden Kwan
 */

public class Board
{
    private Space[][] gameBoard;
    private int numRows;
    private int numCols;

    /**
     * This is the Board constructor which creates the 2D array of Spaces
     * @param rows The number of rows of the 2d Array
     * @param cols The number of columns of the 2d Array
     */
    public Board(int rows, int cols)
    {
        numRows = rows;
        numCols = cols;
        gameBoard = new Space[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                Space s = new Space();
                gameBoard[i][j] = s;
            }
        }
    }

    /**
     * This is a getter method to return the game board
     * @return Space[][] This returns the game board
     */
    public Space[][] getGameBoard()
    {
        return gameBoard;
    }

    /**
     * This method prints the initial game board based on the values of the space at different indexes
     */
    public void drawBoard()
    {
        int rowCounter = 1;
        int colCounter = 1;
        for (int i = 0; i < gameBoard.length; i++)
        {
            for (int j = 0; j < gameBoard[i].length; j++)
            {
                if (j == 8)
                {
                    if (i == 0)
                    {
                        System.out.println(" " + colCounter + "  | ");
                        colCounter++;
                    }
                    else if (j == 1)
                    {
                        System.out.println(" " + rowToLetter(rowCounter) + "  | ");
                        rowCounter++;
                    }
                    else if (gameBoard[i][j].getHit())
                    {
                        System.out.println(" ⬤  | ");
                    }
                    else if (gameBoard[i][j].containsBoat())
                    {
                        System.out.println(" ⬛  | ");
                    }
                    else if (gameBoard[i][j].getMiss())
                    {
                        System.out.println(" ◯  | ");
                    }
                    else if(gameBoard[i][j].getEmpty())
                    {
                        System.out.println(" 〰  | ");
                    }
                }
                else
                {
                    if(i == 0 && j == 0)
                    {
                        System.out.print("    | ");
                    }
                    else if (i == 0)
                    {
                        System.out.print("  " + colCounter + "  | ");
                        colCounter++;
                    }
                    else if (j == 0)
                    {
                        System.out.print(" " + rowToLetter(rowCounter) + "  | ");
                        rowCounter++;
                    }
                    else if (gameBoard[i][j].getHit())
                    {
                        System.out.print(" ⬤  | ");
                    }
                    else if (gameBoard[i][j].containsBoat())
                    {
                        System.out.print(" ⬛  | ");
                    }
                    else if (gameBoard[i][j].getMiss())
                    {
                        System.out.print(" ◯  | ");
                    }
                    else if (gameBoard[i][j].getEmpty())
                    {
                        System.out.print(" 〰  | ");
                    }
                }

            }
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * This sets each Space index of the game board to its correct value each time there is an update and prints the board
     */
    public void setBoard()
    {
        int rowCounter = 1;
        int colCounter = 1;
        for (int i = 0; i < gameBoard.length; i++)
        {
            for (int j = 0; j < gameBoard[i].length; j++)
            {
                if (j == 8)
                {
                    if (i == 0)
                    {
                        System.out.println("  " + colCounter + "  | ");
                        colCounter++;
                    }
                    else if (j == 1)
                    {
                        System.out.println(" " + rowToLetter(rowCounter) + "  | ");
                        rowCounter++;
                    }
                    else if (gameBoard[i][j].getHit())
                    {
                        System.out.println(" ●  | ");
                    }
                    else if (gameBoard[i][j].getMiss())
                    {
                        System.out.println(" ○  | ");
                    }
                    else if(gameBoard[i][j].getEmpty())
                    {
                        System.out.println(" 〰  | ");
                    }
                }
                else
                {
                    if(i == 0 && j == 0)
                    {
                        System.out.print("    | ");
                    }
                    else if (i == 0)
                    {
                        System.out.print("  " + colCounter + "  | ");
                        colCounter++;
                    }
                    else if (j == 0)
                    {
                        System.out.print(" " + rowToLetter(rowCounter) + "  | ");
                        rowCounter++;
                    }
                    else if (gameBoard[i][j].getHit())
                    {
                        System.out.print(" ●  | ");
                    }
                    else if (gameBoard[i][j].getMiss())
                    {
                        System.out.print(" ○  | ");
                    }
                    else if (gameBoard[i][j].getEmpty())
                    {
                        System.out.print(" 〰  | ");
                    }
                }

            }
            System.out.println("-----------------------------------------------------------");
        }
    }

    /**
     * This is a helper method that is used to help determine what to print on the board at different rows
     * @param row This is an int that is converted to a corresponding letter
     * @return String This returns a letter based on the int given
     */
    private String rowToLetter(int row)
    {
        if (row == 1)
        {
            return "A";
        }
        else if (row == 2)
        {
            return "B";
        }
        else if (row == 3)
        {
            return "C";
        }
        else if (row == 4)
        {
            return "D";
        }
        else if (row == 5)
        {
            return "E";
        }
        else if (row == 6)
        {
            return "F";
        }
        else if (row == 7)
        {
            return "G";
        }
        else if (row == 8)
        {
            return "H";
        }
        return null;
    }

}
