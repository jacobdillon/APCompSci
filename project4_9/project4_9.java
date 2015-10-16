import java.util.Scanner;
import java.io.*;

public class project4_9 {
	public static void main(String [] args) throws FileNotFoundException {
		File powers = new File("powers.txt"); // Open "powers.txt" as "powers"
		Scanner scanner = new Scanner(powers); // Open a scanner on "powers"
		int inputNumber, base;
		while(scanner.hasNext()) { // As long as the file still has contents...
			base = scanner.nextInt(); // Get first number - base
			inputNumber = scanner.nextInt(); // Get second number = inputNumber
			System.out.println(inputNumber + " to the power of " + base + " is " + (int)Math.pow(base, inputNumber)); // Print result casted to int
		}
	} // End of main
} // End of class
