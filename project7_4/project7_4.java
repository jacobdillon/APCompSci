import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class project7_4 {
	public static String getLetterGrade(int grade_number) {
		String grade;

		// Please god no
		if(grade_number <= 59) grade = "F";
		else if(grade_number <= 61) grade = "D-";
		else if(grade_number <= 65) grade = "D";
		else if(grade_number <= 69) grade = "D+";
		else if(grade_number <= 71) grade = "C-";
		else if(grade_number <= 75) grade = "C";
		else if(grade_number <= 79) grade = "C+";
		else if(grade_number <= 81) grade = "B-";
		else if(grade_number <= 85) grade = "B";
		else if(grade_number <= 89) grade = "B+";
		else if(grade_number <= 91) grade = "A-";
		else if(grade_number <= 95) grade = "A";
		else if(grade_number <= 100) grade = "A+";
		else grade = "What";

		return grade;
	}

	public static void main(String[] args) {
		// Create a new scanner object named "scanner"
		Scanner scanner = new Scanner(System.in);

		// Create a new ArrayList containing grades
		List<Integer> grades = new ArrayList<>();

		// Current grade read from input
		int current_grade = -2;

		// Maximum grade
		int max_grade = 0;

		// Minimum grade
		int min_grade = 0;

		// Total grade
		int total_grade = 0;

		// Average grade
		int avg_grade = 0;

		// While current input is not -1
		while(current_grade != -1) {
			try {
				// Ask the user for input
				System.out.print("Input a number grade (int): ");

				// Get the next number
				current_grade = Integer.parseInt(scanner.nextLine());

				// Tell user when grade_number is invalid
				if(current_grade > 100 || current_grade < 0)
					System.out.println("Please input an integer between 0 and 100");
				else
					// Add current grade to ArrayList
					grades.add(current_grade);
			} catch(NumberFormatException e) {
				// Tell user when input is not an int
				System.out.println("Please enter an int");
			}
		}

		// Loop through grades
		for(int i : grades) {
			// Add current grade to total
			total_grade += i;

			// Set i to max or min
			if(i < min_grade) min_grade = i;
			else if(i > max_grade) max_grade = i;
		}

		// Calculate average
		avg_grade = total_grade / grades.size();

		// Print results
		System.out.println("Class average: " + getLetterGrade(avg_grade));
		System.out.println("Class minimum: " + getLetterGrade(min_grade));
		System.out.println("Class maximum: " + getLetterGrade(max_grade));
	}
}
