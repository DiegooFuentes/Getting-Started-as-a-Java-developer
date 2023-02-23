package c1.syntax_and_structure.m5.methods;

import java.util.Scanner;

/*
* PASSING ARGUMENTS TO METHODS
* Write an 'instant credit check' program that approves
* anyone who makes more than $25,000 and has a credit score
* of 700 or better. Reject all others.
* */
public class Passing_arguments_to_methods {
    public static void main(String[] args) {

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        isUserQualified(creditScore,salary);
        //Check if the user is qualified
    }

    public static void isUserQualified(int creditScore,double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(salary >= requiredSalary && creditScore >= requiredCreditScore){
            System.out.println("Congrats! You're approved.");
        }
        else{
            System.out.println("We are Sorry :( You've been declined.");

        }
    }
}
