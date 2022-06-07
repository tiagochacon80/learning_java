package projectProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(type == 'c') {
				list.add(new Product(name, price));
			}
			else if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");				
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));				
			} 
			else {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			}			
		}
		
		System.out.println("PRICE TAGS:");
		//Para cada produto na minha lista prod, imprima prod e o preço
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
