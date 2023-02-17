package c1.syntax_and_structure.m3.decision_structures;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
       If Statement.
       All salespeople get a payment of $1000 a week.
       Salespeople who exceed 10 sales get an additional bonus of $250.
        */
public class If_statement {
    public static void main(String[] args) {
        // SALARY CALCULATOR

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values fo the unknown
        System.out.println("Hoe many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners

        if(sales > quota){ //sales greater than quota
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);

    }
}
