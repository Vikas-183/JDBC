package com.ems.bussiness;

import com.ems.dto.Employee;

public class PermanentEmployeeSalaryCalculator extends SalaryCalculator{
	
public void calculateNetSalary(Employee e, int actualSalary) {
	int grossSalary = getGrossSalary(e, actualSalary);
	int incomeTax = 1000;
	int pf = 800;
	int gratuity = 100;
	int netSalary = grossSalary - (incomeTax + pf + gratuity);
	
	System.out.println("Permanent Employee Salary Details");
	System.out.println("Empid = "+ e.getEmpid());
	System.out.println("Empname = "+ e.getEmpname());
	System.out.println("designation = "+ e.getDesignation());
	System.out.println("Gross Salary = "+ grossSalary);
	System.out.println("Net Salary = "+ netSalary);
	System.out.println("Deductions = "+ (pf + incomeTax + gratuity));
}
}