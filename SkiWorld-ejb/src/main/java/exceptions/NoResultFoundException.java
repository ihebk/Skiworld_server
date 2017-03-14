package exceptions;

import javax.ejb.ApplicationException;

@ApplicationException
public class NoResultFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoResultFoundException() {
		System.out.println("Exceeeptionnnn");
	//	super();
		// TODO Auto-generated constructor stub
	}

}
