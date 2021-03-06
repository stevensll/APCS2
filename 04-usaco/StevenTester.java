import java.io.FileNotFoundException;

public class StevenTester {
    public static void main(String[] args) {
        try{
            // System.out.println(USACO.bronze("lake1input.txt"));
            System.out.println(USACO.silver("cowPath1.input"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
