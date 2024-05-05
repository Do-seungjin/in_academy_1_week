package pkg04_self.practice.exception;

public class InvalidCredentialsException extends Exception{
	public InvalidCredentialsException() {}
	public InvalidCredentialsException(String message) {
		super(message);
	}
}
