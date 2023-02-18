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
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number of pennies:");
        double count = scanner.nextDouble();
        penny  = penny * count;

        System.out.println("Enter your number of nickels:");
        double count2 = scanner.nextDouble();
        nickel = nickel * count2;

        System.out.println("Enter your number of dimes:");
        double count3 = scanner.nextDouble();
        dime = dime * count3;

        System.out.println("Enter your number of quarters:");
        double count4 = scanner.nextDouble();
        quarter = quarter * count4;

        double total = penny + nickel + dime + quarter;

        System.out.println("Your total is $" + total);

        if(total == 1){
            System.out.println("You got it right!");

        } else if (total < 1) {
            System.out.println("You need " + (1 - total) + " to get 1 dollar");

        }else{
            System.out.println("You pass by " + (total - 1) + " to get 1 dollar");
        }



    }
}
