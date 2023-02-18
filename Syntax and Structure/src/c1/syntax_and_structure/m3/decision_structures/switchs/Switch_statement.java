package c1.syntax_and_structure.m3.decision_structures.switchs;

import java.util.Locale;
import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        //Grade Message

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        switch (grade) { // The variable that we want to evaluate
            case "A":  // case to evaluate in relation to the variable given
                message = "Excellent job!";
                break; // we need to break the process, so it will stop here
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:  //Default case will handle anything that is not in other case
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);
    }
}
