import java.util.Scanner;

public class project_4 {
	public static void main(String [] args) {
		double weeklyPay, hourlyWage; // Initialize variables
		int hoursWorked, overTimeHours;

		Scanner scanner = new Scanner(System.in); // Create a new scanner named "scanner"
		System.out.print("Input the amount of hours worked (int): "); // Ask the user for input
		hoursWorked = scanner.nextInt(); // Store the input in the int "hoursWorked"

		System.out.print("Input the hourly wage (double): "); // Ask the user for input
		hourlyWage = scanner.nextDouble(); // Store the input in the double "hourlyWage"

		if(hoursWorked > 40) { // Check if they worked over 40 hours
			overTimeHours = hoursWorked - 40; // Get overtime hours worked
			weeklyPay = (40 * hourlyWage) + ((1.5 * hourlyWage) * overTimeHours); // Calculate weekly pay
		} else { // No overtime
			weeklyPay = hourlyWage * hoursWorked; // Calculate weekly pay
		}

		System.out.println("Your pay for this week is $" + weeklyPay); // Print result
	}
}
