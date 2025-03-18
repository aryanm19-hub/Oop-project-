// Calculator.java
import java.util.Scanner;

// Class Definition
class Calculator {
    private double num1, num2; // Encapsulation (Private variables)

    // Constructor
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method for Addition
    public double add() {
        return num1 + num2;
    }

    // Method for Subtraction
    public double subtract() {
        return num1 - num2;
    }

    // Method for Multiplication
    public double multiply() {
        return num1 * num2;
    }

    // Method for Division with Exception Handling
    public double divide() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return "Not a Number"
        }
        return num1 / num2;
    }
}
