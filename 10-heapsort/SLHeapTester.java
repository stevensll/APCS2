import java.util.Arrays;

public class SLHeapTester {
    public static void main(String[] args) {
        int[] test = new int[]{1,7,5,3,9,10,4};
        System.out.println(Arrays.toString(test));
        MyHeap.pushDown(test, test.length, 0);
        System.out.println(Arrays.toString(test));
    }
}
