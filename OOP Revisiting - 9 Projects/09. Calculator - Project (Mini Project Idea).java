//it23017
import java.util.Scanner;

class CalculatorLogic {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            return Double.NaN; 
        }
        return a / b;
    }
}

public class CalculatorApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorLogic calculator = new CalculatorLogic();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Select an operation: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                isRunning = false;
                System.out.println("Exiting calculator.");
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid operation. Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    break;
                case 4:
                    result = calculator.divide(num1, num2);
                    break;
            }

            if (Double.isNaN(result)) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                System.out.println("Result: " + result);
            }
        }
        
        scanner.close();
    }
}
