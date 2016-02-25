import java.util.Scanner;
import java.math.BigInteger;

public class factorial {
	public static void main(String[] args) {
		// Create a new Scanner object named "scanner"
		Scanner scanner = new Scanner(System.in);

		// Prompt for & read input
		System.out.print("Number to get factorial of (BigInteger): ");
		BigInteger number = new BigInteger(scanner.nextLine());

		// Print result
		System.out.println("The factorial of " + number + " is: " + factorial(number));
	}

	public static BigInteger factorial(BigInteger number) {
		if(number.compareTo(BigInteger.valueOf(2)) < 0) {
			// 1 and 0 factorial to 1
			return BigInteger.valueOf(1);
		} else {
			// Recursively run factorial
			return number.multiply(factorial(number.subtract(BigInteger.valueOf(1))));
		}
	}
}
