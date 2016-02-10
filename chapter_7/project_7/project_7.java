public class project_7 {
	public static void main(String[] args) {
		// Print header
		System.out.println("Width\tHeight\tPerm\tArea");
		System.out.println("-----\t------\t----\t----");

		// Loop, increasing i
		for(int i = 1; i <= 10; i++) {
			// Loop, increasing j
			for(int j = 1; j <= 10; j++) {
				// Print results
				System.out.println(i + "\t" +
				                   j + "\t" +
				                   ((2 * i) + (2 * j)) + "\t" +
				                   (i * j));
			}
		}
	}
}
