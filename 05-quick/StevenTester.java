import java.util.Arrays;
public class StevenTester {
    public static void main(String[] args) {
        int [] data = new int[]{2,3,9,10,0,5,7,2};
        System.out.println(Arrays.toString(new int[]{0,1,2,3,4,5,6,7}));
        System.out.println(Preliminary.partition(data,0, 7));
    }
}
