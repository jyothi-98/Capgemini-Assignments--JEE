package com.cg.eis.bean;
/**
 * 
 * @author Jyothi
 * Getters and setters class
 *
 */
public class Employe {
  private int id;
  private String name;
  private double salary;
  private int designation;
 
  
  public Employe(int id,String name,Double salary, int designation) {
	  this.name=name;
	  this.id=id;
	  this.salary=salary;
	  this.designation=designation;
  }
  
	

	public int getid() {
		// TODO Auto-generated method stub
		return id;
	}
	public void setid() {
		this.id=id;
	}

	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setname() {
		this.name=name;
	}
	

	public double getsalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	public void setsalary() {
		this.salary=salary;
	}
	public int designation() {
		// TODO Auto-generated method stub
		return designation;
	}
	public void setdesignation() {
		this.designation=designation;
	}

	

}