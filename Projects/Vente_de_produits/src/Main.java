import models.Product;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez la description du nouveau produit: ");
		String description = scanner.nextLine();
		
		System.out.print("Entrez l'ID du nouveau produit: ");
		int id = scanner.nextInt();
		
		Product nouveauProduct = new Product(id, description);
		//nouveauProduct.setId(id);
		//nouveauProduct.setDescription(description);
		
		System.out.println("Le produit a �t� cr�� avec succ�s!");
		System.out.println("---ID: " + nouveauProduct.getId());
		System.out.println("---Description: " + nouveauProduct.getDescription());
	}
}
