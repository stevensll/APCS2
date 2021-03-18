import java.util.Arrays;

public class Merge{
    public static void mergesort(int[]data){
        mergesort(data, 0, data.length-1);
    }
    public static void mergesort(int [] data, int  lo, int hi){

    }
    //IT IS ASSUMED THAT THE INPUT ARRAYS ARE SORTED AND THAT THE LEFT ALWAYS HAS >= ELEMENTS THAN RIGHT.
    public static void merge(int[] newData, int[] oldData, int lo, int hi){
        // we will define the right side start as the lo + hi + / 2 + 1
        // [ 1 5 7 ] [ 2 4 6 ]  right starts at 2. [1 5 7] [ 2 4 ] right starts at 2. 
        int leftCounter = lo;
        int rightCounter = (lo + hi) / 2 + 1;
        for(int i = lo; i <= hi; i++){
            // add leftside elements; if right is all used, just take care of left
            if(rightCounter == hi+1){
                newData[i] = oldData[leftCounter];
                leftCounter++;
            } else if(leftCounter == (lo + hi) / 2 + 1){
                newData[i] = oldData[rightCounter];
                rightCounter++;
            } else if(oldData[leftCounter] <= oldData[rightCounter]){ 
                newData[i] = oldData[leftCounter];
                leftCounter++;
            } else if(oldData[rightCounter] < oldData[leftCounter]){ 
                newData[i] = oldData[rightCounter];
                rightCounter++;
            }
            // System.out.println(Arrays.toString(newData));
            // System.out.println(leftCounter + " " + rightCounter);
        }
    }
}