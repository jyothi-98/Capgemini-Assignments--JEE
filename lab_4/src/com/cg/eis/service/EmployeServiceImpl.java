package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employe;
import com.cg.eis.bean.EmployeeMain;

public class EmployeServiceImpl implements EmployeService{
private List<Employe> employeRepository;
	
	public EmployeServiceImpl() {
		employeRepository=new ArrayList<>();
	
	}
	
	public void createEmploye(int id, String name, double salary, int designation) {
		Employe newemploye=null;
		
		
		if(designation==1 || salary>=70000) {
			String insurenceSchema = "15%";
			newemploye = new EmployeeMain(id,name,salary,designation,insurenceSchema);
		}
		if(designation==2|| salary<=70000) {
			String insurenceSchema = "10%";
			newemploye = new EmployeeMain(id,name,salary,designation,insurenceSchema);
		
		}
		employeRepository.add(newemploye);
		
	}

	
	

	

	
	public  List<Employe> showAllEmployees() {
		// TODO Auto-generated method stub
		return employeRepository;
	}

}