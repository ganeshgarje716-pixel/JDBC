package com.Service;

import java.util.ArrayList;
import java.util.List;

import com.Dao.ProductDao;
import com.Entity.Product;

public class ProductService {
	
	ProductDao dao=new ProductDao();
	
	
	public String insert(Product product) {
		
		return dao.insertProduct(product);
	}
	
	
	public String update(Product product) {
		
		return dao.updateProduct(product);
	}
	
	
	public String delete(int id) {
		
		return dao.deleteProduct(id);
	}
	
	
	public Product get(int id) {
		
		return dao.getProduct(id);
	}
	
	
	public ArrayList<Product> getAll() {
		
		return dao.getAllProduct();
	}

}
