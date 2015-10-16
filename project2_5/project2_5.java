import java.util.Scanner;
import java.util.InputMismatchException;

public class project2_5 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in); // Creates a new scanner named "scanner"
		System.out.print("Input the object's mass (kilograms): ");
		double kilograms;
		try {
			kilograms = scanner.nextDouble(); // Store the input in the variable "kilograms" as a double
		} catch(InputMismatchException e) { // Catch if the user does not enter a double and tell them to FIX IT
			System.err.println("Please enter a double next time");
			return; // Exit after error
		}

		System.out.print("Input the object's velocity (meters per second): ");
		double metersPerSecond;
		try {
			metersPerSecond = scanner.nextDouble(); // Store the input in the variable "metersPerSecond" as a double
		} catch(InputMismatchException e) { // Catch if the user does not enter a double and tell them to FIX IT
			System.err.println("Please enter a double next time");
			return; // Exit after error
		}

		scanner.close(); // Close the scanner
		System.out.println("The momentum of the object is " + kilograms*metersPerSecond); // Print the momentum of the object
	} // End of main
} // End of class
