package c1.syntax_and_structure.m3.decision_structures.switchs;

import java.util.Scanner;

public class Multiple_statements_in_switch_expressions {
    public static void main(String[] args) {

        float firstNumber = 2;
        float secondNumber = 8;
        System.out.println("We have 2, and 8. Enter + or - to do the math.");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();

        float result = switch (operation){
            case "+" -> {
                System.out.println("Adding...");
                yield firstNumber + secondNumber;
            }
            case "-" -> {
                System.out.println("Subtracting...");
                yield firstNumber - secondNumber;
            }
            default -> {
                throw new IllegalStateException("Invalid character");
            }
        };

        System.out.println(result);
    }
}
