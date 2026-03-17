package bankingsystem.exceptions;

/**
 * Exception thrown for authentication/security violations
 */
public class AuthenticationException extends Exception {
	/**
	 * Constructor
	 * @param message Error message
	 */
	public AuthenticationException(String message) {
		super(message);
	}
}
