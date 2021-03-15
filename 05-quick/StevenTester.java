import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class StevenTester {
    public static void main(String[] args) {
        // int [] dataRandom = new int[]{2,3,3,11,11,5,7,2};// size 8
        // int [] dataBackwards =new int[]{9,8,7,6,5,4,3,2};
        // int [] dataSorted =new int[]{1,2,3,4,5,6,7,8};
        // int [] dataBig = new int[]{999,992,991,2,3,9,10,0,5,7,2,992,991,999};
        // // System.out.println(Arrays.toString(new int[]{0,1,2,3,4,5,6,7}));
        // // System.out.println(Quick.partition(dataRandom,0, 7));
        // // System.out.println(Arrays.toString(dataRandom));
        // // System.out.println(partitionCheck(dataBackwards));
        // // System.out.println(partitionCheck(dataRandom));
        // // System.out.println(partitionCheck(dataSorted));
        // System.out.println(partitionCheck(dataBig));
        // int[] test = arrGen(100, "random", 100);
        // System.out.println(Arrays.toString(test));
        int[] ary  = {2, 10, 15, 23, 0,  5};
        int[] select = arrGen(100, "sorted", 100);
        System.out.println(selectCheck(select));
    }
    public static int[] arrGen(int size, String type, int bound){
        Random gen = new Random();
        // bound = 10000; //by deafult element bound is 10e4
        int [] arr  = new int[size];
        for(int i = 0; i < size; i++){
            if(type.equals("binary")) arr[i] = gen.nextInt(2);
            else arr[i] = gen.nextInt(bound+1);
        }
        if(type.equals("reversed")){
            int[] arrDesc = Arrays.stream(arr).boxed()
                            .sorted(Collections.reverseOrder())
                            .mapToInt(Integer::intValue)
                            .toArray();
            arr = arrDesc;
        }
        if(type.equals("sorted")){
            Arrays.sort(arr);
        }
        return arr;
    }
    public static boolean selectCheck(int arr[]){
        int [] copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        for(int i = 0; i < arr.length; i++){
            if(!(copy[i] == Quick.quickselect(arr, i))){
                System.out.println("fail");
                System.out.println(Arrays.toString(arr));
                return false;
            }
        }
        return true;
    }
    public static boolean partitionCheck(int arr[]){
        int pivot = Quick.partition(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            if(i < pivot){
                if(!(arr[i] <= arr[pivot])){
                    System.out.println("failure" + "\n" + Arrays.toString(arr));
                    return false;
                }
            }
            if(i >= pivot){
                if(!(arr[i]>=arr[pivot])){
                    System.out.println("failure" + "\n" + Arrays.toString(arr));
                    return false;
                }
            }
        }
        return true;
    }
}
