import java.util.Scanner;
import java.io.*;

public class Project49 {
	public static void main(String [] args) throws FileNotFoundException {
		File powers = new File("powers.txt");
		Scanner scanner = new Scanner(powers);
		int inputNumber, base;
		while(scanner.hasNext()) {
			base = scanner.nextInt();
			inputNumber = scanner.nextInt();
			System.out.println(inputNumber + " to the power of " + base + " is " + (int)Math.pow(base, inputNumber));
		}
	} // End of main
} // End of class
