package foodordersystem.exceptions;

public class InvalidOrderException extends Exception {

	public InvalidOrderException() {
		System.out.println("Invalid order pls check again the iteams");
	}

	public InvalidOrderException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	

}
