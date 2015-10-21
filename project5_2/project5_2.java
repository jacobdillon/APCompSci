import images.*;
import java.util.Scanner;
import java.util.Random;

public class project5_2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in); // Creates a new scanner object named "scanner"

		System.out.print("Enter full path of image to be posterized (jpg, gif, or png): ");
		String fileName = scanner.nextLine(); // Get path of image
		APImage image = new APImage(fileName); // Open image
		image.draw();

		int color0 = 0; // #000000
		int color1 = 51; // #333333
		int color2 = 102; // #666666
		int color3 = 153; // #999999
		int color4 = 204; // #CCCCCC
		int color5 = 255; // #FFFFFF

		for(Pixel p: image) { // Loop through each pixel in the image
			int red = p.getRed(); // Get red value of pixel
			int green = p.getGreen(); // Get green value of pixel
			int blue = p.getBlue(); // Get blue value of pixel
			double average = (red * 0.299) + (green * 0.587) + (blue * 0.114); // Get average rgb amount
			if(average < 25.5) {
				p.setRed(color0);
				p.setGreen(color0); // Set rgb to black
				p.setBlue(color0);
			} else if(average < 76.5) {
				p.setRed(color1);
				p.setGreen(color1);
				p.setBlue(color1);
			} else if(average < 127.5) {
				p.setRed(color2);
				p.setGreen(color2);
				p.setBlue(color2);
			} else if(average < 178.5) {
				p.setRed(color3);
				p.setGreen(color3);
				p.setBlue(color3);
			} else if(average < 229.5) {
				p.setRed(color4);
				p.setGreen(color4);
				p.setBlue(color4);
			} else if(average < 255) {
				p.setRed(color5);
				p.setGreen(color5); // Set rgb to white
				p.setBlue(color5);
			}
		}
		image.draw();
	}
}
