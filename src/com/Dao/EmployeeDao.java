package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.entity.Employee;
import com.jdbcConnection.JDBCUtil;

public class EmployeeDao {
	

	
	
	static Connection con= JDBCUtil.createConnection();
	
	
//	public static void createTable() {
//		
//		try {
//			
//			Statement st =con.createStatement();
//			
//			st.execute("create table employee(id int, name varchar(34), salary double, dep varchar(34), gender varchar(34), city varchar(34))");
//			
//			System.out.println("Table created");
//		}
//		catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
//	
//	
	
	
	
	public String insertEmployee(Employee employee) {
		
		try {
			
//			Statement st = con.createStatement();
			
			PreparedStatement pst= con.prepareStatement("insert into Employee values(?,?,?,?,?,?)");
			
				pst.setInt(1, employee.getId());
				pst.setString(2, employee.getName());
				pst.setDouble(3, employee.getSalary());
				pst.setString(4, employee.getDep());
				pst.setString(5, employee.getGender());
				pst.setString(6, employee.getCity());
				
				pst.execute(); 
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Employee Inserted Successfully";
		
	}
	
	
	public String update(Employee employee) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("update Employee set name=?, salary=?, gender=?, dep=?, city=? where id=? ");
				
			pst.setString(1, employee.getName());
			pst.setDouble(2, employee.getSalary());
			pst.setString(3, employee.getGender());
			pst.setString(4, employee.getDep());
			pst.setString(5, employee.getCity());
			pst.setInt(6, employee.getId());
			
			int value = pst.executeUpdate();
			
			if (value>0) {
				
				return "Employee Update Successfully";
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	public String delete(int id) {
		
		try {
			
			PreparedStatement pst =con.prepareStatement("delete from employee where id=?");
			
			pst.setInt(1, id);
			
			int value = pst.executeUpdate();
			
			if (value>0) {
				
				return "Employee delete Successfully";
			}
				
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;  
	}
	
	
	public Employee getEmployee(int id) {
		
		Employee employee = null;
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from Employee where id=?");
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			double salary = rs.getDouble("salary");
			String dep = rs.getString("dep");	
			String gender = rs.getString("gender");
			String city = rs.getString("city");
			
			 employee=new Employee(id1, name, salary, dep, gender, city);
			}
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return employee;
	}

	
	
     public ArrayList<Employee> getAllEmployee() {
		
    	 ArrayList<Employee> employees=new ArrayList<Employee>();
    	 
		Employee employee = null;
		
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from Employee");
			
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			double salary = rs.getDouble("salary");
			String dep = rs.getString("dep");	
			String gender = rs.getString("gender");
			String city = rs.getString("city");
			
			employee=new Employee(id1, name, salary, dep, gender, city);
			
			employees.add(employee);
			}
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return employees;
	}


	
	
	
	
	
	
	
		
		
		
	}
	


