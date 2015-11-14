import java.util.Scanner;

public class project6_4
{
	public static void main(String[] args)
	{
		/* Instantiate variables/objects */

		// Scanner
		Scanner scanner = new Scanner(System.in);

		// Dice
		Dice die1 = new Dice();
		Dice die2 = new Dice();

		// Wager/Roll counter
		int wager, maxMoney;
		int maxMoneyRolls = 0;
		int rollCounter = 0;

		/* Get input from user */

		// Wager
		System.out.print("Enter wager in dollars (Int): ");
		wager = scanner.nextInt();

		/* Calculations */

		// Initial wager is the max currently
		maxMoney = wager;

		// Loop while there is still money
		while(wager > 0)
		{
			// Increase number of rolls by one
			rollCounter++;

			// Roll dice
			die1.roll();
			die2.roll();

			// Check if added dice equals 7
			if(die1.getSide() + die2.getSide() == 7)
			{
				// Add $4 to wager
				wager += 4;
			} else {
				// Subtract $1 from wager
				wager -= 1;
			}

			// Check if wager is the max amount of money
			if(wager > maxMoney)
			{
				// Set new maxMoney to current wager
				maxMoney = wager;

				// Set maxMoneyRolls to current rolls
				maxMoneyRolls = rollCounter;
			}
		}

		/* Print results */

		// Broke rolls
		System.out.print("You are broke after " + rollCounter + " rolls.\n");

		// Max money
		System.out.print("You should have quit after " + maxMoneyRolls + " rolls when you had $" + maxMoney + "\n");
	}
}
