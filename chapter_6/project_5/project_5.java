public class project_5 {
	public static void main(String[] args) {
		/* Define bank account info*/

		// Bank Account 1
		String ba1name = "Alice";
		double ba1balance = 100.00;

		// Bank Account 2
		String ba2name = "Bob";
		double ba2balance = 350.50;
		double ba2deposit = 800.25;

		// Bank Account 3
		String ba3name = "Ron";
		double ba3balance = 5000.00;
		double ba3withdrawal = 1000.00;

		// Bank Account 4
		String ba4name = "";
		double ba4balance = 10000.05;

		// Bank Account 5
		String ba5name = "Joe";
		double ba5balance = -1.00;

		/* Define bank accounts */

		// Bank Account 1
		BankAccount ba1 = new BankAccount(ba1name, ba1balance);

		// Bank Account 2
		BankAccount ba2 = new BankAccount(ba2name, ba2balance);

		// Bank Account 3
		BankAccount ba3 = new BankAccount(ba3name, ba3balance);

		// Bank Account 4
		BankAccount ba4 = new BankAccount(ba4name, ba4balance);

		// Bank Account 5
		BankAccount ba5 = new BankAccount(ba5name, ba5balance);

		/* Test and print data */

		// Bank Account 1
		String ba1result1 = ba1.validateData();
		System.out.print("First Bank Account:\n ");
		if(ba1result1 == null)
			System.out.print("Data valid, no error\n" + ba1 + "\n");
		else
			System.out.print(ba1result1 + "\n\n");

		// Bank Account 2
		String ba2result1 = ba2.validateData();
		System.out.print("Second Bank Account:\n ");
		if(ba2result1 == null) {
			System.out.print("Data valid, no error\n" + ba2 + "\n ");

			ba2.deposit(ba2deposit);
			String ba2result2 = ba2.validateData();
			System.out.print("Deposited $" + ba2deposit + "\n ");
			if(ba2result2 == null)
				System.out.print("New Balance: $" + ba2.getBalance() + "\n\n");
			else
				System.out.print(ba2result2 + "\n\n");
		} else {
			System.out.print(ba2result1 + "\n\n");
		}

		// Bank Account 3
		String ba3result1 = ba3.validateData();
		System.out.print("Third Bank Account:\n ");
		if(ba3result1 == null) {
			System.out.print("Data valid, no error\n" + ba3 + "\n ");

			ba3.withdrawal(ba3withdrawal);
			String ba3result2 = ba3.validateData();
			System.out.print("Withdrew $" + ba3withdrawal + "\n ");
			if(ba3result2 == null) {
				System.out.print("New Balance: $" + ba3.getBalance() + "\n\n");
			} else {
				System.out.print(ba3result2 + "\n\n");
			}
		} else {
			System.out.print(ba3result1 + "\n\n");
		}

		// Bank Account 4
		String ba4result1 = ba4.validateData();
		System.out.print("Forth Bank Account:\n ");
		if(ba4result1 == null) {
			System.out.print("Data valid, no error\n" + ba4 + "\n ");
		} else {
			System.out.print(ba4result1 + "\n\n");
		}

		// Bank Account 5
		String ba5result1 = ba5.validateData();
		System.out.print("Fifth Bank Account:\n ");
		if(ba5result1 == null) {
			System.out.print("Data valid, no error\n" + ba5 + "\n ");
		} else {
			System.out.print(ba5result1 + "\n\n");
		}
	}
}
