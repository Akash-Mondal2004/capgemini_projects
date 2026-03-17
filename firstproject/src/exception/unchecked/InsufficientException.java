package exception.unchecked;

public class InsufficientException extends RuntimeException {
	public InsufficientException(String msg) {
		super(msg);
	}
}
