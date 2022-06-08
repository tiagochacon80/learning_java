package projectTax;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();
		
		for(int i=1; i<=taxPayers; i++) {
			System.out.println();
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c): ");
			char ch = sc.next().charAt(0);			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(ch == 'i') {				
				System.out.print("Health expenditures: ");
				double healthExpen = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpen));
			} 
			else {				
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployee));
			}			
		}
		//Total por individuo
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer tx : list) {			
			System.out.println(tx.getName() + ": $ " + String.format("%.2f", tx.tax()));			
		}			
		//Total des taxas
		System.out.println();
		double sum = 0.0;
		for(TaxPayer tx : list) {
			sum += tx.tax();
			System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		}		
		sc.close();
	}
}
