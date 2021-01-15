package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employe;
import com.cg.eis.bean.EmployeeMain;
import com.cg.eis.service.EmployeService;
import com.cg.eis.service.EmployeServiceImpl;

/**
 * 
 * @author Jyothi
 * Utility Class
 *
 */

public class EmployeUtility {
private EmployeService employeService;
	public EmployeUtility(){
	
		employeService=new EmployeServiceImpl();
	}

	public void start() {
		int choice;
		Scanner sc=new Scanner(System.in);
		String continueChoice;
		do {
			showMenu();
			System.out.println("Enter Your Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("-----------");
				System.out.println("Enter id");
				int id = sc.nextInt();
				System.out.println("What is your name");
				String name = sc.next();
				System.out.println("Enter salary");
				double salary= sc.nextDouble();
				System.out.println("What is your designation[1.Associate ,2.SeniorAssociate]");
				
				int designation = sc.nextInt();
				
				employeService.createEmploye(id,name,salary,designation);
				System.out.println("Success! Your Details are added");
				break;
				
			case 2:
				System.out.println("------List all account-----");
				List<Employe> employes =  employeService.showAllEmployees();
				for (Employe employe : employes) {
					System.out.println("Employee id: "+employe.getid());
					System.out.println("Name : "+employe.getname());
					System.out.println("Salary: "+employe.getsalary());
					System.out.println("Designation : "+employe.designation());
					System.out.println("Insurance : "+((EmployeeMain) employe).getinsuranceSchema());
						System.out.println("=================================================");
					
				}
				break;
				
			case 0:
				System.exit(0);
				break;
			default:
				break;
			}
			System.out.println("Do you want to continue (yes/no : ");
			continueChoice=sc.next();
			
		}while(continueChoice.equalsIgnoreCase("yes"));
		
	}

	private void showMenu() {
		System.out.println("------------------------");
		System.out.println("1. Enter details");
		System.out.println("2.Display all employee details ");
		System.out.println("3.Exit ");
		
		
	}


}