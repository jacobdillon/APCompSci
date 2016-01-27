import java.util.Scanner;

public class project_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Array of inputs
		int[] inputs = new int[10];
		// Array parallel to input array
		int[] timesListed = new int[10];

		// Get 10 inputs
		for(int i = 0; i < 10; i++) {
			try {
				// Prompt user to input
				System.out.print("Input a number (int): ");

				// Store input in array
				inputs[i] = Integer.parseInt(scanner.nextLine());
			} catch(NumberFormatException e) {
				// Not an double
				System.out.println("Please enter an integer.");
				i--;
			}
		}

		// Fill timesListed
		for(int i = 0; i < inputs.length; i++) {
			for(int j = 0; j < inputs.length; j++) {
				// Check if current number in array (i) equals the new number (j)
				if(inputs[i] == inputs[j]) {
					timesListed[i]++;
				}
			}
		}

		// Get mode
		int largestIndex = 0;
		for(int i = 0; i < timesListed.length; i++) {
			if(timesListed[i] > timesListed[largestIndex]) {
				largestIndex = i;
			}
		}

		// Print result
		System.out.println("The mode of these numbers is: " + inputs[largestIndex]);
		System.out.println("It occurred " + timesListed[largestIndex] + " times.");
	}
}
