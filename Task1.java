import java.util.Scanner;
 
public class Task1 {
 
    // Function that implements the number game
    public static void
    NumberGame()
    {
        Scanner sc = new Scanner(System.in);
 
        // Generate the numbers
        int number = 1 + (int)(100* Math.random());
 
        // Given M trials
        int M = 5,i,guess;
 
        System.out.println(
            "A number is chosen" + " between 1 to 100." + "Guess the number"+ " within 4 trials.");
 
        // Iterate over M Trials
        for (i = 0; i < M; i++) {
            System.out.println(
                "Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess && i != M - 1) {
                System.out.println( "The number is "+ "greater than " + guess);
            }
            else if (number < guess && i != M - 1) {
                System.out.println( "The number is" + " less than " + guess);
            }
        }
 
        if (i == M) {
            System.out.println("You have exhausted" + " M trials.");
             System.out.println("The number was " + number);
        }
    }
    // Driver Code
    public static void
    main(String arg[])
    {
        NumberGame();
    }
}