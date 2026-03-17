package exception.unchecked;
enum Status { STARTED, STOPPED }
public class CustomUncheckedExcDemo {
	public static void withdraw(double balance,double amount) {
		if(amount>balance) {
			throw new InsufficientException("balance must be greater than amount");
		}
		System.out.println("Money deducted from ur account");
	}
	
	public static void main(String[] args) {
//		try{
//			withdraw(50, 100);
//		}catch (InsufficientException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		try {
//		   return;
//		}finally {
//			System.out.println("ash");
//		}
		Status s = Status.STARTED; 
		s = null; 
		System.out.println();
	}
}
