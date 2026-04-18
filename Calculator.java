import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b; }

    public static double subtract(double a, double b) {
        return a - b; }

    public static double multiply(double a, double b) {
        return a * b; }

    public static double divide(double a, double b) {
        return a / b; }

    public static double power(double a, double b) {
        return Math.pow(a, b); }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char again = 'y';

        while (again == 'y' || again == 'Y') {

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter operation (+, -, *, /, ^): ");
            char op = input.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (op) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!"); // handle division by zero
                        valid = false; 
                        break;
                    }
                    result = divide(num1, num2);
                    break;
                case '^':
                    result = power(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    valid = false; 
            }

            if (valid) {
                System.out.println("Result = " + result); //  display result if operation was valid
            }

            System.out.print("Do you want to calculate again? (y/n): "); // prompt user to continue 
            again = input.next().charAt(0); 
        }

        System.out.println("Calculator closed.");
        input.close();
    }
}