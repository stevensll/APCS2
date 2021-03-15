import java.util.*;
public class Quick {
    public static int partition(int[]data ,int lo, int hi){
        Random gen = new Random();
        int pivot = gen.nextInt(hi-lo+1) + lo;
        // System.out.println(pivot);
        //first move the pivot to the hi
        int temp = data[hi];
        data[hi] = data[pivot];
        data[pivot] = temp;
        pivot = hi;
        // System.out.println(Arrays.toString(data));
        //use j to track when to increment as we loop through i
        int j = lo -1;
        for(int i = lo; i < hi; i++){
            /*if our current value is less than our pivot, we increment j and swap data[j] and data[i]
            this makes sure that we are always moving elements towards the right if they're less than our pivot
            */
            if(data[i] <= data[pivot]) {
                j++;
                int swapTemp = data[j];
                data[j] = data[i];
                data[i] = swapTemp;
            }
            // System.out.println(j);

        }
        // at the hi of our loop, we swap pivot and data[j+1]
        int lastSwap = data[j+1];
        data[j+1] = data[pivot];
        data[pivot] = lastSwap;
        pivot = j+1;
        // System.out.println(Arrays.toString(data));
        return pivot;
    }
    
    /**return the value that is the kth smallest value of the array.
    *@param data must have a length > 0
    *@param k is 0 to data.length-1 inclusive
    *@postcondition The array can be modified. (If we did not want to modify the array, we could make a copy before we lo the process)
    */
    public static int quickselect(int []data, int k){ 
        return k;
    }
}
