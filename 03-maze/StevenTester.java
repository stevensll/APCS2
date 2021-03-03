import java.io.FileNotFoundException;

public class StevenTester {
    public static void main(String[] args) throws FileNotFoundException {
        // Maze test = new Maze("data.txt");
        // for(int i = 2; i < 15; i++){
        //     System.out.println(test.moveNext(7, i));
        // }
        // System.out.println(test.moveNext(8, 13));
        // test.moveBack(7, 12);
        // test.moveBack(7, 11);
        // System.out.println(test.solve());
        // System.out.println(test);
        Maze data1 = new Maze("data1.dat");
        System.out.println(data1.solve());

    }
    
}
