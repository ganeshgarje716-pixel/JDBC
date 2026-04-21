package com.Entity;

public class Book {
	
	
	private int id;
	
	private String name;
	
	private int price;
	
	private String author;
	
	private int qty;
	
	private String mfgDate;
	
	private String exDate;

	
	
	public Book(int id, String name, int price, String author, int qty, String mfgDate, String exDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.qty = qty;
		this.mfgDate = mfgDate;
		this.exDate = exDate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}



	public String getMfgDate() {
		return mfgDate;
	}



	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}



	public String getExDate() {
		return exDate;
	}



	public void setExpDate(String expDate) {
		this.exDate = expDate;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", qut=" + qty
				+ ", mfgDate=" + mfgDate + ", expDate=" + exDate + "]";
	}



	

	
	
	
	
	
	
	

}
