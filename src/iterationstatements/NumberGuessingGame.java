//Create a number guessing game where the program generates a random number between 1 and 100, and the user has to guess it.
// Provide feedback if the guess is too high or too low.
// Use a while loop to keep the game running until the user guesses the correct number.

package iterationstatements;

import java.util.Scanner;

public class NumberGuessingGame {

    public void meth()
    {
        //int i=1;
        Scanner sc= new Scanner(toString());
        System.out.println("enter your input: "+sc.next());  //40

        while (sc.nextInt()<=100)
        {

            if(sc.nextInt()>sc.nextInt())
            {
                System.out.println("your guess is high");
            }
            else if (sc.nextInt()<sc.nextInt())
            {
                System.out.println("your guess is low");
            }
            else if (sc.nextInt()==sc.nextInt())
            {
                System.out.println("your guess is correct!");
            }

            break;
        }

    }

    public static void main(String[] args) {

        new NumberGuessingGame().meth();

    }
}
