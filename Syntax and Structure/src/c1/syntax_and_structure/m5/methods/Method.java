package c1.syntax_and_structure.m5.methods;

import java.util.Scanner;

public class Method {
    /*
    * OUR FIRST METHOD
    * Write a method that greets a user by name.
    * */
    public static void main(String[] args) {

        greetUser();
    }


    public static void greetUser(){
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hi there, " + name);
    }
}
