package c1.syntax_and_structure.m2.variables;

public class CreatingVariables {

    public static void main(String[] args) {

        //Gross Pay Calculator

        //1. Get the number of hours worked
        int hours = 40; // we have to declare the data type in a variable

        //2. Get the hourly pay rate
        double payRate = 25.50;

        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4. Display result
        System.out.println("Gross pay: " + grossPay);
    }

}
