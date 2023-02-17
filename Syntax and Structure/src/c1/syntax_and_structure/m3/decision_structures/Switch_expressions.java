package c1.syntax_and_structure.m3.decision_structures;

import java.util.Scanner;

public class Switch_expressions {
    public static void main(String[] args) {

        //SWITCH EXPRESSIONS

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade){
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        System.out.println(grade);
    }
}
