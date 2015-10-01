import java.util.Scanner;

public class Project46 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int initialOrganisms, rateOfGrowth, hoursItTakes, totalHours, totalPoplulation;

		System.out.print("Input the initial number of organisms (int): ");
		initialOrganisms = scanner.nextInt();

		System.out.print("Input the rate of growth for the organisms (int): ");
		rateOfGrowth = scanner.nextInt();

		System.out.print("Input the hours it takes to reach the given rate of growth (int): ");
		hoursItTakes = scanner.nextInt();

		System.out.print("Input the total number of hours the organisms will grow for (int): ");
		totalHours = scanner.nextInt();

		int totalPopulation = initialOrganisms;
		for(int counter = 0; counter < totalHours; counter++) {
			if(counter % hoursItTakes == 0) {
				totalPopulation *= rateOfGrowth;
			}
		}
		System.out.println("The final population of the organisms is: " + totalPopulation);
	} // End of main
} // End of class
