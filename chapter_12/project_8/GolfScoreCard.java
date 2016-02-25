import java.util.Scanner;
import java.io.*;

public class GolfScoreCard {
	private int[] dates;
	private int[][] scores;

	// Instantiate and read golf scores from a text file
	public GolfScoreCard(String fileName) throws IOException {
		// Open the file
		Scanner fileReader = new Scanner(new File(fileName));

		// Read the number of days
		int numDays = fileReader.nextInt();

		// Instantiate dates and dailyScores
		dates = new int[numDays];
		scores = new int[numDays][18];

		// Read the scores for each day
		// Date (yyyymmdd), followed by 18 scores
		for(int i = 0; i < numDays; i++) {
			dates[i] = fileReader.nextInt();
			for(int j = 0; j < 18; j++)
				scores[i][j] = fileReader.nextInt();
		}

		// Close the file
		fileReader.close();
    }

	// Return a string with one line per day.
	// Each line consists of a date and 18 scores
	public String toString() {
		String str = "";
		for(int i = 0; i < dates.length; i++) {
			str += "Date: " + dates[i] + " Scores:";
			for(int j = 0; j < 18; j++)
				str += " " + scores[i][j];
			str += "\n";
		}
		return str;
	}

	// Return a string with two lines.
	// The first line contains the date and scores for the best day
	// The second line contains the date and scores for the worst day
	public String highLowDays() {
		// Assume that the first day is the best and worst
		int indexLow = 0;
		int indexHigh = 0;
		int lowTotal = dayTotal(0);
		int highTotal = dayTotal(0);

		// Now consider the remaining days
		for(int i = 1; i < dates.length; i++) {
			int todayTotal = dayTotal(i);
			if(todayTotal < lowTotal) {
				indexLow = i;
				lowTotal = todayTotal;
			} else if(todayTotal > highTotal) {
				indexHigh = i;
				highTotal = todayTotal;
			}
		}

		// Format the return string
		String str = "";
		str += "The best day:  " + dates[indexLow] + " score: " + lowTotal + "\n";
		str += "The worst day: " + dates[indexHigh] + " score: " + highTotal + "\n";

		return str;
	}

	// Return the total for the indicated day
	private int dayTotal(int i) {
		int total = 0;
		for(int j = 0; j < 18; j++)
			total += scores[i][j];
		return total;
	}

	// Return a string with two lines.
	// The first line indicates the hole with the lowest average
	// The second line indicates the hole with the highest average
	public String bestWorstHoles(){
		String str = "";
		return str;
	}

	// Return the average for the indicated hole
	private double holeAverage(int j) {
		int numDays = dates.length;
		double average = 0;
		for(int i = 0; i < numDays; i++)
			average += scores[i][j];
		return average / numDays;
	}

	// Return the average handicap for all of the days
	public double getHandicap(int par) {
		int totalShots = 0;
		for(int i = 0; i < dates.length; i++)
			totalShots += this.dayTotal(i);
		return (totalShots / dates.length) - par;
	}
}
