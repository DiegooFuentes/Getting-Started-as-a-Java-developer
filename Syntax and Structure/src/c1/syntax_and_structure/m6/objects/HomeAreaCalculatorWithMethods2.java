package c1.syntax_and_structure.m6.objects;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods2 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Rectangle kitchen = getRoom(); // we store the returned object in the variable
        Rectangle bathroom = getRoom();

        double area = calculateTotalArea(kitchen,bathroom);
        System.out.println("The total area is: " + area);

        scanner.close();
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom(){
        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length,width); // we don't need to store the object instance in a variable here, we'll
        // store it in the method call

    }
}