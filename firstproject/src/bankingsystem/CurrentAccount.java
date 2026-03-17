package bankingsystem;

public class CurrentAccount extends Bank{
	 private static final double OVERDRAFT_LIMIT = 5000;

	    public CurrentAccount(String name,char acctype,double balance)
	            throws InvalidAmountException {
	        super(name, acctype, balance);
	    }

	    @Override
	    public void withdraw(double amount,long password, String remarks) throws InsufficientBalanceException {

	    	try {
				authenticate(password);
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Invalid withdrawal amount");
	        }
	        
	        if (amount > getBalance() + OVERDRAFT_LIMIT) {
	            throw new InsufficientBalanceException("Overdraft limit exceeded");
	        }

	        try {
	            setBalance(getBalance() - amount);
	            System.out.println("Current Withdrawal: " + amount + " | " + remarks);
	        } catch (InvalidAmountException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
