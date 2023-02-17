package c1.syntax_and_structure.m3.decision_structures;

import java.util.Scanner;

/*
* IF-ELSE-IF
* Display the letter grade for a student based on their test score.
* */
public class If_else_if_statement {
    public static void main(String[] args) {
        //TEST SCORES
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //Determine the letter grade (A,B,D,E,F)
        char grade;
        if(score < 60){
            grade = 'F';
        }
        else if (score < 70) {
            grade = 'D';
        }
        else if (score < 80) {
            grade = 'C';
        }
        else if (score < 90){
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
