import java.util.Scanner;
import java.lang.Math;

public class Project31 {
	public static void main(String [] args) {
		// Creates a new scanner named "scanner"
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the length of an edge (double): ");

		// Store the input in the variable "lengthOfEdge" as a double
		double lengthOfEdge = scanner.nextDouble();

		// Multiply the length of the edge squared by 6, store the result in areaOfCube
		double areaOfCube = 6 * Math.pow(lengthOfEdge, 2);

		// Print the result
		System.out.println("The surface area of the cube is: " + areaOfCube);
	}
}
