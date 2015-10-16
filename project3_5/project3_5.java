import java.util.Scanner;

public class project3_5 {
	public static void main(String [] args) {
		double weeklyPay, hourlyWage; // Initialize variables
		int overTimeHours, hoursWorked;
		Scanner scanner = new Scanner(System.in); // Create a new scanner named "scanner"

		System.out.print("Input the hourly wage (double): "); // Ask the user for input
		hourlyWage = scanner.nextDouble(); // Store the input in the double "hourlyWage"

		System.out.print("Input the amount of hours worked on Monday (int): "); // Ask the user for input
		int hoursWorkedMonday = scanner.nextInt(); // Store the input in the int "hoursWorkedMonday"

		System.out.print("Input the amount of hours worked on Tuesday (int): "); // Ask the user for input
		int hoursWorkedTuesday = scanner.nextInt(); // Store the input in the int "hoursWorkedTuesday"

		System.out.print("Input the amount of hours worked on Wednesday (int): "); // Ask the user for input
		int hoursWorkedWednesday = scanner.nextInt(); // Store the input in the int "hoursWorkedWednesday"

		System.out.print("Input the amount of hours worked on Thursday (int): "); // Ask the user for input
		int hoursWorkedThursday = scanner.nextInt(); // Store the input in the int "hoursWorkedThursday"

		System.out.print("Input the amount of hours worked on Friday (int): "); // Ask the user for input
		int hoursWorkedFriday = scanner.nextInt(); // Store the input in the int "hoursWorkedFriday"

		// Calculate the total hours worked for the week
		hoursWorked = hoursWorkedMonday + hoursWorkedTuesday + hoursWorkedWednesday + hoursWorkedThursday + hoursWorkedFriday;

		if(hoursWorked > 40) { // Check if they worked over 40 hours
			overTimeHours = hoursWorked - 40; // Get overtime hours worked
			weeklyPay = (40 * hourlyWage) + ((1.5 * hourlyWage) * overTimeHours); // Calculate weekly pay
		} else { // No overtime
			weeklyPay = hourlyWage * hoursWorked; // Calculate weekly pay
		}

		System.out.println("Your pay for this week is $" + weeklyPay); // Print result
	} // End of main
} // End of class
