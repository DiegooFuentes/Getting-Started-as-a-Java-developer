package c1.syntax_and_structure.m3.decision_structures;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        //A game where the user has to choose the exact amount of change in order to reach 1 US$ dollar

        /*
        * Pennies = 1 cent
        * Nickels = 5 cents
        * Dimes = 10 cents
        * Quarters = 25 cents
        * */

        System.out.println("Welcome to 'Change for a Dollar'! Your goal is to enter enough change " +
                "to make exactly $1.00 with at least one of each type of coin");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of pennies:");
        double pennies = scanner.nextDouble();

        System.out.println("Enter your number of nickels:");
        double nickels = scanner.nextDouble();

        System.out.println("Enter your number of dimes:");
        double dimes = scanner.nextDouble();

        System.out.println("Enter your number of quarters:");
        double quarters = scanner.nextDouble();

        double total = pennies + nickels + dimes + quarters;

        System.out.println("Your total is $" + total);
    }
}
