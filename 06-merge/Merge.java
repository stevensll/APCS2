import java.util.Arrays;

public class Merge{
    public static void mergesort(int[]data){
        int [] temp  = new int[data.length];
        mergesort(data, temp, 0, data.length-1);
    }
    public static void mergesort(int [] newData, int [] temp, int  lo, int hi){
        // base case: when we get to lo = hi, we don't do anything. stack goes back up and merges
        if(lo < hi){
            int mid = (lo+hi) / 2;
            mergesort(newData, temp, lo, mid);
            mergesort(newData, temp, mid + 1, hi);
            merge(newData, temp, lo, hi);
            // System.out.println(Arrays.toString(newData));
        }
        // merge(newData, temp, lo, hi);


    }
    //IT IS ASSUMED THAT THE INPUT ARRAYS ARE SORTED AND THAT THE LEFT ALWAYS HAS >= ELEMENTS THAN RIGHT.
    public static void merge(int[] data, int[] temp, int lo, int hi){
        // we will define the right side start as the lo + hi / 2 + 1
        int leftCounter = lo;
        int rightCounter = (lo + hi) / 2 + 1;
        for(int i = lo; i <= hi; i++){
            // add leftside elements; if right is all used, just take care of left
            if(rightCounter == hi+1){
                temp[i] = data[leftCounter];
                leftCounter++;
            } else if(leftCounter == (lo + hi) / 2 + 1){
                temp[i] = data[rightCounter];
                rightCounter++;
            } else if(data[leftCounter] <= data[rightCounter]){ 
                temp[i] = data[leftCounter];
                leftCounter++;
            } else if(data[rightCounter] < data[leftCounter]){ 
                temp[i] = data[rightCounter];
                rightCounter++;
            }
        }
        for(int i = lo; i <=hi; i++){
            data[i] = temp[i];
        }
        // System.out.println(Arrays.toString(newData));
    }
}