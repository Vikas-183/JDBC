package com.ems.main;

import com.ems.bussiness.ContractEmployeeSalaryCalculator;
import com.ems.bussiness.PermanentEmployeeSalaryCalculator;
import com.ems.dto.Employee;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
		
		PermanentEmployeeSalaryCalculator pe = new PermanentEmployeeSalaryCalculator();
		pe.calculateNetSalary(new Employee(1234,"A","clerk",25), 25000);
		System.out.println("*****");
		
		ContractEmployeeSalaryCalculator ce = new ContractEmployeeSalaryCalculator();
		ce.calculateNetSalary(new Employee(4321,"B","clerk",25), 50000);
	}

}
