import java.lang.reflect.Array;
public class Board
{
    public Space[][] getGameBoard() {
        return gameBoard;
    }

    private Space[][] gameBoard;
    private int numRows;
    private int numCols;

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

}
