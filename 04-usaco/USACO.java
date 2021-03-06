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
            final int target_elevation = in.nextInt();
            final int instructions = in.nextInt();
            final int area = 5184;
            int sum_depth = 0;
        // System.out.println(r + " " + c + " " + target_elevation + " " + instructions );
        // read the lake in
        int[][] lake = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                lake[i][j] = in.nextInt();
            }
            in.nextLine();
        }
        // System.out.println(toString(lake));
        // run stomp for the amount of input instructions
        for(int i = 0; i < instructions; i++){
            stomp(lake, in.nextInt(), in.nextInt(), in.nextInt());
        }
        // System.out.println("\n" +toString(lake));
        // last loop through the array, only add to depth if elevation is below the target elevation(think about this physically)
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(target_elevation > lake[i][j]) sum_depth+=(target_elevation-lake[i][j]);
            }
        }
        return sum_depth * area;
    }
    public static void stomp(int[][] lake, int R_s, int C_s, int D_s){
        R_s-=1;
        C_s-=1; //converts both coordinates for first row = 0 in a java array;
        int maxE = 0;
        for(int i = R_s; i < R_s+3; i++){
            for(int j = C_s; j < C_s+3; j++){
                if(lake[i][j] > maxE) maxE = lake[i][j];
            }
        }
        maxE-=D_s;
        for(int i = R_s; i < R_s+3; i++){
            for(int j = C_s; j < C_s+3; j++){
                if(lake[i][j] > maxE) lake[i][j] = maxE;
            }
        }
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