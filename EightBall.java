import java.util.Scanner;
import java.util.Random;
public class EightBall {
    public static void main(String[] args)
    {
        String advice;
        try (Scanner keyboard = new Scanner(System.in))
        {
            Random d20 = new Random();
            int answer = d20.nextInt(20);
            if (answer == 1)
            {
                advice = "My sources say no";
            }
            else if (answer == 2)
            {
                advice = "My reply is no";
            }
            else if (answer == 3)
            {
                advice = "Very doubtful";
            }
            else if (answer == 4)
            {
                advice = "Outlook not so good";
            }
            else if (answer == 5)
            {
                advice = "Don't count on it";
            }
            else if (answer == 6)
            {
                advice = "Better not tell you now";
            }
            else if (answer == 7)
            {
                advice = "Cannot predict now";
            }
            else if (answer == 8)
            {
                advice = "Ask again later";
            }
            else if (answer == 9)
            {
                advice = "Concentrate and ask again";
            }
            else if (answer == 10)
            {
                advice = "Reply hazy, try again";
            }
            else if (answer == 11)
            {
                advice = "Outlook good";
            }
            else if (answer == 12)
            {
                advice = "You may rely on it";
            }
            else if (answer == 13)
            {
                advice = "Most likely";
            }
            else if (answer == 14)
            {
                advice = "Signs point to yes";
            }
            else if (answer == 15)
            {
                advice = "As I see it, yes";
            }
            else if (answer == 16)
            {
                advice = "Yes";
            }
            else if (answer == 17)
            {
                advice = "It is decidedly so";
            }
            else if (answer == 18)
            {
                advice = "It is certain";
            }
            else if (answer == 19)
            {
                advice = "Without a doubt";
            }
            else
            {
                advice = "Yes, Definitely";
            }
            System.out.println("WELCOME TO THE MAGIC EIGHT BALL SIMULATOR 1.0!!");
            System.out.println("Full of sage advice for those too cheap to buy an actual Magic Eight Ball!");
            System.out.println();
            System.out.println("I see that you have traveled far to get here.");
            System.out.print("Please enter your question: ");
            String user_question = keyboard.nextLine();
            System.out.println('"' + user_question + '"' + " . . . " + "let me see");
            System.out.println(advice);
        }
    }
}