package com.cg.account.main;

import com.cg.account.exception.InvalidAccountNumberException;
import com.cg.account.util.MenuUtil;

public class AccountStartup {

	public static void main(String[] args) throws InvalidAccountNumberException {
		MenuUtil menuUtil = new MenuUtil();
		menuUtil.start();

	}

}