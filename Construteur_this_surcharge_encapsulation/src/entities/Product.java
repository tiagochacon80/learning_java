package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	//Construteur
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Construteur de surcharge 
	public Product(String name, double price) {
		this.name = name;
		this.price = price;	
		quantity = 0;
		//Cette variable est optionnel, Java commence toujours un entier avec 0
	}
	
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
