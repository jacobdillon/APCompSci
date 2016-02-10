/*
 * Student.java - Manage a student's name and three test scores.
 */

public class Student {
	/* Instance variables */

	// Each student object has a name and three test scores
	private String name;             //Student name
	private int test1;               //Score on test 1
	private int test2;               //Score on test 2
	private int test3;               //Score on test 3

	/* Constructor methods */

	public Student() {
		// Initialize a new student's name to the empty string and the test
		// scores to zero.
		name = "";
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}

	public Student(String nm, int t1, int t2, int t3) {
		name = nm;
		test1 = t1;
		test2 = t2;
		test3 = t3;
	}

	public Student(Student s) {
		name = s.name;
		test1 = s.test1;
		test2 = s.test2;
		test3 = s.test3;
	}

	/* Other methods */

	public void setName (String nm) {
		// Set a student's name
		name = nm;
	}

	public String getName () {
		// Get a student's name
		return name;
	}

	public void setScore (int i, int score) {
		// Set test i to score
		if      (i == 1) test1 = score;
		else if (i == 2) test2 = score;
		else             test3 = score;
	}

	public int getScore (int i) {
		// Retrieve score i
		if      (i == 1) return test1;
		else if (i == 2) return test2;
		else             return test3;
	}

	public int getAverage() {
		// Compute and return the average
		int average;
		average = (int) Math.round((test1 + test2 + test3) / 3.0);
		return average;
	}

	public int getHighScore() {
		// Determine and return the highest score
		int highScore;
		highScore = test1;
		if (test2 > highScore) highScore = test2;
		if (test3 > highScore) highScore = test3;
		return highScore;
	}

	public String toString() {
		// Construct and return a string representation of the student
		String str;
		str = "Name:    " + name  + "\n" +
		      "Test 1:  " + test1 + "\n" +
		      "Test 2:  " + test2 + "\n" +
		      "Test 3:  " + test3 + "\n" +
		      "Average: " + getAverage();
		return str;
	}
}
