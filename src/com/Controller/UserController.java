package com.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.User;
import com.Service.UserService;

public class UserController {

	
	UserService service=new UserService();
	
	
	
	public String insertUser(User user) {
		
		return service.insertUser(user);
	}
	
	
	public String updateUser(User user) {
		
		return service.updateUser(user);
	}
	
	
	public String deleteUser(String strig) throws SQLException {
		
		return service.deleteUser(strig);
	}
	
	
	public User getUser(String string) {
		
		return service.getUser(string);
	}
	
	
	public ArrayList<User> getAllUser() {
		
		return service.getAllUser();
	}
	
}
