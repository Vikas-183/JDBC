package com.ems.service;

import java.util.List;

import com.ems.dao.EmployeeDAOMysqlImpl;
import com.ems.dao.IEmployeeDAO;
import com.ems.dto.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements IEmployeeService {
	
	private IEmployeeDAO empDao = new EmployeeDAOMysqlImpl(); 

	@Override
	public void addEmployee(Employee e) {
		empDao.addEmployee(e);
		
	}

	@Override
	public void deleteEmployee(int empid) {
		empDao.deleteEmployee(empid);
		
	}

	@Override
	public void updateEmployee(Employee e) {
		empDao.updateEmployee(e);
		
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		empDao.findEmployee(e);
		return empDao.findEmployee(e);
	}

	@Override
	public List<Employee> showAllEmployees() {
		empDao.showAllEmployees();
		return empDao.showAllEmployees();
	}

}
