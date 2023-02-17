package c1.syntax_and_structure.m2.variables;

import java.util.Scanner;

public class ModifyingVariables {
    public static void main(String[] args) {
        //Gross Pay Calculator

        //1. Get the number of hours worked
        int hours = 0; // initializing a variable with 0
        System.out.println("How many hours did your work?");

        Scanner scanner = new Scanner(System.in); // Scanner let the user input data to the program
        hours = scanner.nextInt();

        //2. Get the hourly pay rate
        double payRate = 0;
        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();  //choose the one that match the data type expected

        scanner.close(); // closing scanner so it doesn't waste memory, we don't need to read more input

        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4. Display result
        System.out.println("Gross pay: " + grossPay);
    }
}
