package com.cg.eis.service;
/**
 * Service Class
 */
import java.util.List;

import com.cg.eis.bean.Employe;

public interface EmployeService  {

	int Associate  =1;
	int SeniorAssociate = 2;

	void createEmploye(int id, String name, double salary, int designation); 
		
	

	List<Employe> showAllEmployees();

}
