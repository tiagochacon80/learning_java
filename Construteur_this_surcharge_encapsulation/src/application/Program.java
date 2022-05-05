package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");		
		String name = sc.nextLine();		
		System.out.print("Price: ");
		double price = sc.nextDouble();		
		Product product = new Product(name, price);
		//Como foi criado um construtor a instancia�ao acontece depois da leitura dos dados(name, price, quantity)
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print("Update data: " + product);
		System.out.println();
		
		System.out.println();
		System.out.print("Enter the numbers of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
			
		sc.close();
	}
}
