package com.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	
	
	EmployeeService service=new EmployeeService();
	
	
	
	public String insertEmployee(Employee employee) {
		
	    return service.insertEmployee(employee);
	}
	
	
	
	public String update(Employee employee) {
		
		return service.update(employee);
	}
	
	
	public String delete(int id) throws SQLException {
		
		return service.delete(id);
	}
	
	
	public Employee getEmployee(int id) {
		
		return service.getEmployee(id);
	}
	
	
	public ArrayList<Employee> getAllEmployee() {
		
		return service.getAllEmployee();
	}
	
	
	

}
