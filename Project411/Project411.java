import java.util.Scanner;

public class Project411 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in); // Create a new scanner named "scanner"
		int numberOfSquares;
		boolean evenLine, evenSquare; // Some nice booleans...

		System.out.print("Input the length of the checkerboard (int): ");
		numberOfSquares = scanner.nextInt(); // Get the length of the board from the keyboard

		for(int currentVertical = 0; currentVertical < numberOfSquares; currentVertical++) { // Vertical loop

			if(currentVertical % 2 == 0) {
				evenLine = true; // Set evenLine to true if "currentVertical" is even
			} else {
				evenLine = false; // Set evenLine to false if "currentVertical" is odd
			}

			for(int currentHoriz = 0; currentHoriz < numberOfSquares; currentHoriz++) { // Horizontal loop

				if(currentHoriz % 2 == 0) {
					evenSquare = true; // Set evenLine to true if "currentHoriz" is even
				} else {
					evenSquare = false; // Set evenLine to false if "currentHoriz" is odd
				}

				if((evenLine && evenSquare) || (!evenLine && !evenSquare)) { // If the even position is on an even line or if the odd position is on an odd line...
					System.out.print("\u2588"); // Print a square
				} else if((evenLine && !evenSquare) || (!evenLine && evenSquare)) { // If the odd position is on an even line or if the even position is on an odd line...
					System.out.print(" "); // Print an empty space
				}

			}

			System.out.println(); // End of line, print new line
		}
	} // End of Main
} // End of Class
