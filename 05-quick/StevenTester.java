import java.util.Arrays;
public class StevenTester {
    public static void main(String[] args) {
        int [] dataRandom = new int[]{2,3,9,10,0,5,7,2};
        int [] dataBackwards =new int[]{9,8,7,6,5,4,3,2};
        int [] dataSorted =new int[]{1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(new int[]{0,1,2,3,4,5,6,7}));
        System.out.println(Preliminary.partition(dataSorted,0, 7));
    }
}
