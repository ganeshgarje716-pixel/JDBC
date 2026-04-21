package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.User;
import com.jdbcConnection.JDBCUtil;

public class UserDao {
	
	
	static Connection con = JDBCUtil.createConnection();
	
	
//	public static void createTable() {
//		
//		try {
//			
//			PreparedStatement pst =con.prepareStatement("create table user(name varchar(34), password varchar(34), email varchar(34), gender varchar(34), dob date, mobileNo float, address varchar(34), age int)");
//			
//	     	pst.execute();
//			
//			System.out.println("create");
//		} 
//		catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
	
	
	
	public String insertUser(User user) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("insert into User values(?,?,?,?,?,?,?,?)");
			
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getGender());
			pst.setString(5, user.getDob());
			pst.setFloat(6, user.getMobileNo());
			pst.setString(7, user.getAddress());
			pst.setInt(8, user.getAge());
			
			pst.executeUpdate();
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "User Insert Successfully";
	}

	
	
	public String updateUser(User user) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("update user set password=?, email=?, gender=?, dob=?, mobileNo=?, address=?, age=? where name=? ");
			
			pst.setString(1, user.getPassword());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getGender());
			pst.setString(4, user.getDob());
			pst.setFloat(5, user.getMobileNo());
			pst.setString(6, user.getAddress());
			pst.setInt(7, user.getAge());
			pst.setString(8, user.getUsername());
			
			int value = pst.executeUpdate();
			
			if (value > 0) {
				
				return "User Update Successfully";
			}
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public String deleteUser(String string) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("delete from user where email=? ");
			
			pst.setString(1, string);
			
		    int value = pst.executeUpdate();
		    
		    if (value > 0) {
				
		    	return "User Delete Successfully";
			}
		    
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
	public User getUser(String string) {
		
		User user = null;
		try {
			
			PreparedStatement pst = con.prepareStatement("Select * from User where email=?");
			
			pst.setString(1, string);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
				String username = rs.getString("name");
				String password = rs.getString("password");
				String email = rs.getString("email");
			    String gender = rs.getString("gender");
				String dob = rs.getString("dob");
				float mobileNo = rs.getFloat("mobileNo");
				String address = rs.getString("address"); 
				int age = rs.getInt("age");
				
			     user=new User(username, password, email, gender, dob, mobileNo, address, age);
			}
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return user;
	}
	
	
	public ArrayList<User> getAllUser() {
		
		ArrayList<User> users=new ArrayList<User>();
		
		User user = null;
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from User");
			
			ResultSet rs = pst.executeQuery();
			
                while (rs.next()) {
				
				String username = rs.getString("name");
				String password = rs.getString("password");
				String email = rs.getString("email");
			    String gender = rs.getString("gender");
				String dob = rs.getString("dob");
				float mobileNo = rs.getFloat("mobileNo");
				String address = rs.getString("address"); 
				int age = rs.getInt("age");
				
			     user=new User(username, password, email, gender, dob, mobileNo, address, age);
			     
			     users.add(user);
			}
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return users;
	}
	
	
	
	
	
	
	
	
}
