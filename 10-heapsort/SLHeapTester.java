import java.util.Arrays;

public class SLHeapTester {
    public static void main(String[] args) {
        int[] test = new int[]{1,7,5,3,9,10,4};
        int[] emptyArray = new int[]{};
        int[] test2 = new int[]{1,1,1,1,1,1,1,1,1};
        int[] test3 = new int[]{1,2};
        int[] test4 = new int[]{1};

        System.out.println(Arrays.toString(test));
        // System.out.println(Arrays.toString(test2));
        // System.out.println(Arrays.toString(test3));
        // System.out.println(Arrays.toString(test4));
        // System.out.println(Arrays.toString(emptyArray));

        // MyHeap.pushDown(test, test.length, 0);
        MyHeap.buildHeap(test);
        System.out.println(Arrays.toString(test));
        MyHeap.remove(test, 7);
        MyHeap.remove(test, 6);

        // MyHeap.buildHeap(test2);
        // MyHeap.buildHeap(test3);
        // MyHeap.buildHeap(test4);
        // MyHeap.buildHeap(emptyArray);


        System.out.println(Arrays.toString(test));
        // System.out.println(Arrays.toString(test2));
        // System.out.println(Arrays.toString(test3));
        // System.out.println(Arrays.toString(test4));
        // System.out.println(Arrays.toString(emptyArray));

    }
}
