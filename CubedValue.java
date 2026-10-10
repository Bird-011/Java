// Designed for practicing definitions and rounding.
// Code takes user input, then cubes the number inputted.
// Rounds to 9 decimal places, removes trailing zeros.

import java.text.DecimalFormat;
import java.util.Scanner;
public class CubedValue 
{
    public static double cubed(double x)
    {
        return x * x * x;
    }
    public static void main(String[] args)
    {
        try (Scanner keyboard = new Scanner(System.in))
        {
            System.out.print("What number would you like cubed?: ");
            double num = keyboard.nextDouble();
            double numCubed = cubed(num);
            DecimalFormat removeZero = new DecimalFormat("0.#########");
            String result = removeZero.format(numCubed);
            System.out.println();
            System.out.println("The cubed number is " + result + " (Rounded 9 digits)");
        }
    }
}
