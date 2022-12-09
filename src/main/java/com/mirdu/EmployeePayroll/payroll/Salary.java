package com.mirdu.EmployeePayroll.payroll;

import org.springframework.stereotype.Component;

@Component
public class Salary {
	private int bp;
	private int da;
	private int hra;
	private int pf;
	public Salary() {
		super();
		bp = 25000;
		da = 3000;
		hra = 12000;
		pf = 2000;
	}
	@Override
	public String toString() {
		return "Salary [bp=" + bp + ", da=" + da + ", hra=" + hra + ", pf=" + pf + "]";
	}
	public Salary(int bp, int da, int hra, int pf) {
		super();
		this.bp = bp;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
	}
	public int getBp() {
		return bp;
	}
	public void setBp(int bp) {
		this.bp = bp;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	
}
