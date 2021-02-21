public class StevenQueensTester{
    public static void main(String[] args) {
        QueensBoard my_board = new QueensBoard(5);
        my_board.AddQueen(2, 3);
        my_board.AddQueen(4, 4);
        my_board.AddQueen(3, 3);
        System.out.println(my_board);
        System.out.println(my_board.debugToString());
    }

}