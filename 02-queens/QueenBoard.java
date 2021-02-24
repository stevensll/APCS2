public class QueenBoard {    
  /*
  Approach to the problem: we will fill up the board using -1, 0, and positive integers. 
  -1 will represent queens
  0 will represent spots that are not threatened by a queen.
  Any positive integer represents spots that are threatened by a or multiple queens.
  */
  private int[][] board;

  public QueenBoard(int size){
    board = new int[size][size];
    this.reset();
  }
  //reset method to make all values on the board to be 0
  private void reset(){
    for(int r = 0; r < board.length; r++){
      for(int c = 0; c<board.length; c++){
        board[r][c] = 0;
      }
    }
  }
  //O(N) call
  private boolean AddQueen(int r, int c){
    //to add a queen to a square (r,c) we must check that the current square is not occupied
      if(board[r][c] != 0) return false;
      else{
        //when we add we do three things: occupy the row, occupy the column, and occupy the diagonal
        //since our board is symmetrical, we can use one for loop to take care of rows and columns (and diagonals!)
        for(int i = 0; i < board.length;i++){
          board[i][c]++;
          board[r][i]++;
          /*at a given [r][c], there are four diagonal coordinates:
          Bot right: (r+i),(c+i)
          Top left: (r-i), (c-i)
          Bot left(r+i), (c-i)
          Top right(r-i), (c+i)
          wrap in if statements to apply diagonal squares that are in bounds of the board.
          */
          if(r+i < board.length && c+i<board.length) board[r+i][c+i]++;
          if(r-i >= 0 && c-i >=0) board[r-i][c-i]++;
          if(r+i < board.length && c-i>=0) board[r+i][c-i]++;
          if(r-i>=0 && c+i < board.length) board[r-i][c+i]++;
        }
        board[r][c] = -1;
        return true;
      }
  }
  //O(N) call, almost the same as AddQueen
  private void removeQueen(int r, int c){
    if(board[r][c] == -1){
      for(int i = 0; i <board.length; i++){
        board[i][c]--;
        board[r][i]--;
        if(r+i < board.length && c+i<board.length) board[r+i][c+i]--;
        if(r-i >= 0 && c-i >=0) board[r-i][c-i]--;
        if(r+i < board.length && c-i>=0) board[r+i][c-i]--;
        if(r-i>=0 && c+i < board.length) board[r-i][c+i]--;
      }
      board[r][c]=0;
    }
  }

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
    String result = "";
    for(int r = 0; r < board.length; r++){
      for(int c = 0; c<board.length; c++){
        if(board[r][c] == -1) result+= "Q ";
        else if(c == board.length) result +="_";
        else result+="_ ";
      }
      result+="\n";
    }
    
    return result;
  }

  private String debugToString(){
    String result = "";
    for(int r = 0; r < board.length; r++){
      for(int c = 0; c<board.length; c++){
        if(c == board.length) result +=board[r][c];
        else result+=board[r][c]+"  ";
      }
      result+="\n";
    }
    
    return result;
  }


  /**Find the first solution configuration possible for this size board. Start by placing
  *  the 1st queen in the top left corner, and each new queen in the next COLUMN. When backtracking
  *  move the previous queen down to the next valid space. This means everyone will generate the same
  *  first solution.
  *@return false when the board is not solveable and leaves the board filled with zeros;
  *        returns true when the board is solveable, and leaves the board in a solved state
  *@throws IllegalStateException when the board starts with any non-zero value (e.g. you solved a 2nd time.)
  */
  public boolean solve() throws IllegalStateException{
    if(board.length == 0) return true;
    if(board[0][0] != 0) throw new IllegalStateException("Board has not been reset.");
    return solve(0);
  }

  private boolean solve(int column){
    //base case: if column input reaches the last column, then a queen has been placed in every column and thus is solved
    if (column == board.length) {
      return true;
    }
    //since we are recursing by column, we must check if we can make a new path in each row
    for(int row = 0; row < board.length; row++){
      if(AddQueen(row, column)){
        /* if a queen can be placed, we can do two things: 
          1) take that path of adding the queen, and solve by moving
             onto the next column. this is where we backtrack
          2) remove the queen added queen. we simply skip this row and move onto the next possible option.
        */
        if(solve(column+1)) return true;
        removeQueen(row, column);
      }  
    } 
    return false; 
  }



/**Find all possible solutions to this size board.
*@return the number of solutions found, and leaves the board filled with only 0's
*@throws IllegalStateException when the board starts with any non-zero value (e.g. you ran solve() before this method)
*/
  public int countSolutions() throws IllegalStateException{
    if(board.length == 0) return 1;
    if(board[0][0] != 0) throw new IllegalStateException("Board has not been reset.");
    return countSolutions(0,0);

  }

  private int countSolutions(int column, int count){
    //same base case
    if(column == board.length){
      count++;
    }
    for(int row = 0; row<board.length; row++){
      if(AddQueen(row, column)){
        countSolutions(column+1,count);
        removeQueen(row, column);
      }
    }
    return count;
  }
  
}
