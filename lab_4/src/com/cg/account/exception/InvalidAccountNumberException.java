package com.cg.account.exception;

public class InvalidAccountNumberException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creating InvalidAccountNumberException object without error message
	 */
	public InvalidAccountNumberException() {
		super();
	}
	
	/**
	 * Creating InvalidAccountNumberException object with error message
	 */
	public InvalidAccountNumberException(String errMsg) {
		super(errMsg);
	}

}