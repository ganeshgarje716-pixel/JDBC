package com.Main;

import java.util.ArrayList;
import java.util.Scanner;

import com.Controller.UserController;
import com.Entity.User;
import com.Exception.SomthingWentWorngException;

public class UserMain {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		UserController controller=new UserController();
		
		
        while (true) {
			
			System.out.println("1.Insert User");
			System.out.println("2.Update User By Id");
			System.out.println("3.Delete User By Id");
			System.out.println("4.Get User By Email");
			System.out.println("5.Get All User");
			System.out.println("6.Exit");
			
			System.out.println("Enter Your Choise = ");
			int no=sc.nextInt();
		
			
			if (no == 1) {
				
				System.out.println("Enter User Name = ");
				String username=sc.next();
				
				System.out.println("Enter Password =");
				String password=sc.next();
				
				System.out.println("Enter Email =");
				String email=sc.next();
				
				System.out.println("Enter Gender =");
				String gender=sc.next();
				
				System.out.println("Enter DOB =");
				String dob=sc.next();
				
				System.out.println("Enter Mobile No =");
				float mobileNo=sc.nextFloat();
				
				System.out.println("Enter Address =");
				String address=sc.next();
				
				System.out.println("Enter Age =");
				int age=sc.nextInt();
				
			
		try {
			
			User u=new User(username, password, email, gender, dob, mobileNo, address, age);
			
			String msg = controller.insertUser(u);
			
			System.out.println(msg);
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
            break;
			}
			
			
			else if (no == 2) {
				
				System.out.println("Enter User Name = ");
				String username=sc.next();
				
				System.out.println("Enter Password =");
				String password=sc.next();
				
				System.out.println("Enter Email =");
				String email=sc.next();
				
				System.out.println("Enter Gender =");
				String gender=sc.next();
				
				System.out.println("Enter DOB =");
				String dob=sc.next();
				
				System.out.println("Enter Mobile No =");
				float mobileNo=sc.nextFloat();
				
				System.out.println("Enter Address =");
				String address=sc.next();
				
				System.out.println("Enter Age =");
				int age=sc.nextInt();
				
				try {
					
					User u=new User(username, password, email, gender, dob, mobileNo, address, age);
					
					String msg = controller.updateUser(u);
					
					System.out.println(msg);
				}
				catch (SomthingWentWorngException e) {
					
					System.out.println(e.getMessage());
				}
			break;	
			}
			
			
			else if (no == 3) {
				
				System.out.println("Enter Email =");
				String email=sc.next();
			
			try {
				
				System.out.println(controller.deleteUser(email));
			}
			catch (Exception e) {
				
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			break;
			}
			
			
			else if (no == 4) {
				
				
				System.out.println("Enter Email =");
				String email=sc.next();
			
			try {
				
				User user = controller.getUser(email);
				
				System.out.println("User Name = "+user.getUsername());
				System.out.println("Password  = "+user.getPassword());
				System.out.println("Email     = "+user.getEmail());
				System.out.println("Gender    = "+user.getGender());
				System.out.println("DOB       = "+user.getDob());
				System.out.println("Mobile No = "+user.getMobileNo());
				System.out.println("Address   = "+user.getAddress());
				System.out.println("Age       = "+user.getAge());
				
			} 
			catch (Exception e) {
				
				System.out.println(e.getMessage());
			}	
				
			break;	
			}
			
			
			else if (no == 5) {
				
				try {
					
					ArrayList<User> all = controller.getAllUser();
					
					for (User u : all) {
						

						System.out.println("User Name = "+u.getUsername());
						System.out.println("Password  = "+u.getPassword());
						System.out.println("Email     = "+u.getEmail());
						System.out.println("Gender    = "+u.getGender());
						System.out.println("DOB       = "+u.getDob());
						System.out.println("Mobile No = "+u.getMobileNo());
						System.out.println("Address   = "+u.getAddress());
						System.out.println("Age       = "+u.getAge());
						
						System.out.println("===================================");
						
					}
					
				}
				catch (Exception e) {
					
					System.out.println(e.getMessage());
				}
				
			break;		
			}
			
			
			else if (no == 6) {
				
				System.out.println("Thank You");
			
			break;	
			}
			
			
			
			
			
			
			
		 
		 
			
       }
		
		
	}

}
