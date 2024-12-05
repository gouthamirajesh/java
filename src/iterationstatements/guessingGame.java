package iterationstatements;

import java.util.InputMismatchException;
import java.util.Scanner;

public class guessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int secretNumber = (int) (Math.random() * 100) + 1;

        int guess;
        boolean guessedCorrectly = false;

        // Loop until user guesses the correct number
        while (!guessedCorrectly) {
            System.out.print("Guess a number between 1 and 100: ");

            // Get user input and handle potential non-numeric input
            try {
                guess = scanner.nextInt();
                scanner.nextLine(); // Consume remaining newline character (optional)

                // Validate guess range
                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid guess. Please enter a number between 1 and 100.");
                    continue;
                }

                // Check guess and provide feedback
                if (guess == secretNumber) {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number correctly.");
                } else {
                    if (guess < secretNumber) {
                        System.out.println("Too low, try again!");
                    } else {
                        System.out.println("Too high, try again!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the buffer after invalid input
            }
        }

        scanner.close();
    }
}