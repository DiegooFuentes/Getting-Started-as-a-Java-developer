package c1.syntax_and_structure.m2.variables;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args) {

        //Fill in the blanks Challenge

        //Opening
        System.out.println("Let's create a story!");

        //Opening scanner
        Scanner scanner = new Scanner(System.in);

        //Getting the adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        //Getting the season
        System.out.println("Enter a season of the year");
        String season = scanner.next();

        //Getting the number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //Showing the result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
