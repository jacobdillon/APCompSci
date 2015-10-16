import images.*;
import java.util.Scanner;
import java.util.Random;

public class project5_1 {
	public static void main(String[]args) {
		Random rand = new Random(); // Creates a new random object named "rand"
		Scanner scanner = new Scanner(System.in); // Creates a new scanner object named "scanner"

		System.out.print("Enter full path of image to be posterized (jpg, gif, or png): ");
		String fileName = scanner.nextLine(); // Get path of image
		APImage image = new APImage(fileName); // Open image
		image.draw();

		// Create 2 int arrays with 3 random ints
		int[] color1 = new int[] {rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)};
		int[] color2 = new int[] {rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)};

		for(Pixel p: image) { // Loop through each pixel in the image
			int red = p.getRed(); // Get red value of pixel
			int green = p.getGreen(); // Get green value of pixel
			int blue = p.getBlue(); // Get blue value of pixel
			int average = (red + green + blue) / 3; // Get average rgb amount
			if(average < 128) { // Closer to black
				p.setRed(color1[0]);
				p.setGreen(color1[1]); // Set rgb to new, random rgb values
				p.setBlue(color1[2]);
			} else { // Closer to white
				p.setRed(color2[0]);
				p.setGreen(color2[1]); // Set rgb to new, random rgb values
				p.setBlue(color2[2]);
			}
		}

		image.draw();
	}
}
