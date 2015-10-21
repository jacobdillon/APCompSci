import images.*;
import java.util.Scanner;
import java.lang.Math;

public class project5_7 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in); // Creates a new scanner object named "scanner"

		System.out.print("Enter full path of image to be blurred (jpg, gif, or png): ");
		String fileName = scanner.nextLine(); // Get path of image

		APImage image = new APImage(fileName); // Open image

		int width = image.getWidth(); // Get width of image
		int height = image.getHeight(); // Get height of image

		int[] colorArray = new int[3];

		for(int i = 0; i < 4; i++) { // Run through the filter 4 times
			for(int y = 1; y < height - 2; y++) { // Loop through each pixel in the image
				for(int x = 1; x < width - 2; x++) {

					Pixel origPixel = image.getPixel(x, y); // Get original pixel value
					Pixel leftPixel = image.getPixel(x - 1, y); // Get left pixel value
					Pixel rightPixel = image.getPixel(x + 1, y); // Get right pixel value
					Pixel upPixel = image.getPixel(x, y - 1); // Get up pixel value
					Pixel downPixel = image.getPixel(x, y + 1); // Get down pixel value
					Pixel bottomLeftPixel = image.getPixel(x - 1, y - 1); // Get left pixel value
					Pixel topRightPixel = image.getPixel(x + 1, y + 1); // Get right pixel value
					Pixel topLeftPixel = image.getPixel(x - 1, y + 1); // Get up pixel value
					Pixel bottomRightPixel = image.getPixel(x + 1, y - 1); // Get down pixel value

					colorArray[0] = (int)((origPixel.getRed() + leftPixel.getRed() + rightPixel.getRed() + upPixel.getRed() + downPixel.getRed() + bottomLeftPixel.getRed() + topRightPixel.getRed() + topLeftPixel.getRed() + bottomRightPixel.getRed()) / 9); // Average red pixels
					colorArray[1] = (int)((origPixel.getGreen() + leftPixel.getGreen() + rightPixel.getGreen() + upPixel.getGreen() + downPixel.getGreen() + bottomLeftPixel.getGreen() + topRightPixel.getGreen() + topLeftPixel.getGreen() + bottomRightPixel.getGreen()) / 9); // Average green pixels
					colorArray[2] = (int)((origPixel.getBlue() + leftPixel.getBlue() + rightPixel.getBlue() + upPixel.getBlue() + downPixel.getBlue() + bottomLeftPixel.getBlue() + topRightPixel.getBlue() + topLeftPixel.getBlue() + bottomRightPixel.getBlue()) / 9); // Average blue pixels

					Pixel pixel = new Pixel(colorArray[0], colorArray[1], colorArray[2]); // Create a new pixel with the averaged rgb values
					image.setPixel(x, y, pixel); // Set the pixel

				}
			}
		}
		image.draw(); // Draw the image
	}
}
