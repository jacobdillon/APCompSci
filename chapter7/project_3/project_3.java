import java.util.Scanner;

public class project_3 {
	public static void main(String[] args) {
		// Create a new scanner object named "scanner"
		Scanner scanner = new Scanner(System.in);

		int grade_number = -1;
		String grade;

		// Loop this until the grade is valid
		while(grade_number > 100 || grade_number < 0) {
			try {
				// Ask the user for input
				System.out.print("Input a number grade (int): ");

				// Get the next number
				grade_number = Integer.parseInt(scanner.nextLine());

				// Tell user when grade_number is invalid
				if(grade_number > 100 || grade_number < 0)
					System.out.println("Please input an integer between 0 and 100");
			} catch(NumberFormatException e) {
				// Tell user when input is not an int
				System.out.println("Please enter an int");
			}
		}

		// Please god no
		if(grade_number <= 59)
			grade = "F";
		else if(grade_number <= 61)
			grade = "D-";
		else if(grade_number <= 65)
			grade = "D";
		else if(grade_number <= 69)
			grade = "D+";
		else if(grade_number <= 71)
			grade = "C-";
		else if(grade_number <= 75)
			grade = "C";
		else if(grade_number <= 79)
			grade = "C+";
		else if(grade_number <= 81)
			grade = "B-";
		else if(grade_number <= 85)
			grade = "B";
		else if(grade_number <= 89)
			grade = "B+";
		else if(grade_number <= 91)
			grade = "A-";
		else if(grade_number <= 95)
			grade = "A";
		else if(grade_number <= 100)
			grade = "A+";
		else
			grade = "What";

		// Tell user input
		System.out.println(grade_number + " is a(n) " + grade);
	}
}
