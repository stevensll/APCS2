import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class USACO{
    public static int bronze(String filename) throws FileNotFoundException{
        Scanner in = new Scanner(new File (filename));
        //constants
            final int r = in.nextInt();
            final int c = in.nextInt();
            int target_elevation = in.nextInt();
            final int instructions = in.nextInt();
            final int area = 5184;
        // System.out.println(r + " " + c + " " + target_elevation + " " + instructions );
        int[][] lake = new int[r][c];
        for(int i = 0; i < r; i++){
            in.nextLine();
            for(int j = 0; j < c; j++){
                lake[i][j] = in.nextInt();
            }
        }
        // System.out.println(toString(lake));

        int sol = 0;    
        return sol;
    }
    public static String toString(int[][] arr){
        String result = "";
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[0].length; column++){
                result+=" "+arr[row][column];
            }
            if(row != arr.length-1) result+="\n";
        }
        return result;
    }
    public static long silver(String filename) throws FileNotFoundException{
        int sol = 0;
        return sol;
    }
}

//Example Usage:
// int ans = USACO.bronze("lake1.input");
// long ans2 = USACO.silver("cowPath1.input");