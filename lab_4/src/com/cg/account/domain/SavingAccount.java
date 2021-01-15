package com.cg.account.domain;

/**
 * This SavingAccount will be used as data traveller object
 * @author jyothi
 *
 */
public class SavingAccount extends Account{
	
	private double balance;
	
	public SavingAccount(final Long accNo, final String accountHolder, final double balance) {
		super(accNo, accountHolder);
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
}