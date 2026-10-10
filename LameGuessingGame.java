// Project created for practicing if, else if, else statements, as well as Random module.
// Basic number guessing game, tells user if they guessed too low, too high, or correctly.

import java.util.Scanner;
import java.util.Random;
public class LameGuessingGame {
    public static void main(String[] args)
    {
        try (Scanner keyboard = new Scanner(System.in))
        {
            Random random = new Random();
            int number = random.nextInt(10);
            System.out.print("Guess the number (1-10) ");
            int guess = keyboard.nextInt();
            if (number == guess)
            {
                System.out.println("Congratulations!");
                System.out.println("You guessed correctly!");
                
            }
            else if (number > guess)
            {
                System.out.println("Too low!");
                System.out.println("Good try.");
            }
            else
            {
                System.out.println("Too high!");
                System.out.println("Good try.");
            }
            System.out.println("Thanks for playing this lame game.");
        }
    }
}
