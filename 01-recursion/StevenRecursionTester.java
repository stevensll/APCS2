public class StevenRecursionTester{
    public static void main(String[] args) {
        /*reverse() string test
        System.out.println(Recursion.reverse("hello"));
        System.out.println(Recursion.reverse("michael"));
        System.out.println(Recursion.reverse("12345"));
        System.out.println(Recursion.reverse("9#(01"));
        */
        // countNoDoubleLetterWords() test.
        for(int i = 0; i < 7; i++){
            if(Recursion.countNoDoubleLetterWords(i+1,"")!=26* Math.pow(25,i)) System.out.println("Error at length " + i);
            else System.out.println("Good at length " + i);
        }
        //


    }


}