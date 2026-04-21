package com.Service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Dao.UserDao;
import com.Entity.User;
import com.Exception.SomthingWentWorngException;
import com.Exception.UserIsNullException;
import com.Exception.UserNotFoundException;

public class UserService {
	
	
	UserDao dao=new UserDao();
	
	
	public String insertUser(User user) {
		
		if (user == null) {
			
			throw new UserIsNullException("User is Null");
		}
		String msg = dao.insertUser(user);
		
		return msg;
	}
	
	
	public String updateUser(User user) {
		
		String msg = dao.updateUser(user);
		
		if (msg == null) {
			
			throw new SomthingWentWorngException("Cheak your SQL Query Again"); 
		}
		
		return msg;
	}
	
	
	public String deleteUser(String string) throws SQLException  {
		
		String msg = dao.deleteUser(string);
		
		if (msg == null) {
			
			throw new SQLException("Id Not Found");
		}
		return msg;
	}
	
	
	public User getUser(String string) {
		
		User user = dao.getUser(string);
		
		if (user == null) {
			
			throw new UserNotFoundException("User Not Found With Email = "+string);
		}
		return user;
	}
	
	
	public ArrayList<User> getAllUser() {
		
		ArrayList<User> user = dao.getAllUser();
		
		if (user.isEmpty()) {
			
			throw new UsersNotFoundException("NO User Present in DB");
		}
		return user;
	}

	
	
	
}
