package eloiza.springWeb.handler;

public class BusinessException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public BusinessException(String message) {
		super(message);
	}
	
	public BusinessException(String message, Object... params) {
		super(String.format(message,params));
	}
	
}
