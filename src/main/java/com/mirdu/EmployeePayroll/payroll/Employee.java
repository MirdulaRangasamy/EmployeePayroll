package com.mirdu.EmployeePayroll.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="prototype")
public class Employee {
	private int empid;
	private String empname;
	private String empdept;
	@Autowired
	private Salary salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, String empdept, Salary salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", salary=" + salary
				+ "]";
	}
	
	public void calculateSalary() {
		int tot = salary.getBp()+salary.getDa()+salary.getHra() - salary.getPf();
		System.out.println(empname+" is earning "+tot+ " amount per month");
	}
}
