package ex004;
//Assuming that the population of country A is of the order of 80,000 inhabitants with an annual growth rate of 3% and that the population of B is 200,000 inhabitants with a growth rate of 1.5%. Make a program that calculates and writes the number of years needed for the population of country A to exceed or equal the population of country B, while maintaining growth rates.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double inhabitantsA = 80000;
		double rateA = (1*0.03);
		double inhabitantsB = 200000;
		double rateB = (1*0.015);
		
		int count = 0;
		
		do {
			count += 1;
			inhabitantsA = inhabitantsA + (inhabitantsA * rateA);
			inhabitantsB = inhabitantsB + (inhabitantsB * rateB);
		}while (inhabitantsA < inhabitantsB);
		
		System.out.println("The inhabitants 'A' is equal or bigger than inhabitants 'B' in " + count + " years.");
		System.out.printf("Inhabitants A = %.2f%n", inhabitantsA);
		System.out.printf("Inhabitants B = %.2f%n", inhabitantsB);
		

	}
}
