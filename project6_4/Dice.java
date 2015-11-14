/*
 * Dice.java - Dice object
 */

import java.util.Random;

public class Dice
{
	/* Instance variables */

	// Each die has a single viewable side
	private int side; // Side of dice

	/* Constructor methods */

	public Dice()
	{
		// Initialize a new dies' viewable side to a random number
		side = 4;
		//roll();
	}

	public Dice(int s)
	{
		side = s;
	}

	public Dice(Dice d)
	{
		side = d.side;
	}

	/* Accessor methods */

	public int getSide()
	{
		return side;
	}

	public String validateData()
	{
		// Make sure data is valid
		if (side < 0 || side > 6) return "ERROR: side must be > 0 and < 6";
		else return null;
	}

	/* Mutator methods */

	public void roll()
	{
		// roll the die
		Random rand = new Random();
		side = rand.nextInt(5) + 1;
	}
}
