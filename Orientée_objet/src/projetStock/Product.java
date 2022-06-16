package projetStock;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	
	public void addProducts(int quantity) {
		quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		quantity -= quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
}
