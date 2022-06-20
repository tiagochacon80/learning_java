package employeeSalary;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();		
		
		System.out.println("First employee data: ");
		e1.name = sc.next(); 
		e1.valuePerHour = sc.nextDouble();
		e1.hour = sc.nextInt();
		
		System.out.println("Second employee data: ");
		e2.name = sc.next();
		e2.valuePerHour = sc.nextDouble();
		e2.hour = sc.nextInt();
		
		double total = e1.total() + e2.total();
		
		System.out.printf("Total = %.2f%n", total);		
		
		sc.close();
	}
}
