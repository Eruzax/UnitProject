import java.lang.reflect.Array;
public class Board
{
    private Space [][] gameBoard;
    private int numRows;
    private int numCols;

    public Board(int rows, int cols)
    {
        numRows = rows;
        numCols = cols;
        gameBoard = new Space[rows][cols];

    }

    public void makeBoard()
    {
        for(int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numCols; j++)
            {
                Space s = new Space();
                gameBoard[i][j] = s;
            }
        }
    }
}
