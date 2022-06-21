package exNameAge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		while(true) {
			System.out.print("Name: ");
			name = sc.next();
			if (name.equals("0")) break;
			System.out.print("Age: ");
			age = sc.nextInt();			
		}
		System.out.println("Stop!");
	}
}
