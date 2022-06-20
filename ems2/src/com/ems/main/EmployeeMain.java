package com.ems.main;

import java.util.List;

import com.ems.dto.Employee;
import com.ems.exceptions.EmployeeNotFoundException;
import com.ems.service.EmployeeServiceImpl;
import com.ems.service.IEmployeeService;

public class EmployeeMain {
	public static void main(String[] args) {
		
		IEmployeeService eservice = new EmployeeServiceImpl();
		eservice.addEmployee(new Employee(1, "AKASH", "MANAGER", 28));
		eservice.addEmployee(new Employee(2, "MSD", "SENIOR MANAGER", 20));
		eservice.addEmployee(new Employee(3, "ROHIT", "CLERK", 26));
		eservice.addEmployee(new Employee(4, "VIRAT", "SALESMAN", 24));
		
		System.out.println(" ");
		
		List<Employee> elist = eservice.showAllEmployees();
		for(Employee e : elist) {
			System.out.println(e.getEmpid()+":"+e.getEmpname()+":"+e.getDesignation()+":"+e.getDaysAttended());
		}
	System.out.println(" ");
	
	eservice.deleteEmployee(3);
	
	eservice.updateEmployee(new Employee(1,"updated", "sr.clerk",29));
	try {
		Employee temp = eservice.findEmployee(new Employee(1,"updated", "sr.clerk",29));
		System.out.println(temp.getEmpid()+" "+temp.getEmpname());
	} catch (EmployeeNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}

}
