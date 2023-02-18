package c1.syntax_and_structure.m4.repetition_structures;

import java.util.Scanner;

public class Break_statement {
    public static void main(String[] args) {

        /*
        * BREAK STATEMENT
        * Search a String to determine if it contains the letter 'A'.
        * */

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for (int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }


    }
}
