package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Dao.EmployeeDao;
import com.Exception.EmployeeIsNullException;
import com.Exception.EmployeeNotFoundException;
import com.Exception.EmployeesNotFoundException;
import com.Exception.SomthingWentWrongException;
import com.entity.Employee;

public class EmployeeService {
	
	
	EmployeeDao dao=new EmployeeDao();
	
	
	public String insertEmployee(Employee employee) {
		
		if (employee == null) {
			
			throw new EmployeeIsNullException("Employee is null");
		}
		String msg = dao.insertEmployee(employee);
		
		return msg;
	}
	
	
	public String update(Employee employee) {
		
		String msg = dao.update(employee);
		
		if (msg==null) {
			
			throw new SomthingWentWrongException("Cheak your sql query again");
		}
		
		return msg;
	}
	
	
	public String delete(int id) throws SQLException {
		
		String msg = dao.delete(id);
		
        if (msg==null) {
			
			throw new SQLException("Id Not Found");
		}
		
		return msg;
	}
	
	
	
	public Employee getEmployee(int id) {
		
		Employee employee = dao.getEmployee(id);
		
		if (employee == null) {
			
			throw new EmployeeNotFoundException("Employee Not Found With Id = "+id);
		}
		
		return employee;
	}
	
	
	public ArrayList<Employee> getAllEmployee() {
		
		ArrayList<Employee> employee = dao.getAllEmployee();
		
		if (employee.isEmpty()) {
			
			throw new EmployeesNotFoundException("No Employee Present in DB");
		}
		
		return employee;
	}
	
	
	
	
	

}
