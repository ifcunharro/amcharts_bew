package es.uvigo.esei.amchartsJava.core.exceptions;


public class MalFormedPatternException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public MalFormedPatternException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public MalFormedPatternException() {
		super();
	}
}
