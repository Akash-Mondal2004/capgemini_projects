package bankingsystem.models;

import bankingsystem.exceptions.*;

/**
 * Savings Account class
 * Does not allow overdraft - balance must be sufficient for withdrawals
 */
public class SavingsAccount extends Bank {
	
	/**
	 * Constructor for Savings Account
	 * @param name Account holder name
	 * @param accountType Type of account
	 * @param balance Initial balance
	 * @throws InvalidAmountException if initial balance is invalid
	 */
	public SavingsAccount(String name, char accountType, double balance) throws InvalidAmountException {
		super(name, accountType, balance);
	}
	
	/**
	 * Withdraw money from savings account
	 * Does not allow overdraft
	 * @param amount Amount to withdraw
	 * @param password Account password
	 * @param remarks Withdrawal remarks
	 * @throws Exception if withdrawal fails
	 */
	@Override
	public void withdraw(double amount, long password, String remarks) throws Exception {
		try {
			authenticate(password);
		} catch (SecurityException e) {
			System.out.println(e.getMessage());
			return;
		}

		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid withdrawal amount");
		}

		if (amount > getBalance()) {
			throw new InsufficientBalanceException("Insufficient balance");
		}

		try {
			setBalance(getBalance() - amount);
			System.out.println("Savings Account Withdrawal: " + amount + " | " + remarks);
		} catch (InvalidAmountException | InsufficientBalanceException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
