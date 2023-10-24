package custom_exceptions;

@SuppressWarnings("serial")
public class PenStockException extends Exception {
	
	public PenStockException(String mesg) {
		super(mesg);
	}

}
