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

}