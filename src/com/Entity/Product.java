package com.Entity;

public class Product {

	
	private int id;
	
	private String name;
	
	private float price;
	
	private String category;
	
	private int qty;
	

	public Product(int id, String name, float price, String category, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.qty = qty;
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


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", qty=" + qty
				+ "]";
	}
	
	
	
	
	
}
