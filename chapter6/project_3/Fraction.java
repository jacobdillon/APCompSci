/*
 * Fraction.java - Perform arithmetic on fractions
 */

public class Fraction {

	/* Instance variables */

	// Each fraction has a numerator and a denominator
	private int n; // Numerator
	private int d; // Denominator

	/* Constructor methods */

	public Fraction() {
		// Initialize a new fraction's numerator and denominator to zero
		n = 0;
		d = 0;
	}

	public Fraction(int num, int den) {
		n = num;
		d = den;
	}

	public Fraction(Fraction f) {
		n = f.n;
		d = f.d;
	}

	/* Accessor methods */

	public int getNum() {
		return n;
	}

	public int getDen() {
		return d;
	}

	public String toString() {
		// Construct and return a string representation of the fraction
		String str;
		str = n + "/" + d;
		return str;
	}

	/* Mutator methods */

	public void setNum(int num) {
		// Set a fraction's numerator
		n = num;
	}

	public void setDen(int den) {
		// Set a fraction's denominator
		d = den;
	}

	/* Arithmetic methods */

	public Fraction addFrac(Fraction f1) {
		Fraction f = new Fraction();
		f.setNum((n * f1.getDen()) + (f1.getNum() * d));
		f.setDen(d * f1.getDen());
		return f;
	}

	public Fraction subFrac(Fraction f1) {
		Fraction f = new Fraction();
		f.setNum((n * f1.getDen()) - (f1.getNum() * d));
		f.setDen(d * f1.getDen());
		return f;
	}

	public Fraction multFrac(Fraction f1) {
		Fraction f = new Fraction();
		f.setNum(n * f1.getNum());
		f.setDen(d * f1.getDen());
		return f;
	}

	public Fraction divFrac(Fraction f1) {
		Fraction f = new Fraction();
		f.setNum(n * f1.getDen());
		f.setDen(d * f1.getNum());
		return f;
	}
}
