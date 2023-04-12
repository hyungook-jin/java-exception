package sample02;

/**
 * 사용자정의 Unchecked예외클래스다.
 * @author ASUS
 *
 */
public class CustomException extends RuntimeException{
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message, Throwable cause) {
		super(message, cause);
		
	}
	
}
