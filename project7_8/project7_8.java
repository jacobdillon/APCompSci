import java.util.Scanner;
import java.util.StringTokenizer;

public class project7_8 {
	public static void main(String[] args) {
		// Create a new scanner object named "scanner"
		Scanner scanner = new Scanner(System.in);

		// String variable to store input
		String input;

		// Int to represent length of all tokens combined
		int all_token_length = 0;

		// Int to represent token count
		int token_count = 0;

		// Ask the user for input
		System.out.print("Input a sentence: ");

		// Get the string from input
		input = scanner.nextLine();

		// Create new StringTokenizer object named "tokens"
		StringTokenizer tokens = new StringTokenizer(input);

		// Get # of tokens
		token_count = tokens.countTokens();

		// Get amount of characters in tokens
		while(tokens.hasMoreTokens())
			all_token_length += tokens.nextToken().length();

		// Print results
		System.out.println("Words: " + token_count);
		System.out.println("Average Word Length: " + (all_token_length / token_count));
		System.out.println("Setence Length: " + input.length());
	}
}
