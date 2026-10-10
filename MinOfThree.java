// This project was created for me to practice definitions & logical operators inside of Java
// Very basic code that checks which of the three numbers is the smallest

import java.util.Scanner;
public class MinOfThree
{
    public static int minValue(int num1, int num2, int num3)
    {
        if (num1 < num2 && num1 < num3)
        {
            return num1;
        }
        else if (num2 < num1 && num2 < num3)
        {
            return num2;
        }
        else
        {
            return num3;
        }
    }
    public static void main(String[] args)
    {
        try (Scanner keyboard = new Scanner(System.in))
        {
            System.out.print("Choose the first number: ");
            int number1 = keyboard.nextInt();
            System.out.print("Choose the second number: ");
            int number2 = keyboard.nextInt();
            System.out.print("Choose the third number: ");
            int number3 = keyboard.nextInt();
            int minNumber = minValue(number1, number2, number3);
            System.out.println();
            System.out.println("The minimum value is " + minNumber + ".");
        }
    }
}
