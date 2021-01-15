package com.cg.eis.bean;
/**
 * 
 * @author Jyothi
 * Main class
 *
 */
public class EmployeeMain extends Employe {
private String insuranceSchema;
	public EmployeeMain(int id, String name, Double salary, int designation,String insuranceSchema) {
		super(id, name, salary, designation);
		this.insuranceSchema=insuranceSchema;
	}
	public String getinsuranceSchema() {
		return insuranceSchema;
	}

}