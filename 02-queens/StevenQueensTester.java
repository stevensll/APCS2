public class StevenQueensTester{
    public static void main(String[] args) {
        int s = 8;
        QueensBoard my_board = new QueensBoard(s);
        for(int i = 0; i < s; i++){
            for(int  j = 0; j < s; j++){
                my_board.AddQueen(j,i);
                System.out.println(my_board.debugToString());
            }
        }
        System.out.println(my_board);
        System.out.println(my_board.debugToString());

    }

}