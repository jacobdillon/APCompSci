import java.util.Scanner;

public class project_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Even numbers
		int[] evenList = new int[10];
		int evenListIndex = 0;

		// Odd numbers
		int[] oddList = new int[10];
		int oddListIndex = 0;

		// Negative numbers
		int[] negativeList = new int[10];
		int negativeListIndex = 0;

		for(int i = 0; i < 10; i++) {
			try {
				// Prompt user to input
				System.out.print("Input number (int): ");

				// Int to store input in
				int inputInt = Integer.parseInt(scanner.nextLine());

				if(inputInt < 0) {
					// Negative
					negativeList[negativeListIndex] = inputInt;
					negativeListIndex++;
				} else if (inputInt % 2 == 0) {
					// Even
					evenList[evenListIndex] = inputInt;
					evenListIndex++;
				} else {
					// Odd
					oddList[oddListIndex] = inputInt;
					oddListIndex++;
				}
			} catch(NumberFormatException e) {
				// Not an int
				System.out.println("Please enter an integer.");
				i--;
			}
		}

		System.out.println("evenList:" + printArray(evenList));
		System.out.println("oddList:" + printArray(oddList));
		System.out.println("negativeList:" + printArray(negativeList));
	}

	public static String printArray(int[] array) {
		// String to add to
		String string = "";

		// Loop through array
		for(int i = 0; i < array.length; i++) {
			string = string + " " + array[i];
		}

		return string;
	}
}
