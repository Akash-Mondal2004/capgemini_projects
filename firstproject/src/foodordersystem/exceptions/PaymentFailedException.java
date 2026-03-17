package foodordersystem.exceptions;

public class PaymentFailedException extends RuntimeException {

	public PaymentFailedException() {
		// TODO Auto-generated constructor stub
		System.out.println("Payment failed");
	}

	public PaymentFailedException(String msg) {
		super(msg);
	}
}
