package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Entity.Product;
import com.jdbcConnection.JDBCUtil;

public class ProductDao {
	
//	public static void main(String[] args) {
//		 
//		ProductDao p=new ProductDao();
//		p.createtable();
//	}
	
	
	static Connection con = JDBCUtil.createConnection(); 
	
	
//	public static void createtable() {
//		
//		try {
//			
//			PreparedStatement pst = con.prepareStatement("create table Product( id int, name varchar(34), price float, category varchar(34), qty int)");
//			
//			pst.executeUpdate();
//			
//			System.out.println("Create Table");
//		}
//		catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//
//	}
	
	
	
	public String insertProduct(Product product) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("insert into product values(?,?,?,?,?)");
			
			pst.setInt(1, product.getId());
			pst.setString(2, product.getName());
			pst.setFloat(3, product.getPrice());
			pst.setString(4, product.getCategory());
			pst.setInt(5, product.getQty());
			
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Product Inserted Successfully"; 
	}
	
	
	public String updateProduct(Product product) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("update product set name=?, price=?, category=?, qty=? where id=?");
			
			pst.setString(1, product.getName());
			pst.setFloat(2, product.getPrice());
			pst.setString(3, product.getCategory());
			pst.setInt(4, product.getQty());
			pst.setInt(5, product.getId());
			
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Product Update Successfully";
	}
	
	
	public String deleteProduct(int id) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("delete from product where id=?");
			
			pst.setInt(1, id);
			
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Product  delete Successfully";
	}
	
	
	public Product getProduct(int id) {
		
		Product product = null;
		
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from product where id=? ");
			
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				Float price = rs.getFloat("price");
				String category = rs.getString("category");
				int qty = rs.getInt("qty");
				
				 product=new Product(id1, name, price, category, qty);
			}
	
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return product;
	}

	
	public ArrayList<Product> getAllProduct() {
		
		ArrayList<Product> all=new ArrayList<Product>();
		
		Product product = null;
		
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from product");
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				Float price = rs.getFloat("price");
				String category = rs.getString("category");
				int qty = rs.getInt("qty");
				
				 product=new Product(id1, name, price, category, qty);
				 
				 all.add(product);
				
			}
	
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return all;
	}

			
			

}
