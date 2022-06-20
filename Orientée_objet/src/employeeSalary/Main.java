package employeeSalary;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		String name1, name2;
		double valuePerHour1, valuePerHour2, total;
		int hour1, hour2;
		
		System.out.println("First employee data: ");
		name1 = sc.next(); 
		valuePerHour1 = sc.nextDouble();
		hour1 = sc.nextInt();
		
		System.out.println("Second employee data: ");
		name2 = sc.next();
		valuePerHour2 = sc.nextDouble();
		hour2 = sc.nextInt();
		
		total = valuePerHour1 * hour1 + valuePerHour2 * hour2;
		
		System.out.printf("Total = %.2f%n", total);		
		
		sc.close();
	}
}
