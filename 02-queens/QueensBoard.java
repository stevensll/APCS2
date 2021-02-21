public class QueensBoard {    

  private int[][] board;

  public QueensBoard(int size){
    board = new int[size][size];
  }

  public boolean AddQueen(int r, int c){
    //to add a queen to a square (r,c) we must check that the current square is not occupied
      if(board[r][c] != 0) return false;
      else{
        //we add and we do three things: occupy the row, occupy the column, and occupy the diagonal
        //since our board is symmetrical, we can use one for loop to take care of rows and columns
        for(int i = 0; i < board.length;i++){
          board[i][c]++;
          board[r][i]++;
          //need to add diagonals here.     
        }
        return true;
      }
  }

  private void removeQueen(int r, int c){
  
  }

  /*
  Approach to the problem: we will fill up the board using -1, 0, and positive integers. 
  -1 will represent queens
  0 will represent spots that are not threatened by a queen.
  Any positive integer represents spots that are threatened by a or multiple queens.
  */


  /**
    *@return The output string formatted as follows:
    *All numbers that represent queens are replaced with 'Q'
    *all others are displayed as underscores '_'
    *There are spaces between each symbol:
    *_ _ Q _
    *Q _ _ _
    *_ _ _ Q
    *_ Q _ _
    *(pythonic string notation for clarity,
    *excludes the character up to the *)
    */
  public String toString(){

      
      return null;
    }


    /**Find the first solution configuration possible for this size board. Start by placing
    *  the 1st queen in the top left corner, and each new queen in the next COLUMN. When backtracking
    *  move the previous queen down to the next valid space. This means everyone will generate the same
    *  first solution.
    *@return false when the board is not solveable and leaves the board filled with zeros;
    *        returns true when the board is solveable, and leaves the board in a solved state
    *@throws IllegalStateException when the board starts with any non-zero value (e.g. you solved a 2nd time.)
    */
  public boolean solve(){
      return false;

    }

    /**Find all possible solutions to this size board.
    *@return the number of solutions found, and leaves the board filled with only 0's
    *@throws IllegalStateException when the board starts with any non-zero value (e.g. you ran solve() before this method)
    */
    public int countSolutions(){
      return 0;

    } 
}
