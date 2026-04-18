import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I chose a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {

            System.out.print("Enter your guess: ");

            try {
                int guess = scanner.nextInt();
                attempts++;

                if (guess > secretNumber) {
                    System.out.println("Too high!");
                } else if (guess < secretNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Correct! You won in " + attempts + " attempts.");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Game over! The number was: " + secretNumber);
        }

        scanner.close();
    }
}
