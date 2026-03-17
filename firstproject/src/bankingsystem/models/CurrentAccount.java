package bankingsystem.models;

import bankingsystem.exceptions.*;

/**
 * Current Account class
 * Allows overdraft facility up to a specified limit
 */
public class CurrentAccount extends Bank {
	private static final double OVERDRAFT_LIMIT = 5000;

	/**
	 * Constructor for Current Account
	 * @param name Account holder name
	 * @param accountType Type of account
	 * @param balance Initial balance
	 * @throws InvalidAmountException if initial balance is invalid
	 */
	public CurrentAccount(String name, char accountType, double balance) throws InvalidAmountException {
		super(name, accountType, balance);
	}

	/**
	 * Withdraw money from current account
	 * Allows overdraft up to OVERDRAFT_LIMIT
	 * @param amount Amount to withdraw
	 * @param password Account password
	 * @param remarks Withdrawal remarks
	 */
	@Override
	public void withdraw(double amount, long password, String remarks) {
		try {
			authenticate(password);
		} catch (SecurityException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid withdrawal amount");
		}
		
		if (amount > getBalance() + OVERDRAFT_LIMIT) {
			throw new InsufficientBalanceException("Overdraft limit exceeded");
		}

		try {
			setBalance(getBalance() - amount);
			System.out.println("Current Account Withdrawal: " + amount + " | " + remarks);
		} catch (InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}
}
