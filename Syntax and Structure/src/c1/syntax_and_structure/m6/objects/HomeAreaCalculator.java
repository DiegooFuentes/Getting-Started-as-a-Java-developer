package c1.syntax_and_structure.m6.objects;
/*
* Write a class that creates instances o the 'rectangle' class to find the
* total area of two rooms in a house.
* */
public class HomeAreaCalculator {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle(); // Using constructor with no parameter
        room1.setLength(50); //Calling setter
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea(); // Calling method

        Rectangle room2 = new Rectangle(30,75); //Using constructor with parameters
        double areaOfRoom2 = room2.calculateArea();

    }
}
