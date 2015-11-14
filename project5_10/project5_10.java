import images.*;
import java.util.Scanner;
import java.lang.Math;

public class project5_10 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in); // Creates a new scanner object named "scanner"

		System.out.print("Enter full path of image to be rotated (jpg, gif, or png): ");
		String fileName = scanner.nextLine(); // Get path of image

		APImage image = new APImage(fileName); // Open image

		int width = image.getWidth(); // Get width of image
		int height = image.getHeight(); // Get height of image

		APImage newImage = new APImage(height, width); // Create new image with reversed width and height

		for(int y = 0; y < height; y++) { // Loop through each pixel in the image
			for(int x = 0; x < width; x++) {

				Pixel pixel = image.getPixel(x, y); // Get old pixel
				newImage.setPixel(y, x, pixel); // Place that pixel at (y, x) instead of (x, y)

			}
		}
		newImage.draw(); // Draw the new image
	}
}
