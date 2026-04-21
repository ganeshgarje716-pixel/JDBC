package com.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Controller.ProductController;
import com.Entity.Product;

public class ProductMain {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ProductController controller=new ProductController();
		
		while (true) {
			

			System.out.println("1.Insert Poduct");
			System.out.println("2.Update Poduct By Id");
			System.out.println("3.Delete Poduct By Id");
			System.out.println("4.get Poduct By Id");
			System.out.println("5.Get All Poduct");
			System.out.println("6.Exit");
			
			System.out.println("Enter Your Choise = ");
			int no=sc.nextInt();
			
			
			if (no == 1) {
				
				

				System.out.println("Enter Id =" );
				int id=sc.nextInt();
				
				System.out.println("Enter Name =" );
				String name=sc.next();
				
				System.out.println("Enter Price =" );
				int price=sc.nextInt();
				
				System.out.println("Enter Category =" );
				String category=sc.next();
				
				System.out.println("Enter Qty =" );
				int qty=sc.nextInt();
				
				
				try {
					
					Product p=new Product(id, name, price, category, qty);
					
					System.out.println(controller.insert(p)); 
				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
			break;	
			}
			
			
			else if (no == 2) {
				
				

				System.out.println("Enter Id =" );
				int id=sc.nextInt();
				
				System.out.println("Enter Name =" );
				String name=sc.next();
				
				System.out.println("Enter Price =" );
				int price=sc.nextInt();
				
				System.out.println("Enter Category =" );
				String category=sc.next();
				
				System.out.println("Enter Qty =" );
				int qty=sc.nextInt();
				
				
				try {
					
					Product p=new Product(id, name, price, category, qty);
					
					System.out.println(controller.update(p));
				} 
				catch (Exception e) {
					
					e.printStackTrace();
				}

			break;	
			}
			
			
			if (no == 3) {
				
				
				System.out.println("Enter Id =" );
				int id=sc.nextInt();
				
				
				try {
					
					System.out.println(controller.delete(id));
				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
				
			break;	
			}
			
			
			if (no == 4) {
				
				
				System.out.println("Enter Id =" );
				int id=sc.nextInt();
				
				
				try {
					
					Product p = controller.get(id);
					
				    System.out.println("Id       = "+p.getId());
				    System.out.println("Name     = "+p.getName());
				    System.out.println("Price    = "+p.getPrice());
				    System.out.println("Category = "+p.getCategory());
				    System.out.println("Qty      = "+p.getQty());
				   
				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
				
			break;	
			}
			
			
			if (no == 5) {
				
				
				try {
					
					ArrayList<Product> all = controller.getAll();
					
					for (Product p : all) {
						
						 System.out.println("Id       = "+p.getId());
						 System.out.println("Name     = "+p.getName());
				         System.out.println("Price    = "+p.getPrice());
				    	 System.out.println("Category = "+p.getCategory());
						 System.out.println("Qty      = "+p.getQty());
						 
						 System.out.println("=====================================");
						 
					}
				}
				catch (Exception e) {
					
					e.printStackTrace();
				}
			
			break;	
			}
			
			
			if (no == 6) {
				
					System.out.println("Try Again Yes / No");
					String try_again=sc.next();
					
					if (try_again.equals("No")) {
						
						System.out.println("Thank You");
						
					break;	
					}
					
					else if (try_again.equals("No")) {
						
						
					}
				
			}
			
			
			
		}
		
		
		
	}

}
