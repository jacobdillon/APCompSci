public class tester
{
	public static void main(String[] args)
	{
		/* Define sides */

		// Die 2
		int side = 5;

		/* Define Dice */

		// Die 1
		Dice die1 = new Dice();

		// Die 2
		Dice die2 = new Dice(side);

		// Die 3
		Dice die3 = new Dice(die2);

		/* Test and print sides of dice before and after roll*/

		// Die 1
		String result1 = die1.validateData();
		if(result1 == null)
		{
			System.out.print("Die 1:\n Before Roll: " + die1.getSide() + "\n");
			die1.roll();
			System.out.print(" After Roll: " + die1.getSide() + "\n");
		} else {
			System.out.print("Die 1:\n " + result1 + "\n");
		}

		// Die 2
		String result2 = die2.validateData();
		if(result2 == null)
		{
			System.out.print("Die 2:\n Before Roll: " + die2.getSide() + "\n");
			die2.roll();
			System.out.print(" After Roll: " + die2.getSide() + "\n");
		} else {
			System.out.print("Die 2:\n " + result2 + "\n");
		}

		// Die 3
		String result3 = die3.validateData();
		if(result3 == null)
		{
			System.out.print("Die 3:\n Before Roll: " + die3.getSide() + "\n");
			die3.roll();
			System.out.print(" After Roll: " + die3.getSide() + "\n");
		} else {
			System.out.print("Die 3:\n " + result3 + "\n");
		}
	}
}
