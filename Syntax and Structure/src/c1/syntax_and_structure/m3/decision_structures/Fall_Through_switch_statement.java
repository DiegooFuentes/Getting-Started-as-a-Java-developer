package c1.syntax_and_structure.m3.decision_structures;

import java.util.Scanner;

public class Fall_Through_switch_statement {
    public static void main(String[] args) {
        //Fall-Through in Switch Statements
        //Grade Message

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        //Fall-through will not stop until a break statement is reach.
        //It can be used when you want the same message.
        String message;
        switch (grade) {
            case "A":
            case "B":
                message = "Great job!";
            case "C":
                message = "Good job!";
                break;
            case  "D":
            case  "F":
                message = "You need to work a bit harder";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);
    }
}
