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

        //Validate input, the program is not allow to accept overtime
        while(hoursWorked > maxHours){

            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble(); //Contador
        } //This will loop until the user enter a valid input in the hoursWorked scanner

        /*
        +*If your using variables within a condition of your loop, It's essential that the value of at least one
        +*of those variables has the possibility of being updated within the loop, therefore it could result
        **of the condition being always true, ending up in an infinite loop
        **/

        scanner.close();

        //calculate gross
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

    }
}
