package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	//Ajoute le produit dans l'inventaire
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	//remove le produit dans l'inventaire
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
