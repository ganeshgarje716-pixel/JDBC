package com.Main;

import java.util.ArrayList;
import java.util.Scanner;

import com.Controller.BookController;
import com.Entity.Book;

public class BookMain {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		BookController controller=new BookController();
		
		
		while (true) {
			
			System.out.println("1.Insert Book");
			System.out.println("2.Update Book By Id");
			System.out.println("3.Delete Book By Id");
			System.out.println("4.get Book By Id");
			System.out.println("5.Get All Books");
			System.out.println("6.Try Again");
			System.out.println("7.Exit");
			
			System.out.println("Enter Your Choise = ");
			int no=sc.nextInt();
			
			
			if (no == 1) {
				
				System.out.println("Enter Id =" );
				int id=sc.nextInt();
				
				System.out.println("Enter Book Name =" );
				String name=sc.next();
				
				System.out.println("Enter Price =" );
				int price=sc.nextInt();
				
				System.out.println("Enter Author =" );
				String author=sc.next();
				
				System.out.println("Enter Qty =" );
				int qty=sc.nextInt();
				
				System.out.println("Enter Mfg Date =" );
				String mfg=sc.next();
				
				System.out.println("Enter Exp date =" );
				String exp=sc.next();
				
				try {
					
					Book b=new Book(id, name, price, author, qty, mfg, exp);
					 
					System.out.println(controller.insert(b));
				}
				catch (Exception e) {
					
					System.out.println(e.getMessage());
					
					e.printStackTrace();
				}
			
			break;	
			}
			
			
			else if (no == 2) {
				
				
				System.out.println("Enter Id =" );
				int id=sc.nextInt();
				
				System.out.println("Enter Book Name =" );
				String name=sc.next();
				
				System.out.println("Enter Price =" );
				int price=sc.nextInt();
				
				System.out.println("Enter Author =" );
				String author=sc.next();
				
				System.out.println("Enter Qty =" );
				int qty=sc.nextInt();
				
				System.out.println("Enter Mfg Date =" );
				String mfg=sc.next();
				
				System.out.println("Enter Exp date =" );
				String exp=sc.next();
				
				try {
					
					Book b=new Book(id, name, price, author, qty, mfg, exp);
					
					System.out.println(controller.update(b));
				}
				catch (Exception e) {
					
					System.out.println(e.getMessage());
					
					e.printStackTrace();
				}
			
			break;		
			}
			
			
			else if (no == 3) {
				
				System.out.println("Enter Id =" );
				int id=sc.nextInt();
				
				try {
					
					System.out.println(controller.delete(id));
				}
				catch (Exception e) {
					
					System.out.println(e.getMessage());
					
					e.printStackTrace();
				}
				
			break;	 
			}
			
			
			else if (no == 4) {
				
				System.out.println("Enter Id =" );
				int id=sc.nextInt();
				
				try {
					
					Book book = controller.get(id);
					
					System.out.println("Id       = "+book.getId());
					System.out.println("Name     = "+book.getName());
					System.out.println("Price    = "+book.getPrice());
					System.out.println("Author   = "+book.getAuthor());
					System.out.println("Qty      = "+book.getQty());
					System.out.println("Mfg Date = "+book.getMfgDate());
					System.out.println("Ex Date  = "+book.getExDate());
					
				}
				catch (Exception e) {
					
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
			break;		
			}
			
			
			else if (no == 5) {
				
				try {
					
					ArrayList<Book> all = controller.getAll();
					
					for (Book book : all) {
						
						System.out.println("Id       = "+book.getId());
						System.out.println("Name     = "+book.getName());
						System.out.println("Price    = "+book.getPrice());
						System.out.println("Author   = "+book.getAuthor());
						System.out.println("Qty      = "+book.getQty());
						System.out.println("Mfg Date = "+book.getMfgDate());
						System.out.println("Ex Date  = "+book.getExDate());
						
						System.out.println("======================================");
					}
					
				} 
				catch (Exception e) {
					
					System.out.println(e.getMessage());
					
					e.printStackTrace();
				}
				
			break;	
			}
			
			
			
			else if (no == 6) {
				
				
			}
			
			else if (no == 7) {
				
				System.out.println("Thank You");
			
			break;	
			}
			
			
			else {
				
				System.out.println(no+" is Not Given Choise Try Again ");
				
				System.out.println("==========================================");
				
			break;	
			}
		}
		
		
	}

}
