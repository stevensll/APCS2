import java.util.*;
import java.io.*;
public class MazeGenerator {

    
    public static void generate(char[][]maze, int rows, int cols,int startrow, int startcol){

    }
    /*nextSquare checks if the input square can be carved. it must satisfy
      the condition that the there are less than 2 Neighbors (up/down/left/right) that are already carved.
    */
    public static boolean nextSquare(char[][]maze, int row, int col){
        int count_neighbors = 0;
        //out of bounds check
        if (row >= maze.length-1 || row <= 0) return false;
        if (col >= maze[0].length-1 || col <= 0) return false;
        //if our neighbor
        // if (maze[row][col]== ' ') return false;
        if (maze[row-1][col] == ' ') count_neighbors++;  //checks up
        if (maze[row+1][col]== ' ') count_neighbors++;   //checks down
        if (maze[row][col+1]== ' ') count_neighbors++;   //checks right
        if (maze[row][col-1]== ' ') count_neighbors++;   //checks left
        return count_neighbors < 2;
    }
    public static String toString(char[][] maze){
        String result = "";
        for(int row = 0; row < maze.length; row++){
            for(int column = 0; column < maze[0].length; column++){
                result+=maze[row][column];
            }
            if(row != maze.length-1) result+="\n";
        }
        return result;
    }
    public static char [][] readMaze(String filename) throws FileNotFoundException{
        Scanner in = new Scanner(new File(filename));        
        ArrayList<char[]> arrLines = new ArrayList<char[]>();
        while(in.hasNextLine()){
            arrLines.add(in.nextLine().toCharArray());
        }
        int height = arrLines.size();
    
        char maze[][] = new char[height][];
        for(int i = 0; i < height; i++){
            maze[i] = arrLines.get(i);
        }  
        return maze;
    }
}
