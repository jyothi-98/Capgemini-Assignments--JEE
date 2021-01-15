package com.cg.account.service;


import java.util.List;
import com.cg.account.exception.*;
import com.cg.account.domain.Account;
import com.cg.account.exception.InsuffientBalanaceException;
import com.cg.account.exception.InvalidAccountNumberException;

/**
 * This AccountService Interface will perform all the Account Related
 * Opearations.
 * 
 * @author panka
 *
 */
public interface AccountService {

	int ACCOUNT_TYPE_SAVING_ACCOUNT = 1;
	int ACCOUNT_TYPE_CURRENT_ACCOUNT = 2;

	/**
	 * This createAccount method will create Account based on below informations
	 * @param accType the type of account user would like to open
	 * @param openingBalance is the starting balance of account as per account type
	 */
	void createAccount( int accType,String accountHolder);

	/**
	 * This depositeMoney method will deposite the specified amount in the specified accout type and accountNumber.
	 * @param accNo of the user, where amount will be added, and balance will be updated.
	 * @param accType type fo the account user is holding
	 * @param amount that user is depositing in the account
	 * @throws InvalidAccountNumberException will be thrown in case amount is supposed to be added in wrong account no.
	 */
	void depositeMoney(Long accNo, int accType, double amount) throws InvalidAccountNumberException;

	/**
	 * 
	 * @param accNo
	 * @param accType
	 * @param amount
	 * @throws InvalidAccountNumberException
	 * @throws InsuffientBalanaceException
	 */
	void withdrawMoney(Long accNo, int accType, double amount)
			throws InvalidAccountNumberException, InsuffientBalanaceException;

	/**
	 * 
	 * @param accNo
	 * @param accType
	 * @throws InvalidAccountNumberException
	 */
	Account displayAccountStatus(Long accNo, int accType) throws InvalidAccountNumberException;
	
	List<Account> showAllAccounts();
	
	

}