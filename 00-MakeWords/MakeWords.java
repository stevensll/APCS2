public class MakeWords{
    public static void main(String[] args) {
        //printAllWords(4);
        printNoDoubleLetterWords(4, new char[] {'w','x','f'});
    }

    public static void printAllWords(int length){
        printAllWords(length, "");
    }
    
    public static void printAllWords(int length, String word){
        if(length == 0) System.out.println(word);
        else{
            for(int i = 97; i < 123; i++){
                printAllWords(length-1, word + (char)i);
            }
        }
    }
    public static void printNoDoubleLetterWords(int length,char[] letters){
        printNoDoubleLetterWords(length,"",letters);
      }
      
    public static void printNoDoubleLetterWords(int length,String word,char[]letters){
        if(length == 0) System.out.println(word);
        else{
            for(int i = 0; i < letters.length; i++){
                if(word.length() == 0 || word.charAt(word.length()-1) != letters[i]) {
                    printNoDoubleLetterWords(length-1, word + letters[i], letters);
                }
            }
        }
    }


}