import java.util.Scanner;

public class Project411 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfSquares;
		boolean evenLine, evenSquare;

		System.out.print("Input the length of the checkerboard (int): ");
		numberOfSquares = scanner.nextInt();

		for(int currentVertical = 0; currentVertical < numberOfSquares; currentVertical++) {

			if(currentVertical % 2 == 0) {
				evenLine = true;
			} else {
				evenLine = false;
			}

			for(int currentHoriz = 0; currentHoriz < numberOfSquares; currentHoriz++) {

				if(currentHoriz % 2 == 0) {
					evenSquare = true;
				} else {
					evenSquare = false;
				}

				if((evenLine && evenSquare) || (!evenLine && !evenSquare)) {
					System.out.print("\u2588");
				} else if((evenLine && !evenSquare) || (!evenLine && evenSquare)) {
					System.out.print(" ");
				}

			}

			System.out.println();
		}
	}
}
