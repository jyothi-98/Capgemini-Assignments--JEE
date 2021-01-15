package com.cg.account.domain;

/**
 * This CurrentAccount will be used as data traveller object
 * @author Jyothi
 *
 */
public class CurrentAccount extends Account{

	private double overDrawLimit;
	public CurrentAccount(final Long accNo, final String accountHolder,final double overDrawLimit) {
		super(accNo, accountHolder);
		this.overDrawLimit =  overDrawLimit;
	}
	
	public double getOverDrawLimit() {
		return overDrawLimit;
	}

}