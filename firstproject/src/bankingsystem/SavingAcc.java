package bankingsystem;
import java.util.*;
public class SavingAcc extends Bank  {
	SavingAcc(String name,char acctype,double balance) throws InvalidAmountException {
		super(name,acctype,balance);
	}
	
	@Override
	public void withdraw(double amount, long password, String remarks) throws Exception {

	    try {
			authenticate(password);
		} catch (SecurityException e) {
			System.out.println(e.getMessage());
		}

	    if (amount <= 0) {
	        throw new IllegalArgumentException("Invalid withdrawal amount");
	    }

	    if (amount > getBalance()) {
	        throw new InsufficientBalanceException("Insufficient balance");
	    }

	    try {
	        setBalance(getBalance() - amount);
	        System.out.println("Savings Withdrawal: " + amount + " | " + remarks);
	    } catch (InvalidAmountException | IllegalArgumentException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	
}
