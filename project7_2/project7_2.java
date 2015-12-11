import java.util.Scanner;
import java.util.InputMismatchException;

public class project7_2
{
	public static void main(String[] args)
	{
		// Create a new scanner object named "scanner"
		Scanner scanner = new Scanner(System.in);

		int num = -1; // Initial number to guess to avoid errors
		int guess = -1; // Initial guess to avoid errors
		int guessCounter = 0;
		int high = 100; // Initial high
		int low = 0; // Initial low

		// Ask the user for input
		System.out.print("Input a number for the computer to guess between 0 and 100.  Numbers will be abs'd (int): ");

		// Loop this until the number changes
		while(num == -1)
		{
			try
			{
				// Make the number positive if not
				num = (int)Math.abs(scanner.nextDouble());
				if(num > 100 || num < 0)
					System.out.print(";_; Please input an integer between 0 and 100.\n");
			}
			catch(InputMismatchException e)
			{
				System.out.print(";_; Please enter an int\n");
			}
		}

		// Loop while the guess is wrong
		while(guess != num)
		{
			// Get midpoint of high and low
			guess = (high + low) / 2;

			// Print the guess
			System.out.print("Guess: " + guess + "\n");

			// Check if the guess is higher or lower than the actual number
			if(guess > num) high = guess;
			else if(guess < num) low = guess;

			// Increment the counter
			guessCounter++;
		}

		System.out.print("The computer had to guess " + guessCounter + " times until it got the right answer.\n");
	}
}
