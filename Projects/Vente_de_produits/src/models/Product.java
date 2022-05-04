package models;

public class Product {
	private int id;
	private String description;
	
	public Product(int id, String description) {
		this.description = description;
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;		
	}
		
}
