/*
 * BankAccount.java - Manage a bank account's information
 */

public class BankAccount
{

	/* Instance variables */

	// Each BankAccount object has a name and a balance
	private String name; // Owner's name
	private double balance; // Balance in account

	/* Constructor methods */

	public BankAccount()
	{
		// Initialize a new BankAccount's owner's name to an empty string and the
		// balance to zero
		name = "";
		balance = 0.0;
	}

	public BankAccount(String nm, double bal)
	{
		name = nm;
		balance = bal;
	}

	public BankAccount(BankAccount b)
	{
		name = b.name;
		balance = b.balance;
	}

	/* Accessor Methods */

	public String getName()
	{
		// Get an owner's name
		return name;
	}

	public double getBalance()
	{
		// Get balance of the bank account
		return balance;
	}

	public String validateData()
	{
		// Make sure date is valid
		if (name == "") return "ERROR: Name required";
		else if (balance < 0) return "ERROR: Cannot have negative balance";
		else return null;
	}

	public String toString()
	{
		// Construct and return a string representation of the BankAccount
		String str;
		str = " Owner: " + name + "\n" + " Balance: $" + balance + "\n";
		return str;
	}

	/* Mutator Methods */

	public void setName(String nm)
	{
		// Set an owner's name
		name = nm;
	}

	public void deposit(double deposit)
	{
		// Increase balance by deposit
		balance += deposit;
	}

	public String withdrawal(double withdrawal)
	{
		// Check if withdrawal is invalid
		if(balance - withdrawal < 0)
		{
			return "ERROR: Cannot withdrawal more than balance.";
		} else {
			balance -= withdrawal;
			return null;
		}
	}
}
