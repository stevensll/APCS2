public class Recursion{
    public static String reverse (String s){
        if(s.length() < 1) return s;
        else return reverse(s.substring(1)) + s.charAt(0);
    }

    /*
    *@param length how long the words must be
    *param word the variable to store the partial solution (should start at "")
    *@return the number of words that have no adjacent matching letters using the letters a-z.
    *Repetition allowed except when letters are adjacent.
    */
    public static long countNoDoubleLetterWords(int length,String word){
        long count = 0;
        if (length  == 0) {
            //System.out.println(word);
            return 1;
        }
        else{
            for(char i = 'a'; i <= 'z'; i++){
                if(word.length() == 0 || word.charAt(word.length()-1) != i){
                    count+=countNoDoubleLetterWords(length-1, word+i);
                }
            }
        }
        return count;
    }
    /*
    *@param n any non-negative value you want to take the sqrt of
    *@return the approximate sqrt of n within a tolerance of 0.001%
    */
    public static double sqrt(double n){
        return sqrt(n, n/2);
    }
    public static double sqrt(double n, double guess){
        if(n == 0) return 0.0;
        //0.001% error check statement
        if(Math.abs((n - guess * guess)/(guess*guess) )<= 0.00001) return guess;
        else{
            double newGuess = (n / guess + guess) / 2;
            //ystem.out.println(newGuess);
            return(sqrt(n, newGuess));
        }
    }

}