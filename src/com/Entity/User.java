package com.Entity;

public class User {
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String gender;
	
	private String dob;
	
	private float mobileNo;
	
	private String address;
	
	private int age;

	
	
	public User(String username, String password, String email, String gender, String dob, float mobileNo,
			String address, int age) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.address = address;
		this.age = age;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public float getMobileNo() {
		return mobileNo;
	}



	public void setMobileNo(float mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", gender=" + gender
				+ ", dob=" + dob + ", mobileNo=" + mobileNo + ", address=" + address + ", age=" + age + "]";
	}
	
	
	
	
	

}
