import java.util.Scanner;

public class project4_6 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in); // Make a new scanner named "scanner"
		int initialOrganisms, rateOfGrowth, hoursItTakes, totalHours, totalPoplulation;

		// Read the inputs from the keyboard
		System.out.print("Input the initial number of organisms (int): ");
		initialOrganisms = scanner.nextInt();

		System.out.print("Input the rate of growth for the organisms (int): ");
		rateOfGrowth = scanner.nextInt();

		System.out.print("Input the hours it takes to reach the given rate of growth (int): ");
		hoursItTakes = scanner.nextInt();

		System.out.print("Input the total number of hours the organisms will grow for (int): ");
		totalHours = scanner.nextInt();

		int totalPopulation = initialOrganisms; // Set the current total to the initial
		for(int i = 0; i < totalHours; i++) {
			if(i % hoursItTakes == 0) { // If the current hour / the hours it takes has a remainder of 0
				totalPopulation *= rateOfGrowth; // The total population is the current total population * the rate of growth
			}
		}
		System.out.println("The final population of the organisms is: " + totalPopulation); // Print result
	} // End of main
} // End of class
