package com.ems.bussiness;

import com.ems.dto.Employee;

public class ContractEmployeeSalaryCalculator extends SalaryCalculator {
	
public void calculateNetSalary(Employee e, int actualSalary) {
	int grossSalary = getGrossSalary(e, actualSalary);
	int tds =2000;
	int netSalary = grossSalary - tds;
	
	System.out.println("Contract Employee Salary Details");
	System.out.println("Empid = "+ e.getEmpid());
	System.out.println("Empname = "+ e.getEmpname());
	System.out.println("designation = "+ e.getDesignation());
	System.out.println("Gross Salary = "+ grossSalary);
	System.out.println("Net Salary = "+ netSalary);
	System.out.println("Deductions = "+ tds );
}
		
}


