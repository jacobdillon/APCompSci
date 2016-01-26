public class project_2 {
	public static void main(String[] args) {
		/* Define test scores */

		// Student 1
		String student1name = "";
		int student1score1 = 50, student1score2 = 75, student1score3 = 90;

		// Student 2
		String student2name = "Alice";
		int student2score1 = 150, student2score2 = -50, student2score3 = 50;

		// Student 3
		String student3name = "Bob";
		int student3score1 = 100, student3score2 = 0, student3score3 = 50;

		/* Define students */

		// Student 1
		Student student1 = new Student(student1name, student1score1, student1score2, student1score3);

		// Student 2
		Student student2 = new Student(student2name, student2score1, student2score2, student2score3);

		// Student 3
		Student student3 = new Student(student3name, student3score1, student3score2, student3score3);

		/* Test and print data */

		// Student 1
		String result1 = student1.validateData();
		if (result1 == null)
			System.out.println("First student:\n Data valid, no error\n");
		else
			System.out.println("First student:\n " + result1 + "\n");

		// Student 2
		String result2 = student2.validateData();
		if (result2 == null)
			System.out.println("Second student:\n Data valid, no error\n");
		else
			System.out.println("Second student:\n " + result2 + "\n");

		// Student 3
		String result3 = student3.validateData();
		if (result3 == null)
			System.out.println("Third student:\n Data valid, no error\n");
		else
			System.out.println("Third student:\n " + result3 + "\n");
	}
}
