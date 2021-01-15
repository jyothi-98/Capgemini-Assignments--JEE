import java.util.*;

import com.cg.eis.exception.EmployeeException;
public class Employee {
	public static  void checkName(String lastname,String fristname)throws NameException{
		if(lastname.length()==0 && fristname.length()==0) {
			throw new NameException("name should not be empty");
		}
		else {
			System.out.println("name should be valid");
	
			System.out.println(fristname.concat(lastname));
		}
		
		}

	   
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int age=0,salary=0;
		System.out.println("Enter Employee age");
		try {
		 age=sc.nextInt();
		if(age<15){
			throw new InvalidAgeException("Invalid age.");
		}
	}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Enter Employee firstname");
		
			String firstname=sc.next();
			System.out.println("Enter Employee lastname");
			
			
			String lastname=sc.next();
			 
			try {
				checkName(lastname,firstname);
			}
			catch(NameException exception) {
				System.out.println(exception);
			}
			

		System.out.println("Enter Employee salary");
		try {
		 salary=sc.nextInt();
		if(salary<3000){
			throw new EmployeeException("Salary is low");
		}
	}
		catch(EmployeeException ex){
			System.out.println(ex.getMessage());
		}
		
			
		}
}

