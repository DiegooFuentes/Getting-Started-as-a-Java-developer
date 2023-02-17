package c1.syntax_and_structure.m3.decision_structures;

import java.util.Scanner;

public class Fall_Through_switch_expression {
    public static void main(String[] args) {
        //FALL-THROUGH SWITCH EXPRESSIONS

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade){
            case "A" , "B" -> "Excellent job!"; //Fall_through
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        System.out.println(grade);
    }
}
