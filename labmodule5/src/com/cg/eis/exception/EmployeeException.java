package com.cg.eis.exception;

public class EmployeeException extends Exception {
	public EmployeeException(String s)
    {
        // Call constructor of parent Exception
        super(s);
        System.out.println("Salary is below 3000");
    }

}