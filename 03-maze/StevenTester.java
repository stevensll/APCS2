import java.io.FileNotFoundException;

public class StevenTester {
    public static void main(String[] args) throws FileNotFoundException {
        Maze test = new Maze("maze1.txt");
        for(int i = 2; i < 15; i++){
            System.out.println(test.moveNext(7, i));
        }
        System.out.println(test.moveNext(8, 13));
        System.out.println(test.solve());
        System.out.println(test);
    }
    
}
