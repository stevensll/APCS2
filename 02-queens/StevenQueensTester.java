public class StevenQueensTester{
    public static void main(String[] args) {
        int s = 12;
        QueenBoard my_board = new QueenBoard(s);
        System.out.println(my_board.countSolutions());
        System.out.println(my_board);
        // for(int i = 0; i < 14; i++){
        //     QueenBoard test = new QueenBoard(i);
        //     System.out.println("Board" +" " + i +": " + test.countSolutions());
        // }

        // for(int i = 0; i < 8; i++){
        //     QueensBoard test = new QueensBoard(i);
        //     System.out.println("Test" +i + test.solve());
        // } 
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