import java.util.Arrays;
import java.util.Random;

public class Preliminary{
    
      /**Modify the array such that:
       *1. A random index from start to end inclusive is chosen, the corresponding
       *   element is designated the pivot element.
       *2. all elements in range that are smaller than the pivot element are placed before the pivot element.
       *3. all elements in range that are larger than the pivot element are placed after the pivot element.
       *4. Only the indices from start to end inclusive are considered in range
       *@return the index of the final position of the pivot element.
       **/

    public static int partition( int [] data, int start, int end){
        Random gen = new Random();
        int pivot = gen.nextInt(end-start+1) + start;
        // System.out.println(pivot);
        //first move the pivot to the end
        int temp = data[end];
        data[end] = data[pivot];
        data[pivot] = temp;
        pivot = end;
        // System.out.println(Arrays.toString(data));
        //use j to track when to increment as we loop through i
        int j = start -1;
        for(int i = start; i < end; i++){
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
            // System.out.println(Arrays.toString(data));

        }
        // at the end of our loop, we swap pivot and data[j+1]
        int lastSwap = data[j+1];
        data[j+1] = data[pivot];
        data[pivot] = lastSwap;
        pivot = j+1;
        System.out.println(Arrays.toString(data));
        return pivot;
    }
}