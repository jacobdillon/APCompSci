import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class project_9 {
	public static void main(String[] args) {
		// Create a new scanner object named "scanner"
		Scanner scanner = new Scanner(System.in);
		// Int to count amount
		int count = 0;

		// Make sure file is found
		try {
			// Ask user for file name
			System.out.print("Enter a file to read: ");
			// Open filename as file object
			File file = new File(scanner.nextLine());
			// Create a new scanner on the file
			Scanner input = new Scanner(file);

			// Ask user for word to find
			System.out.print("Enter a word to find: ");
			// Store input in "word" string
			String word = scanner.nextLine();

			// While the line isnt EOF
			while(input.hasNextLine()) {
				// Create a new string tokenizer on the line
				StringTokenizer line = new StringTokenizer(input.nextLine());

				// While there are tokens to read
				while(line.hasMoreTokens())
					// Check if the line contains the word, increment count
					if(line.nextToken().contains(word)) count++;
			}

			// Print result
			if(count != 0) System.out.println("Found \"" + word + "\" " + count + " times");
			else System.out.println("\"" + word + "\" was not found");
		} catch(FileNotFoundException e) {
			// File not found bud
			System.out.println("Please input a valid file.");
		}
	}
}
