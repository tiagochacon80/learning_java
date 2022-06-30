package ex005;

/* Assuming that the population of country A is of the order of 80,000 inhabitants with an annual growth rate of 3% and that the population of B is 200,000 inhabitants with a growth rate of 1.5%. Make a program that calculates and writes the number of years needed for the population of country A to exceed or equal the population of country B, while maintaining growth rates.
Change the previous program allowing the user to inform the initial populations and growth rates. Validate the entry and allow the operation to be repeated.
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		boolean toContinue = false;
		int count = 0;
		
		while(!toContinue) {
			
			System.out.print("Inhabitants country A: ");
			double inhabitantsA = sc.nextDouble();
			double rateA = 1 + 0.03;
			
			System.out.print("Inhabitants country B: ");
			double inhabitantsB = sc.nextDouble();
			double rateB = 1 + 0.015;
			
			do {
				count++;
				inhabitantsA *= rateA;
				inhabitantsB *= rateB;
			} while(inhabitantsA < inhabitantsB);
			
			System.out.printf("Inhabitants A = %.2f%n", inhabitantsA);
			System.out.printf("Inhabitants B = %.2f%n", inhabitantsB);
			System.out.println("The inhabitants 'A' is equal or bigger than inhabitants 'B' in " + count + " years.");
			
			System.out.println();
			System.out.println("Do you want to continue? (Y/N): ");
			String repeat = sc.next();
			
			if(repeat.equalsIgnoreCase("n")) {
				toContinue = true;
			}
		}
	}
}
