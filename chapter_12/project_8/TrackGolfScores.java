import java.util.Scanner;
import java.io.*;

public class TrackGolfScores {
	public static void main(String[] args) throws IOException {
		while (true) {
			// Get the name of the file of golf scores
			Scanner reader = new Scanner(System.in);
			System.out.print("Enter the name of a scores file or Q to quit: ");
			String fileName = reader.next();
			if(fileName.equalsIgnoreCase("q"))
				break;

			// Instantiate a golf score card and initialize it with the
			// data from a file
			GolfScoreCard card = new GolfScoreCard(fileName);

			// Display the original data, the best and worst days, and the
			// best and worst holes
			System.out.println("\nHere is the complete history of scores: \n" + card);
			System.out.println(card.highLowDays());
			//System.out.println(card.bestWorstHoles());

			// Display the handicap
			System.out.println("Average Handicap is: " + card.getHandicap(70));
        }
    }
}
