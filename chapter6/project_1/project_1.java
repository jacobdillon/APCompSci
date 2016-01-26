public class project_1 {
	public static void main(String[]args) {
		/* Define test scores */

		// student1
		String student1name = "Alice";
		int student1score1 = 50, student1score2 = 75, student1score3 = 90;

		// student2 and student3
		String student2name = "Bob";
		int student2score1 = 100, student2score2 = 80, student2score3 = 60;

		/* Define students */

		// First student, using constructor with no scores
		Student student1 = new Student();
		student1.setName(student1name);
		student1.setScore(1, student1score1);
		student1.setScore(2, student1score2);
		student1.setScore(3, student1score3);

		// Second student, using constructor with all scores
		Student student2 = new Student(student2name, student2score1, student2score2, student2score3);

		// Third student, using constructor with another Student
		Student student3 = new Student(student2);

		/* Display the information */

		// Studen 1
		System.out.println("First student:\n" + student1 + "\n");

		// Student 2
		System.out.println("Second student:\n" + student2 + "\n");

		// Student 3
		System.out.println("Third Student:\n" + student3);
	}
}
