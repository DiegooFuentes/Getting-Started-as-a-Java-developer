package c1.syntax_and_structure.m3.decision_structures;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class If_else_statement {
    public static void main(String[] args) {

        //Initialize known values
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour fot he bonus earners
        if(sales >= quota){
            System.out.println("Congrats! You've met your quota.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }

    }
}
