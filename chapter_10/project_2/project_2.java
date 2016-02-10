import java.util.Scanner;

public class project_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Array of inputs
		double[] doubleList = new double[10];

		// Get 10 inputs
		for(int i = 0; i < 10; i++) {
			try {
				// Prompt user to input
				System.out.print("Input a number (double): ");

				// Store input in array
				doubleList[i] = Double.parseDouble(scanner.nextLine());
			} catch(NumberFormatException e) {
				// Not an double
				System.out.println("Please enter a double.");
				i--;
			}
		}

		// Get average of array and print
		double avg = arrayAvg(doubleList);
		System.out.println("The average of the inputed numbers is: " + avg);
		System.out.println("Numbers greater than average:");

		// Loop through array
		for(int i = 0; i < doubleList.length; i++) {
			// Check if the element is larger than the average
			if(doubleList[i] > avg) {
				// Print element
				System.out.println(doubleList[i]);
			}
		}
	}

	public static double arrayAvg(double[] array) {
		// Total value in the array
		double total = 0;

		// Loop through array
		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}

		// Return average
		return total / array.length;
	}
}
