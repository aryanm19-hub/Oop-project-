// CalculatorApp.java
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;

        while (true) {
            // Display menu
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator... Goodbye!");
                break;
            }

            // Get input from user
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            // Create Calculator object
            Calculator calc = new Calculator(num1, num2);

            // Perform the selected operation
            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add());
                    break;
                case 2:
                    System.out.println("Result: " + calc.subtract());
                    break;
                case 3:
                    System.out.println("Result: " + calc.multiply());
                    break;
                case 4:
                    System.out.println("Result: " + calc.divide());
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close(); // Close scanner to prevent resource leak
    }
}
