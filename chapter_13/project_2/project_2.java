import java.util.Scanner;

public class project_2 {
	public static void main(String [] args) {
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Prompt user for input and reverse string
		System.out.print("String you would like reversed: ");
		reverseString(scanner.nextLine());
	}

	public static void reverseString(String str) {
		if(str.length() == 0) {
			// Done: print a new line and return
			System.out.println();
			return;
		} else {
			// Print last character of string
			System.out.print(str.substring(str.length() - 1));

			// Recursively run reverseString with the string minus last element
			reverseString(str.substring(0, str.length() - 1));
		}
	}
}
