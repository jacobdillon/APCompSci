import java.util.Scanner;

public class Project48 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber, base;

		System.out.print("Input the base (int): ");
		base = scanner.nextInt();

		System.out.print("Input the exponent (int): ");
		inputNumber = scanner.nextInt();

		if(inputNumber == -1) {
			System.exit(1); // User entered "-1", so exit with code 1
		} else {
			System.out.println(inputNumber + " to the power of " + base + " is " + Math.pow(base, inputNumber));
		}
	} // End of main
} // End of class
