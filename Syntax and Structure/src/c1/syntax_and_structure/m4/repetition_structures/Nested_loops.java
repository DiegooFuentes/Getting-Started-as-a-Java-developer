package c1.syntax_and_structure.m4.repetition_structures;

import java.util.Scanner;

public class Nested_loops {
    public static void main(String[] args) {

        /*
        * NESTED LOOPS:
        * Find the average of each student's test scores
        * */

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTest = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for (int i = 0; 0 < numberOfStudents; i++){

            double total = 0;

            //Process a student's test scores
            for (int j = 0; j < numberOfTest; j++){
                System.out.println("Enter the score for the Test #" + (j + 1));
                double score = scanner.nextDouble();
                total = total + score;

            }

            double average = total/numberOfTest;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
