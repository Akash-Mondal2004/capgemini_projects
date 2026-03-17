package bankingsystem;

public abstract class Bank {
	private double balance=0;
	private long accnumber = 0;
	private long password = 0;
	private String name; 
	private char acctype;
	
	Bank(String name,char acctype,double balance){
		this.name = name;
		this.acctype = acctype;
		this.balance = balance;
		System.out.println("Enter initital money insert");
		System.out.println(this.name+ " Your account has been created ");
		this.accnumber = 1000000 + (int)(Math.random() * ((9999999 - 1000000+(int)acctype) + 1));
		this.password = 1000 + (int)(Math.random() * ((9999 - 1000) + 1));
		showAccnumberpass();
	}
	
	public void showAccnumberpass() {
		System.out.println("Your account number is : "+accnumber + " and password is: "+password);
	}
	
	protected void authenticate(long password) throws SecurityException {
	    if (this.password != password) {
	        throw new SecurityException("Wrong password");
	    }
	}
	public double getBalance() {
		return balance;
    }
	public void setBalance(double balance) throws InvalidAmountException {
        if (balance < 0) {
            throw new InvalidAmountException("Balance cannot be negative");
        }
        this.balance = balance;
    }
	public long getAccNumber() {
	    return accnumber;
	}

	public boolean verifyPassword(long password) {
	    return this.password == password;
	}
	
	public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount");
        }
        setBalance(balance + amount);
        System.out.println("Cash deposit successful: " + amount);
    }

    public void deposit(double amount, String mode) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount");
        }
        setBalance(balance + amount);
        System.out.println(mode + " deposit successful: " + amount);
    }

    public void withdraw(double amount,long password) throws Exception {
        withdraw(amount,password, "No remarks");
    }

    public abstract void withdraw(double amount,long password, String remarks) throws Exception;
	 
}
