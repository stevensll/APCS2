public class StevenQueensTester{
    public static void main(String[] args) {
        int s = 8;
        QueensBoard my_board = new QueensBoard(s);
        my_board.solve();
        // for(int i = 0; i < s; i++){
        //     for(int  j = 0; j < s; j++){
        //         my_board.AddQueen(i,j);
        //         // System.out.println(my_board.debugToString());
        //     }
        // }
        // System.out.println(my_board);
        // System.out.println(my_board.debugToString());
        // my_board.removeQueen(0, 0);
        // System.out.println(my_board);
        // System.out.println(my_board.debugToString());
        // my_board.removeQueen(1, 2);
        // System.out.println(my_board);
        // System.out.println(my_board.debugToString());
        // for(int i = 0; i < s; i++){
        //     for(int  j = 0; j < s; j++){
        //         my_board.removeQueen(i,j);
        //          System.out.println(my_board.debugToString());
        //     }
        // }
        // System.out.println(my_board);

    }

}