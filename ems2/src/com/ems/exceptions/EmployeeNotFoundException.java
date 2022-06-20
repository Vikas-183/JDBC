package com.ems.exceptions;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {
	private int empid;

	public EmployeeNotFoundException(int empid) {
		this.empid = empid;
	}
	
	public String toString() {
		return "Employee Not Found Exception" + this.empid;
		
	}

}
