import java.util.Scanner;

public class Braydon 
{
    public static void main(String[] args) 
    {
        try (Scanner keyboard = new Scanner(System.in))
        {
            System.out.println();
            System.out.print("Is Braydon annoying someone? (y/n): ");
            String annoy = keyboard.next();
            if (annoy.equals("y"))
            {
                System.out.print("Who will it be?: ");
                String person = keyboard.next();
                System.out.println();
                System.out.println("Braydon is annoying " + person + " right now.");
            }
            else
            {
                System.out.println();
                System.out.println("Braydon is not annoying someone right now.");
            }
            
        }
        
    }
}