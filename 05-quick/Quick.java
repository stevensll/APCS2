import java.util.*;
public class Quick {
    public static int partition(int[]data ,int lo, int hi){
        Random gen = new Random();
        int pivot = gen.nextInt(hi-lo+1) + lo;
        //first move the pivot to the hi
        int temp = data[hi];
        data[hi] = data[pivot];
        data[pivot] = temp;
        pivot = hi;
        //use j to track when to increment as we loop through i
        int j = lo -1;
        boolean left = true;
        for(int i = lo; i < hi; i++){
            //new condition: if values are the same, 50/50 chance of swapping them.
            if(data[i] <= data[pivot]) {
                if(data[i] == data[pivot]&&left){
                    left = false;
                } else {
                    left = true;
                    j++;
                    int swapTemp = data[j];
                    data[j] = data[i];
                    data[i] = swapTemp;    
                }
            }
        }
        // at the hi of our loop, we swap pivot and data[j+1]
        int lastSwap = data[j+1];
        data[j+1] = data[pivot];
        data[pivot] = lastSwap;
        pivot = j+1;
        return pivot;
    }
    
    /**return the value that is the kth smallest value of the array.
    *@param data must have a length > 0
    *@param k is 0 to data.length-1 inclusive
    *@postcondition The array can be modified. (If we did not want to modify the array, we could make a copy before we lo the process)
    */
    public static int quickselect(int []data, int k){
        int left = 0;
        int right = data.length-1; 
        while(left<=right){
            int pivot = partition(data,left,right);
            /*after partitioning our data, we check where k is relative to our pivot.
            then we partition the specific side of the modified array and repeat until
            we arrive at a point where the left side = right side (or we are looking at 1 element)
            */
            if (pivot == k) return data[k];
            else if (k > pivot) left = pivot+1;
            else if (k < pivot) right = pivot-1;
        }
        return -1;
    }

}
