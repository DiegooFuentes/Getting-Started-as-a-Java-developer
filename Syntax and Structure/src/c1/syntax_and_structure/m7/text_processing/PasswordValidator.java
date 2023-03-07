package c1.syntax_and_structure.m7.text_processing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String pass = getPass();
        boolean correct = verifyPass(pass);
        scanner.close();

        if(correct){
            System.out.println("New password set correctly");
        }else{
            System.out.println("We could not set your new password. Try again");
        }
    }

    public static boolean verifyPass(String pass){
        boolean isUpperCase = false;
        for(int i= 0; i < pass.length(); i++){

            char letter = pass.charAt(i);
            isUpperCase = Character.isUpperCase(letter);
            if (isUpperCase) {
                break;
            }
        }

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(pass);
        boolean isStringContainsSpecialCharacter = matcher.find();

        boolean oldPass;
        if("ABC_1234".equals(pass)) {
            oldPass = false;
        } else{
            oldPass = true;
        }

        String name = "johndoe";
        boolean nameInPass;
        if(pass.contains(name)){
            nameInPass = false;
        }else {
            nameInPass = true;
        }

        boolean valid = true;
        if (isUpperCase && isStringContainsSpecialCharacter && oldPass && nameInPass){
            valid = true;
        }else{
            valid = false;
        }

        return valid;

    }

    public static String getPass(){

        System.out.println("Enter a new password");
        String pass = scanner.next();
        while(pass.length() <=  8){

            System.out.println("Invalid entry. You must enter a password longer than 8 digits. Try again");
            pass = scanner.next(); //Contador
        }
        return pass;
    }
}
