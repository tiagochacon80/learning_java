package exMembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.printf("What is the dollar price? %.2f%n", CurrencyConverter.DOLAR);
		
		System.out.printf("How many dollars will be bought? ");
		double dolar = sc.nextDouble();			
		
				
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.valorReal(dolar));			
		
		sc.close();

	}
}
