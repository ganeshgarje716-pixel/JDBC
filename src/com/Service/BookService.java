package com.Service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Dao.BookDao;
import com.Entity.Book;
import com.Exception.BookIsNullException;
import com.Exception.BookNotFoundExceptin;
import com.Exception.BooksNotFoundException;
import com.Exception.SonthingWentWrongException;

public class BookService {

	
	BookDao dao=new BookDao();
	
	
	public String insert(Book book) {
		
		if (book == null) {
			
			throw new BookIsNullException("Book is Null");
		}
		 String msg = dao.insertBook(book);
		 
		 return msg;
	}
	
	
	public String update(Book book) {
		
		 String msg = dao.updateBook(book);
		
		if (msg == null) {
			
			throw new SonthingWentWrongException("Cheak Your SQL Query Again");
		}
		return msg;
	}
	
	
	public String delete(int id) throws SQLException {
		
		String msg = dao.deleteBook(id);
		
		if (msg == null) {
			
			throw new SQLException("Id Not Found");
		}
		return msg;
	}
	
	
	public Book get(int id) {
		
		 Book book = dao.getBook(id);
		 
		 if (book == null) {
			 
			throw new BookNotFoundExceptin("Book Not Found With Id = "+id);
		}
		 
		 return book;
	}
	
	
	public ArrayList<Book> getAll() {
		
		 ArrayList<Book> books= dao.getAllBook();
		 
		 if (books == null) {
			 
			throw new BooksNotFoundException("No Books Present in DB ");
		}
		 
		 return books;
	}
	
	
	
}
