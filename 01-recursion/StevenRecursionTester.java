public class StevenRecursionTester{
    public static void main(String[] args) {
        /*reverse() string test
        System.out.println(Recursion.reverse("hello"));
        System.out.println(Recursion.reverse("michael"));
        System.out.println(Recursion.reverse("12345"));
        System.out.println(Recursion.reverse("9#(01"));
        */
        /* countNoDoubleLetterWords() test.
        for(int i = 0; i < 7; i++){
            if(Recursion.countNoDoubleLetterWords(i+1,"")!=26* Math.pow(25,i)) System.out.println("Error at length " + i);
            else System.out.println("Good at length " + i);
        }
        */
        //
        System.out.println(percentError(0.001, 3, Recursion.sqrt(9)));
        System.out.println(percentError(0.001, 100, Recursion.sqrt(10000)));
        System.out.println(percentError(0.001, Math.sqrt(2389), Recursion.sqrt(2389)));
        System.out.println(percentError(0.001, Math.sqrt(1), Recursion.sqrt(1)));
        System.out.println(percentError(0.001, Math.sqrt(0), Recursion.sqrt(0)));




    }
    public static boolean percentError(double percentage, double e, double a){
        if(e == a) return true;
        double error = Math.abs( (a - e) / e );
        return error <= percentage/100;
    }

}