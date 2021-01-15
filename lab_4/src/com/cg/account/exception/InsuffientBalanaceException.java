package com.cg.account.exception;

public class InsuffientBalanaceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * This will create InsuffientBalanceException class without error message
	 */
	public InsuffientBalanaceException() {
		super();
	}
	
	/**
	 * This will create InsuffientBalanceException class with error message
	 */
	public InsuffientBalanaceException(String errMsg) {
		super(errMsg);
	}

}
