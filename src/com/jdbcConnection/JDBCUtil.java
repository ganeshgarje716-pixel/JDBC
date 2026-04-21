package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	
	private static final String url="jdbc:mysql://localhost:3306/garje";
	private static final String username="root";
	private static final String password="garje@716Garje";
	
	public static Connection createConnection() {
		
		Connection con=null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 con = DriverManager.getConnection(url, username, password);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
	}

}
