package c1.syntax_and_structure.m7.text_processing;

public class TextProcessor {
    public static void main(String[] args) {
        countWord("I love Java");
        reverseString("stop");
    }

    /**
    * Splits a String into an array by tokenizing it.
    * Count words and prints them
    * @param text Full string to be split
    * */
    public static void countWord(String text){

        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for(int i =0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

    // Prints a String in reverse order
    public static void reverseString(String text){
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
