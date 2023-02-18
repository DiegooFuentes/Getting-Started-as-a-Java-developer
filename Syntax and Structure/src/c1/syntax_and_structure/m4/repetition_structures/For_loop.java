package c1.syntax_and_structure.m4.repetition_structures;

import java.util.Scanner;

public class For_loop {

    public static void main(String[] args) {

        //Get number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total = 0;

        //Create loop to iterate through all the items and accumulate the costs
        for (int i = 0; i < quantity; i++){
            System.out.println("Enter the price of the item:");
            double price = scanner.nextDouble(); //The variable price only lives inside the loop, so it is restarted everytime the loop runs.

            total = total + price;
        }

        scanner.close();
        System.out.println("The total is: $" + total);
    }
}
