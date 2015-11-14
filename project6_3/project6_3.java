public class project6_3
{
	public static void main(String[] args)
	{
		/* Define Numerator and Denominators */

		// Fraction 1
		int fraction1num = 3;
		int fraction1den = 5;

		// Fraction 2
		int fraction2num = 1;
		int fraction2den = 2;

		/* Define Fractions */

		// Fraction 1
		Fraction fraction1 = new Fraction(fraction1num, fraction1den);

		// Fraction 2
		Fraction fraction2 = new Fraction(fraction2num, fraction2den);

		/* Print Arithmetic Tests */

		// Fraction 1 + Fraction 2
		Fraction addedFraction = new Fraction(fraction1.addFrac(fraction2));
		System.out.print("Addition:\n " + fraction1 + " + " + fraction2 + " = " + addedFraction + "\n");

		// Fraction 1 - Fraction 2
		Fraction subtractedFraction = new Fraction(fraction1.subFrac(fraction2));
		System.out.print("Subtraction:\n " + fraction1 + " - " + fraction2 + " = " + subtractedFraction + "\n");

		// Fraction 1 * Fraction 2
		Fraction multipliedFraction = new Fraction(fraction1.multFrac(fraction2));
		System.out.print("Multiplication:\n " + fraction1 + " * " + fraction2 + " = " + multipliedFraction + "\n");

		// Fraction 1 / Fraction 2
		Fraction dividedFraction = new Fraction(fraction1.divFrac(fraction2));
		System.out.print("Division:\n " + fraction1 + " / " + fraction2 + " = " + dividedFraction + "\n");
	}
}
