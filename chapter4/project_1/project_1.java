import java.util.Scanner;

public class project_1 {
	public static void main(String [] args) {
		int firstNumber, secondNumber, resultQuotient, resultRemainder; // Define variables
		Scanner scanner = new Scanner(System.in); // Create a new scanner named "scanner"
		System.out.print("Input the first number (int): ");
		firstNumber = scanner.nextInt(); // Read firstNumber from keyboard
		System.out.print("Input the second number (int): ");
		secondNumber = scanner.nextInt(); // Read secondNumber from keyboard

		if(firstNumber > secondNumber) { // Make sure the larger number is first
			resultRemainder = firstNumber % secondNumber; // Get remainder
			resultQuotient = (firstNumber - resultRemainder) / secondNumber; // Get quotient after subtracting remainder
		} else {
			resultRemainder = secondNumber % firstNumber; // Get remainder
			resultQuotient = (secondNumber - resultRemainder) / secondNumber; // Get quotient after subtracting remainder
		}

		System.out.println("The quotient of " + firstNumber + " divided by " +
		                   secondNumber + " is " + resultQuotient +
		                   ".  The remainder is " + resultRemainder + ".");
	}
}
