package ex003;
/* Make a program that reads and validates the following information:
Name: greater than 3 characters;
Age: between 0 and 150;
Salary: greater than zero;
Gender: 'f' or 'm';
Civil Status: 's', 'c', 'v', 'd';
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double salary;
		String gender;
		String civilStatus;
		
		do {
			System.out.print("Type your name: ");
			name = sc.next();			
		} while (name.length() <= 3);
		
		do {
			System.out.print("Type your age: ");
			age = sc.nextInt();
		} while (age < 0 || age > 150);
		
		do {
			System.out.print("Type your salary: ");
			salary = sc.nextDouble();
		} while (salary < 0);
		
		do {
			System.out.print("Type your gender: ");
			gender = sc.next();
		} while (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("w"));
		
		do {
			System.out.print("Type your civil status: ");
			civilStatus = sc.next();			
		} while (!civilStatus.equalsIgnoreCase("s") && 
				 !civilStatus.equalsIgnoreCase("c") &&
				 !civilStatus.equalsIgnoreCase("v") && 
				 !civilStatus.equalsIgnoreCase("d"));
	}
}
