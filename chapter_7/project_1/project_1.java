import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class project_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a new scanner object, "scanner"
		Random random = new Random(); // Create a new random object, "random"

		int guess = -1; // Initial guess to avoid errors
		int randomNum = random.nextInt(100); // Max random int is 100

		// Loop until guess is correct
		while(guess != randomNum) {
			// Ask user for input
			System.out.print("Input your guess between 0 and 100.  Numbers will be abs'd (int): ");

			try {
				// abs input to make it positive
				guess = (int)Math.abs(scanner.nextDouble());

				// Tell user where guess is relating to number
				if(guess > 100 || guess < 0)
					System.out.print(";_; Please input integers between 0 and 100.\n");
				else if(guess > randomNum)
					System.out.print(";_; Your guess was too large. Try again\n");
				else if(guess < randomNum)
					System.out.print(";_; Your guess was too small.  Try again\n");
			} catch(InputMismatchException e) {
				System.out.print(";_; Please enter an int\n");
			}
		}

		System.out.print(":D Good job!  You got the number!\n");
	}
}
