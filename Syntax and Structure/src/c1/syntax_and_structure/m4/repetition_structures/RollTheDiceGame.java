package c1.syntax_and_structure.m4.repetition_structures;

import java.util.Random;

public class RollTheDiceGame {
    public static void main(String[] args) {

        int rolls = 0;
        int sum = 0;
        int spaces = 20;

        while (rolls < 5){
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            sum = sum + die;
            if (sum<20){
                System.out.println("You rolled a " + die + ". You are in the position " + sum + ". You have " + (spaces - sum) + " spaces left to win.");
                rolls = rolls + 1;
            }else if (sum > 20) {
                System.out.println("You rolled a " + die + ". You are in the position " + sum + ". You lost.");
                break;

            }else if(sum == 20) {
                System.out.println("You rolled a " + die + ". You are in the position " + sum + ". You won!");
                break;
            }
        }
        if (rolls == 5){
            System.out.println("You don't have more rolls");
        }



    }
}
