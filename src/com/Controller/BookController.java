package com.Controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Book;
import com.Service.BookService;

public class BookController {
	
	BookService service=new BookService();
	
	
	public String insert(Book book) {
		
		return service.insert(book);
	}
	
	
	public String update(Book book) {
		
		return service.update(book);
	}
	
	
	public String delete(int id) throws SQLException {
		
		return service.delete(id);
	}
	
	
	public Book get(int id) {
		
		return service.get(id);
	}
	
	
	public ArrayList<Book> getAll() {
		
		return service.getAll();
	}

}
