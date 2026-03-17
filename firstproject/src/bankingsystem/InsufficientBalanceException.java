package bankingsystem;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		// TODO Auto-generated constructor stub
		super("Insufficient balance");
	}

	public InsufficientBalanceException(String message) {
		super(message);
		
	}


}
