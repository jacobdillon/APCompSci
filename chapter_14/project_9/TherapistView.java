// Case Study 14.2: View for the therapist program

import java.util.Scanner;

public class TherapistView {
	/* Instance variables */
	private Therapist therapist = new Therapist();

	/* Constructor */
	public TherapistView() {
		Scanner reader = new Scanner(System.in);

		System.out.println("Good day. What is your problem?");
		while (true) {
			System.out.print("\nEnter your response here or Q to quit: ");
			String patientString = reader.nextLine();

			if (patientString.equalsIgnoreCase("Q")) break;

			String therapistString = therapist.reply(patientString);
			System.out.println("\n" + therapistString);
		}
	}
}
