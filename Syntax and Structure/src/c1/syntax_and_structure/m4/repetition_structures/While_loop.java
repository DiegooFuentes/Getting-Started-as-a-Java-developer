package c1.syntax_and_structure.m4.repetition_structures;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {

        //GROSS PAY INPUT VALIDATOR

        //Initialize known variables
        int payRate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did the employee work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours){

            System.out.println("Invalid entry. Your hours must be between q and 40. Try again.");
            hoursWorked = scanner.nextDouble(); //Contador
        }

        scanner.close();

        //calculate gross
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

    }
}
