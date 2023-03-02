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

        String[] words = text.split(" "); //split the string using the whitespace as a divider
        // split takes a delimiter which is what the string will be split on (whitespace)
        // returns an array of strings, which is stored in the array of string variables named words

        int numberOfWords = words.length; //Get the number of elements of the array (the number of words of the String)

        String message = String.format("Your text contains %d words", numberOfWords); //format allows us to
        // use placeholders (%d) within strings(%d is a placeholders for digits)(numberOfWords is the value of the placeholder)

        System.out.println(message);

        //We use a for loop to run through the array
        for(int i =0; i<numberOfWords; i++){
            System.out.println(words[i]); //Prints the array according to the index
        }
    }

    /**
    * Prints a String in reverse order
    * @param text string to reverse
    * */
    public static void reverseString(String text){
        for(int i = text.length() - 1; i >=  0; i--){ //.length use the amount of elements, not indices.
            //text.length - 1 because array indices begin with zero
            //i >= 0 because when we get to zero we get to the beginning of the word
            //i-- because we're counting backwards

            System.out.print(text.charAt(i)); //we use charAt, because strings are arrays of characters,
            // This will return the character at the index specified
        }
    }
}
