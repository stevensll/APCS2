import java.io.FileNotFoundException;

public class StevenTester {
    public static void main(String[] args) {
        try{
            USACO.bronze("lake1input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
