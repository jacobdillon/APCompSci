import java.util.Scanner;

public class Project411 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfSquares;
		boolean previousBlock = false;

		System.out.print("Input the length of the checkerboard (int): ");
		numberOfSquares = scanner.nextInt();

		for(int currentVertical = 0; currentVertical <= numberOfSquares; currentVertical++) {
			for(int currentHoriz = 0; currentHoriz <= numberOfSquares; currentHoriz++) {
				if(!previousBlock) {
					System.out.print("\u2588");
					previousBlock = true;
				} else {
					System.out.print(" ");
					previousBlock = false;
				}
			}
			System.out.println();
		}
	}
}
