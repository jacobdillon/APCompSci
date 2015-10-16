import java.util.Scanner;
import java.util.InputMismatchException;

public class project2_3 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in); // Creates a new scanner named "scanner"
		System.out.print("Input the number of kilometers you want to convert to miles: ");
		double kilometers;
		try {
			kilometers = scanner.nextDouble(); // Store the input in the variable "kilometers" as a double
			scanner.close(); // Close the scanner
			System.out.println("Miles: " + (kilometers * 0.62)); // Print the number of miles
		} catch(InputMismatchException e) { // Catch if the user does not enter a double and tell them to FIX IT
			System.err.println("Please enter a double next time.");
			return; // Exit after error
		}
	} // End of main
} // End of class
