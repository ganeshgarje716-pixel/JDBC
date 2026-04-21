package com.Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Book;
import com.jdbcConnection.JDBCUtil;

public class BookDao {
	
//	public static void main(String[] args) {
//		
//		BookMain b=new BookMain();
//		b.createTable();
//	}
	
	static Connection con = JDBCUtil.createConnection();
	
	
//	public static String createTable() {
//		
//		try {
//			
//			PreparedStatement pst = con.prepareStatement("create table book(id int, name varchar(34), price int, author varchar(34), qty int, mfgDate date, exDate date)");
//			
//			pst.executeUpdate();
	        
//	        return "Create Table";
//		}
//		catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
	
	
	
	public String insertBook(Book book) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("insert into book values(?,?,?,?,?,?,?)");
			
			pst.setInt(1, book.getId());
			pst.setString(2, book.getName());
			pst.setInt(3, book.getPrice());
			pst.setString(4, book.getAuthor());
			pst.setInt(5, book.getPrice());
			pst.setString(6, book.getMfgDate());
			pst.setString(7, book.getExDate());
			
			pst.executeUpdate();
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Book Inserted Successfully";
	}
	
	
	public String updateBook(Book book) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement(" update book set name=?, price=?, author=?, qty=?, mfgDate=?, exDate=? where id=? ");
			
			pst.setString(1, book.getName());
			pst.setInt(2, book.getPrice());
			pst.setString(3, book.getAuthor());
			pst.setInt(4, book.getQty());
			pst.setString(5, book.getMfgDate());
			pst.setString(6, book.getExDate());
			pst.setInt(7, book.getId());
			
			int value = pst.executeUpdate();
			
			if (value > 0) {
				
				return "Book Update Successfully";
			}
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public String deleteBook(int id) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("delete from book where id=?");
			
			pst.setInt(1, id);
			
			int value = pst.executeUpdate();
			
			if (value > 0) {
				
				return "Book Delete Successfully";
			}	
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	 
    public Book getBook(int id) {
		
		Book book = null;
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from book where id=?");
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			int price =	rs.getInt("price");
			String author = rs.getString("author");
			int qty = rs.getInt("qty");
			String mfgDate = rs.getString("mfgDate");
			String exDate =	rs.getString("exDate");
			
			 book=new Book(id1, name, price, author, qty, mfgDate, exDate);
			}
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return book;
	}
	
    
    public ArrayList<Book> getAllBook() {
		
    	ArrayList<Book> books=new ArrayList<Book>();
    	
		Book book = null;
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from book");
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			int price =	rs.getInt("price");
			String author = rs.getString("author");
			int qty = rs.getInt("qty");
			String mfgDate = rs.getString("mfgDate");
			String exDate =	rs.getString("exDate");
			
			 book=new Book(id1, name, price, author, qty, mfgDate, exDate);
			 
			 books.add(book);
			}
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return books;
	}
	
	
	
	
	
	
	

}
