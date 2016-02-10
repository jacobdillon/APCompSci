import java.util.Scanner;
import java.lang.Math;

public class project_5 {
	public static int gcd(int n1, int n2) {
		// Get larger/smaller number between the two
		int larger_num = Math.max(n1, n2);
		int smaller_num = Math.min(n1, n2);

		int remainder;

		// Loop until the remainder is 0 - when the GCD has been calculated
		while(smaller_num != 0) {
			remainder = larger_num % smaller_num;
			larger_num = smaller_num;
			smaller_num = remainder;
		}

		// Return GCD
		return larger_num;
	}

	public static void main(String[] args) {
		// Create a new scanner object named "scanner"
		Scanner scanner = new Scanner(System.in);

		// Numbers to compute GCD with
		int n1 = 0, n2 = 0;

		try {
			// Ask the user for input
			System.out.print("Input a number (int): ");

			// Get the next number
			n1 = Integer.parseInt(scanner.nextLine());

			// Ask the user for input
			System.out.print("Input another number (int): ");

			// Get the next number
			n2 = Integer.parseInt(scanner.nextLine());
		} catch(NumberFormatException e) {
			// Tell user when input is not an int
			System.out.println("Please enter an int");
			System.exit(1);
		}

		// Print result
		System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd(n1, n2));
	}
}
